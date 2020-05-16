package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_constanttype")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ConstantType {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(length = 32)
	private String id;
	@Column(name = "constantTypeCode", nullable = false, length = 64)
	private String constantTypeCode;
	@Column(name = "constantTypeName", nullable = false, length = 64)
	private String constantTypeName;
	//1正常状态  0 已删除
	private int delMark=1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConstantTypeCode() {
		return constantTypeCode;
	}
	public void setConstantTypeCode(String constantTypeCode) {
		this.constantTypeCode = constantTypeCode;
	}

	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	public String getConstantTypeName() {
		return constantTypeName;
	}
	public void setConstantTypeName(String constantTypeName) {
		this.constantTypeName = constantTypeName;
	}
	
	
}
