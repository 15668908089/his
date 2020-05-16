package com.neuedu.his.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.ConstantTypeRepository;
import com.neuedu.his.pojo.ConstantType;
@Service
public class ConstantTypeServiceImpl implements IConstantTypeService {
	
	@Autowired
	ConstantTypeRepository respository;
	@Override
	public ConstantType save(ConstantType type) {
		return respository.save(type);
	}
	@Override
	public List<ConstantType> selectAllConstantTypeID() {
		return respository.findAll();
	}
}
