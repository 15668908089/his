package com.neuedu.his.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.SchedulingRepository;
import com.neuedu.his.pojo.Scheduling;

@Service
public class SchedulingServiceImpl implements ISchedulingService {

	@Autowired
	SchedulingRepository schedulingRepository;

	// @Override
	// public void addScheduling(List<Scheduling> schedulingVo) {
	// for (Scheduling scheduling : schedulingVo) {
	// Date startDate=scheduling.getStartDate();
	// Date endDate=scheduling.getEndDate();
	// String week=scheduling.getWeek();
	// System.out.println("1、"+scheduling.getStartDate());
	// System.out.println("2、"+scheduling.getEndDate());
	// System.out.println("3、"+scheduling.getWeek());
	//
	// }
	//
	//
	// }
	@Override
	public void addScheduling(List<Scheduling> list) throws Exception {
		try {
			for (Scheduling schedu : list) {
				// 开始时间 结束时间 按天，按上下午进行入库
				saveScheduling(schedu);
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	// 2020-05-11入库 （算当前日期是星期几，截取字符串（上下午），判断1-入库 0放弃）
	// 2020-05-17与2020-05-11相差的天数 6
	// 循环6次 2020-05-12 2020-05-13
	// 每次把当前的时间加1天之后存到排班表 --入库
	public void saveScheduling(Scheduling schedu) throws ParseException {
		// 把开始结束时间转换成时间形式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(schedu.getStartDate());
		// 公共的calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		// 把startDate这一天的情况先入库
		saveCurdate(schedu.getStartDate(), schedu);
		// startDate算完后，计算开始结束时间相差的天数，每次加一天，加n次，入库即可
		// 计算相差的天数
		long between = betweenDays(schedu.getEndDate(), schedu.getStartDate());
		System.out.println("日期相差的天数：" + between);
		if (between > 0) {
			for (int i = 0; i < between; i++) {
				calendar.add(calendar.DATE, 1);// 把日期往后增加一天.整数往后推,负数往前移动
				System.out.println("相加后的日期：" + calendar.getTime());
				saveCurdate(sdf.format(calendar.getTime()), schedu);
			}
		}
	}

	// 计算两个日期相差的天数
	public long betweenDays(String startDate, String endDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(startDate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		Date date2 = sdf.parse(endDate);
		calendar.setTime(date2);
		long betweenDays = (date1.getTime() - date2.getTime()) / (60 * 60 * 24 * 1000);
		// 打印控制台相差的天数
		// System.out.println(betweenDays);
		return betweenDays;
	}

	public void saveCurdate(String curdate, Scheduling schedu) throws ParseException {
		// 1、根据日期计算星期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date curdate_date = sdf.parse(curdate);
		// 把开始结束时间转换成字符串
		Calendar c = Calendar.getInstance();
		c.setTime(curdate_date);
		// 原始返回值：星期1-2 星期2-3 星期3-4 星期5-6 星期6-7 星期7-1
		// 减1后:星期1-1 星期2-1 星期3-3 星期7-0
		int week = c.get(Calendar.DAY_OF_WEEK) - 1;//
		if (week == 0) {
			week = 7;
		}
		System.out.println("星期：" + week);
//		String weekStr = "10101101101011";
		String weekStr = schedu.getWeek();
		
		// 10101101101011
		// 上午截取i*2-2，下午截取i*2-1
		char noon1 = weekStr.charAt(week * 2 - 2);

		Scheduling db_sch = new Scheduling();
		db_sch.setDeptID(schedu.getDeptID());
		db_sch.setRuleId(schedu.getRuleId());
		db_sch.setUserID(schedu.getUserID());
		db_sch.setSchedDate(curdate);

		if (noon1 == '1') {

			db_sch.setNoon("上午");
			System.out.println(curdate + "上午有班");
			// SAVE
			schedulingRepository.save(db_sch);
		}
		char noon2 = weekStr.charAt(week * 2 - 1);
		if (noon2 == '1') {
			schedu.setNoon("下午");
			System.out.println(curdate + "下午有班");
			// SAVE
			schedulingRepository.save(schedu);
		}
	}

}
