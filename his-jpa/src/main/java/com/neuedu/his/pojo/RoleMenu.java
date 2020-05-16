package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_role_menu")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class RoleMenu {
@Id
@GeneratedValue(generator = "jpa-uuid")
@Column(name = "id", nullable = false, length = 32)
private String id;
private String roleId;
private String menuId;
public String getRoleId() {
	return roleId;
}
public void setRoleId(String roleId) {
	this.roleId = roleId;
}
public String getMenuId() {
	return menuId;
}
public void setMenuId(String menuId) {
	this.menuId = menuId;
}


}
