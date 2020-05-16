package com.neuedu.his.domain;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neuedu.his.pojo.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	@Query(value="SELECT Password from t_user where UserName=?1",nativeQuery=true)
	String findPws(String UserName);

	@Query(value="SELECT u.*,"+
			" '0' as x0,"+
			" '0' as x1,"+
			" '0' as x2,"+
			" '0' as x3,"+
			" '0' as x4,"+
			" '0' as x5,"+
			" '0' as x6,"+
			" '0' as x7,"+
			" '0' as x8,"+
			" '0' as x9,"+
			" '0' as x10,"+
			" '0' as x11,"+
			" '0' as x12,"+
			" '0' as x13"+
			" from t_user u"+
			" where u.deptID=?1 and u.registLeID=?2 "+
			" and u.isScheduling='1'",nativeQuery=true)
	List<Map<String, Object>> findUserByDeptAndLid(String deptid, String regLid);

}
