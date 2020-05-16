package com.neuedu.his.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.ConstantItemRepository;
import com.neuedu.his.pojo.ConstantItem;

@Service
public class ConstantItemServiceImpl implements IConstantItemService {
	@Autowired
	ConstantItemRepository responsitory;
	
	@Override
	public ConstantItem save(ConstantItem type) {
		return responsitory.save(type);
	}

	@Override
	public List<ConstantItem> findByConstantTypeID(String typeid) {
		return responsitory.findByConstantTypeID(typeid);
	}

	@Override
	public List<ConstantItem> findAllByTypeName(String typename) {
		return responsitory.findAllByTypeName(typename);
	}
}
