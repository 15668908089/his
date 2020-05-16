package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.Department;
import com.neuedu.his.service.IDepartmentService;



@RestController
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	IDepartmentService departmentService;
	@RequestMapping("save")
	public Department save(@RequestBody Department department){
		Department departmentResult=departmentService.save(department);
		return departmentResult;
		
	}
	
	@RequestMapping("findAll")
	public List<Department> findAll(){
		List<Department> departmentResult=departmentService.findAll();
		return departmentResult;
		
	}
}
