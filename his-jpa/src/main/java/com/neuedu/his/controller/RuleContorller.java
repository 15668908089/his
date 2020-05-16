package com.neuedu.his.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.pojo.Rule;
import com.neuedu.his.service.IRuleService;
import com.neuedu.his.vo.RuleVo;

@RestController
@RequestMapping("rule")
public class RuleContorller {

	@Autowired
	IRuleService ruleService;

	@RequestMapping("addRule")
	public String addRule(@RequestBody RuleVo vo) {
		System.out.println("得到的数据为" + vo.getRules());
		List<Rule> rules = vo.getRules();
		try {
			ruleService.addRule(rules);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "失败";
		}
		return "成功";

	}

	@RequestMapping("findScheduling")
	public List<Map<String, Object>> findScheduling(String deptID) {
		List<Map<String, Object>> list=ruleService.findScheduling(deptID);
		return list;

	}
}
