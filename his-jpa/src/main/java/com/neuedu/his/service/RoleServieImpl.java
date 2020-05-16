package com.neuedu.his.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.RoleMenuRepository;
import com.neuedu.his.domain.RoleRepository;
import com.neuedu.his.pojo.Role;
import com.neuedu.his.pojo.RoleMenu;

@Service
@Transactional(rollbackOn={RuntimeException.class,Exception.class})
public class RoleServieImpl implements IRoleService {
	@Autowired
    RoleRepository roleRepository;
	@Autowired
	RoleMenuRepository roleMenuRepository;
	
	@Override
	public String save(Role role) throws Exception  {
		try {
			//基本信息的存储，存到t_role
			Role db_role=roleRepository.save(role);
			//float a=1/0;
			if(db_role!=null){
				String menuids=role.getMenuids();//1,2,3
				//将字符串截取成数组
				String[] ids=menuids.split(",");//[1,2,3]
				//循环数组，每循环到一条，向数据库中添加一条数据
				for(String menuid:ids){
					//menuid=1,2,3.....
					RoleMenu rm=new RoleMenu();
					rm.setRoleId(role.getRoleId());
					rm.setMenuId(menuid);
					RoleMenu db_menu=roleMenuRepository.save(rm);
				}
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return "成功";
	}
	@Override
	public Page<Role> findallrole(int currentPage, int pageSize) {
		Pageable pageable=PageRequest.of(currentPage-1, pageSize);
		Page<Role> pagerole=roleRepository.findAll(pageable);
		return pagerole;
	}
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}
	
	
}
