package com.neuedu.his.domain;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neuedu.his.pojo.Rule;

@Repository
public interface RuleRepository extends JpaRepository<Rule, String>{

	@Query(value="select r.*,u.realName,d.deptName from t_rule r,t_user u,t_department d where r.userID=u.id and r.deptID=d.id  and r.deptID=?1 and r.delMark=1",nativeQuery=true)
	List<Map<String, Object>> findScheduling(String deptID);

}
