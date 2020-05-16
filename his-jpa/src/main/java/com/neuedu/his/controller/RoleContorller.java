package com.neuedu.his.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.Role;
import com.neuedu.his.service.IRoleService;

@RestController
@RequestMapping("role")
public class RoleContorller {
   @Autowired
	IRoleService roleService;
	
	@RequestMapping("addRole")
	public String addMenu(Role role){
		//添加和修改用的是相同的方法，添加时，请求不携带id，修改需要带id过来。返回的都是数据库里的完整对象
		System.out.println(role);
		String result;
		try {
			result = roleService.save(role);
			return "成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "失败";
		}
		//System.out.println(menuids);
		
	}
	
	@RequestMapping("findAllRole")
	public Page<Role> findallrole(int currentPage,int pageSize){
		Page<Role> menuList=roleService.findallrole(currentPage,pageSize);
		return menuList;
	}
	
	
	@RequestMapping("findAll")
    public List<Role> findAll(){
    List<Role> roleList=roleService.findAll();
    return roleList;
    }
	
}
