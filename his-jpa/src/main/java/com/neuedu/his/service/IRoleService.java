package com.neuedu.his.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.neuedu.his.pojo.Role;

public interface IRoleService {

	String save(Role role) throws Exception;

	Page<Role> findallrole(int currentPage, int pageSize);

	List<Role> findAll();

}
