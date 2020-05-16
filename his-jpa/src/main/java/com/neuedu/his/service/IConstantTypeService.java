package com.neuedu.his.service;

import java.util.List;

import com.neuedu.his.pojo.ConstantType;

public interface IConstantTypeService {

	ConstantType save(ConstantType type);

	List<ConstantType> selectAllConstantTypeID();

}
