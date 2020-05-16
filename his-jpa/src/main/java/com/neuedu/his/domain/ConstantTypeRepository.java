package com.neuedu.his.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neuedu.his.pojo.ConstantType;
/**
 * extends JpaRepository之后就可以省略简单的增加 修改 删除 简单查询
 * @author t460p
 *
 */
public interface ConstantTypeRepository extends JpaRepository<ConstantType,String>{

}
