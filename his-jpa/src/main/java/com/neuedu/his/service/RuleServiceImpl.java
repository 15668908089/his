package com.neuedu.his.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.domain.RuleRepository;
import com.neuedu.his.pojo.Rule;

@Service
@Transactional(rollbackOn = { RuntimeException.class, Exception.class })
public class RuleServiceImpl implements IRuleService {

	@Autowired
	RuleRepository ruleRepository;

	@Override
	public void addRule(List<Rule> rules) throws Exception {
		try {
			for (Rule rule : rules) {
				ruleRepository.save(rule);
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Map<String, Object>> findScheduling(String deptID) {
		List<Map<String, Object>> list=ruleRepository.findScheduling(deptID);
		return list;
	}

}
