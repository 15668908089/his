package com.neuedu.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.service.ISchedulingService;
import com.neuedu.his.vo.SchedulingVo;

@RestController
@RequestMapping("scheduling")
public class SchedulingController {

	@Autowired
	ISchedulingService schedulingService;
	
	@RequestMapping("addScheduling")
	public String addScheduling(@RequestBody SchedulingVo schedulingVo){
		try {
			schedulingService.addScheduling(schedulingVo.getSchedulings());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "成功";
	}
}
