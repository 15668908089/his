package com.neuedu.his.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.Menu;
import com.neuedu.his.service.IMenuService;

@RestController
@RequestMapping("menu")
public class MenuContorller {
   @Autowired
	IMenuService menuService;
	@RequestMapping("findAllMenu")
	public Page<Menu> findAllMenu(int currentPage,int pageSize){
		Page<Menu> menuList=menuService.findAll(currentPage,pageSize);
		return menuList;
	}
	
	@RequestMapping("findMenuByParentId")
	public List<Map<String,Object>> findMenuByParentId(String id){
		List<Map<String,Object>> menuList=menuService.findMenuByParentId(id);
		return menuList;
	}
	
	
	@RequestMapping("addMenu")
	public Menu addMenu(@RequestBody Menu menu){
		//添加和修改用的是相同的方法，添加时，请求不携带id，修改需要带id过来。返回的都是数据库里的完整对象
		Menu db_menu=menuService.save(menu);
		return db_menu;
	}
}
