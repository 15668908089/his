package com.neuedu.his.service;

import java.util.List;

import com.neuedu.his.pojo.ConstantItem;

public interface IConstantItemService {

	ConstantItem save(ConstantItem type);

	List<ConstantItem> findByConstantTypeID(String typeid);

	List<ConstantItem> findAllByTypeName(String typename);

}
