package com.neuedu.his.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.DepartmentRepository;
import com.neuedu.his.pojo.Department;
@Service
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	@Override
	public Department save(Department department) {
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> findAll() {
		List<Department> department=departmentRepository.findAll();
		return department;
	}

}
