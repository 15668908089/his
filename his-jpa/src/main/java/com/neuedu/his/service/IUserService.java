package com.neuedu.his.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.neuedu.his.pojo.User;


public interface IUserService {

	Page<User> findAll(int currentPage, int pageSize);

	User addUser(User user);

	String findPws(String UserName);

	List<Map<String, Object>> findUserByDeptAndLid(String deptid, String regLid);

	
}
