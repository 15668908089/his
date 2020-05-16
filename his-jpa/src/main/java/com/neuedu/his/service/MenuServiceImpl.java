package com.neuedu.his.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.MenuRepository;
import com.neuedu.his.pojo.Menu;
@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
	MenuRepository menuRepository;
	@Override
	public Page<Menu> findAll(int currentPage, int pageSize) {
		//底层page当前页是从0开始，但用户传递的是从1开始，所以需要减1
		Pageable pageable=PageRequest.of(currentPage-1, pageSize);
		Page<Menu> menuList=menuRepository.findAll(pageable);
		return menuList;
	}
	@Override
	public List<Map<String,Object>> findMenuByParentId(String id) {
		return menuRepository.findByParentId(id);
	}
	@Override
	public Menu save(Menu menu) {
		Menu db_menu=menuRepository.save(menu);
		return db_menu;
	}
	
}
