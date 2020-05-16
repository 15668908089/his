package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.ConstantType;
import com.neuedu.his.service.IConstantTypeService;
/**
 * @RestController返回的json类型
 * @author t460p
 *
 */
@RestController
@RequestMapping("constatntType")
public class ConstantTypeController {
	@Autowired
	IConstantTypeService constantTypeService;
	/**
	 * jpa添加和修改用的是同一个方法，
	 * 如果方法的id非空，就做修改操作，如果为空，就自动生成主键做添加的操作
	 * @return json对象
	 */
	@RequestMapping("save")
	public ConstantType save(@RequestBody ConstantType type){
		//如果是添加操作，从数据库返回的实体多了主键列
		ConstantType db_type=constantTypeService.save(type);
		return db_type;
	}
	@RequestMapping("selectAllConstantTypeID")
	public List<ConstantType> selectAllConstantTypeID() {
		List<ConstantType> resultlist = constantTypeService.selectAllConstantTypeID();
		return resultlist;
	}

}
