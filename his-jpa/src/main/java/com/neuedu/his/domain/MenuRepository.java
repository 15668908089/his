package com.neuedu.his.domain;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.neuedu.his.pojo.Menu;

public interface MenuRepository extends JpaRepository<Menu, String> {
	@Query(value="SELECT menuid as id,menuName as label,menuname as name from t_menu where visible=0 and parentid=?1",nativeQuery=true)
	List<Map<String,Object>> findByParentId(@Param("parentId")  String parentId);
}
