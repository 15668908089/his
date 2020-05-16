package com.neuedu.his.service;

import java.util.List;

import com.neuedu.his.pojo.Department;

public interface IDepartmentService {

	Department save(Department department);

	List<Department> findAll();

}
