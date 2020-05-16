package com.neuedu.his.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neuedu.his.pojo.Department;



public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
