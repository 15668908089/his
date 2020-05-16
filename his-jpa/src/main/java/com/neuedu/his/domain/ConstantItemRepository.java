package com.neuedu.his.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.neuedu.his.pojo.ConstantItem;

public interface ConstantItemRepository extends JpaRepository<ConstantItem, String> {

	List<ConstantItem> findByConstantTypeID(String typeid);

	@Query(value = "select b.* from t_constanttype a,t_constantitem b where a.id=b.constantTypeID and constantTypeName=?1", nativeQuery = true)
	List<ConstantItem> findAllByTypeName(String typename);

}
