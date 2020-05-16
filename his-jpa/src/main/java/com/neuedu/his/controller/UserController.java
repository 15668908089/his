package com.neuedu.his.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.User;
import com.neuedu.his.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("findAllUser")
	public Page<User> findAllUser(int currentPage,int pageSize){
		Page<User> users=userService.findAll(currentPage,pageSize);
		return users;
	}
	
	@RequestMapping("addUser")
	public User addUser(@RequestBody User user){
		User users=userService.addUser(user);
		return users;
	}
	
	@RequestMapping("findPws")
	public String findPws(@RequestBody User user){
		String password=userService.findPws(user.getUserName());
		if (password==null) {
			return "用户名错误";
		} else if (password.equals(user.getPassword())) {
			return "登陆成功";
		}else {
			return "密码错误";
		}
	}
	
	@RequestMapping("findUserByDeptAndLid")
	public List<Map<String, Object>> findUserByDeptAndLid(String deptid,String regLid){
		List<Map<String, Object>> list=userService.findUserByDeptAndLid(deptid,regLid);
		return list;
	}
}
