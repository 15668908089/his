package com.neuedu.his.service;

import java.util.List;
import java.util.Map;

import com.neuedu.his.pojo.Rule;


public interface IRuleService {

	void addRule(List<Rule> rules)throws Exception;

	List<Map<String, Object>> findScheduling(String deptID);

	
}
