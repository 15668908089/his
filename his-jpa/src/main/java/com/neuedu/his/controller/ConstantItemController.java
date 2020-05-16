package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.ConstantItem;
import com.neuedu.his.service.IConstantItemService;

@RestController
@RequestMapping("constantItem")
public class ConstantItemController {
	@Autowired
	IConstantItemService service;
	
	@RequestMapping("save")
	public ConstantItem save(@RequestBody ConstantItem type) {
		ConstantItem result = service.save(type);
		return result;
	}
	@RequestMapping("findByTypeId")
	public List<ConstantItem> findByTypeId(String typeid) {
		List<ConstantItem>  result = service.findByConstantTypeID(typeid);
		return result;
	}
	
	@RequestMapping("findAllByTypeName")
	public List<ConstantItem> findAllByTypeName(String typename) {
	List<ConstantItem>  result = service.findAllByTypeName(typename);
	return result;
	}
}
