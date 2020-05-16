package com.neuedu.his.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.RegistLevelResponsitory;
import com.neuedu.his.pojo.RegistLevel;

import com.neuedu.his.service.IRegistLevelService;
@Service
public class RegistLevelServiceImpl implements IRegistLevelService {
	@Autowired
	RegistLevelResponsitory regresponsitory;
	
	@Override
	public RegistLevel save(RegistLevel registlevel) {
		// TODO Auto-generated method stub
		return regresponsitory.save(registlevel);
	}

	@Override
	public List<RegistLevel> findRegistLevel() {
		return regresponsitory.findAll();
	}
	

}
