package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_user")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class User {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "id", nullable = false, length = 32)
	private String id;
	@Column(name="userName",nullable=false,length=64)
	private String userName;
	@Column(name="password",nullable=false,length=64)
	private String password;
	@Column(name="realName",nullable=false,length=64)
	private String realName;
	@Column(name="roleId",nullable=false,length=32)
	private String roleId;
	@Column(name="docTitleID",nullable=false,length=32)
	private String docTitleID;
	@Column(name="isScheduling",nullable=false,length=32)
	private String isScheduling;
	@Column(name="deptID",nullable=false,length=32)
	private String deptID;
	@Column(name="registLeID",nullable=false,length=32)
	private String registLeID;
	private int delMark=1;
	public String getiD() {
		return id;
	}
	public void setiD(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getDocTitleID() {
		return docTitleID;
	}
	public void setDocTitleID(String docTitleID) {
		this.docTitleID = docTitleID;
	}
	public String getIsScheduling() {
		return isScheduling;
	}
	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	public String getRegistLeID() {
		return registLeID;
	}
	public void setRegistLeID(String registLeID) {
		this.registLeID = registLeID;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	
	
	
}
