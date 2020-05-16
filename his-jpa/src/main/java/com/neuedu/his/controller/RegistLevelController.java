package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.RegistLevel;
import com.neuedu.his.service.IRegistLevelService;

@RestController
@RequestMapping("registLevel")
public class RegistLevelController {
	@Autowired
	IRegistLevelService registlevelservice;

	@RequestMapping("save")
	public RegistLevel save(@RequestBody RegistLevel registlevel) {
		RegistLevel addreg = registlevelservice.save(registlevel);
		return addreg;

	}

	@RequestMapping("findRegistLevel")
	public List<RegistLevel> findRegistLevel() {
		List<RegistLevel> list = registlevelservice.findRegistLevel();
		return list;

	}

}
