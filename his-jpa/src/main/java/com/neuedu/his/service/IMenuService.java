package com.neuedu.his.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.neuedu.his.pojo.Menu;

public interface IMenuService {

	public Page<Menu> findAll(int currentPage, int pageSize);

	public List<Map<String,Object>> findMenuByParentId(String id);
	public Menu save(Menu menu);
}
