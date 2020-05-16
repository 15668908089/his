package com.neuedu.his.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.UserRepository;
import com.neuedu.his.pojo.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Page<User> findAll(int currentPage, int pageSize) {
		Pageable pageable=PageRequest.of(currentPage-1, pageSize);
		return userRepository.findAll(pageable);
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public String findPws(String UserName) {
		String users=userRepository.findPws(UserName);
		return users;
	}

	@Override
	public List<Map<String, Object>> findUserByDeptAndLid(String deptid, String regLid) {
		return userRepository.findUserByDeptAndLid(deptid,regLid);
	}

}
