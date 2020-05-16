package com.neuedu.his.service;

import java.util.List;

import com.neuedu.his.pojo.RegistLevel;

public interface IRegistLevelService {
	
	RegistLevel save(RegistLevel registlevel);

	List<RegistLevel> findRegistLevel();

}
