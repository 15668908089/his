package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_constantItem")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ConstantItem {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "ID", nullable = false, length = 32)
	// ID
	private String ID;
	// 所属常数类别ID
	@Column(name = "constantTypeID", nullable = false, length = 32)
	private String constantTypeID;
	// 常数项编码
	@Column(name = "ContantCode", nullable = false, length = 64)
	private String ContantCode;
	// 常数项名称
	@Column(name = "ConstantName", nullable = false, length = 64)
	private String ConstantName;
	// 删除标记
	@Column(name = "DelMark", nullable = false, length = 1)
	private String DelMark="1";
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getConstantTypeID() {
		return constantTypeID;
	}
	public void setConstantTypeID(String constantTypeID) {
		this.constantTypeID = constantTypeID;
	}
	public String getContantCode() {
		return ContantCode;
	}
	public void setContantCode(String contantCode) {
		ContantCode = contantCode;
	}
	public String getConstantName() {
		return ConstantName;
	}
	public void setConstantName(String constantName) {
		ConstantName = constantName;
	}
	public String getDelMark() {
		return DelMark;
	}
	public void setDelMark(String delMark) {
		DelMark = delMark;
	}
	
	

}
