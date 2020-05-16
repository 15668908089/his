package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_role")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Role {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "roleId", nullable = false, length = 32)
	private String roleId;
	@Column(name = "roleName", nullable = false, length = 50)
	private String roleName;
	@Column(name = "roleSort", nullable = false, length = 5)
	private String roleSort;
	@Column(name = "status", nullable = false, length = 1)
	private String status;
	@Column(name = "delFlag", nullable = false, length = 2)
	private String delFlag="0";
	//@Transient表示的是我是暂存字段，只用于交互，不存库
	@Transient
	private String menuids;//1,2,3
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleSort() {
		return roleSort;
	}
	public void setRoleSort(String roleSort) {
		this.roleSort = roleSort;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public String getMenuids() {
		return menuids;
	}
	public void setMenuids(String menuids) {
		this.menuids = menuids;
	}
	
	
}
