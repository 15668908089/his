package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",length=9)
	//ID
	private Integer id;
	@Column(name="deptCode",length=64,nullable=false)
	//科室编码
	private String deptCode;
	@Column(name="deptName",length=64,nullable=false)
	//科室名称
	private String deptName;
	@Column(name="deptCategoryId",length=32)
	//科室分类
	private String deptCategoryId;
	@Column(name="deptType",length=1)
	//科室类型
	private int deptType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptType() {
		return deptType;
	}
	public void setDeptType(int deptType) {
		this.deptType = deptType;
	}
	public String getDeptCategoryId() {
		return deptCategoryId;
	}
	public void setDeptCategoryId(String deptCategoryId) {
		this.deptCategoryId = deptCategoryId;
	}

}
