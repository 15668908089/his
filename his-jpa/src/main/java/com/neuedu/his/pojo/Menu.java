package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_menu")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Menu {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "menuId", nullable = false, length = 32)
	private String menuId;
	@Column(name = "menuName", nullable = false, length = 50)
	private String  menuName;
	@Column(name = "path", nullable = true, length = 100)
	private String  path;
	@Column(name = "icon", nullable = false, length = 50)
	private String  icon;
	@Column(name = "visible", nullable = false, length = 50)
	private String  visible="0";
	@Column(name = "parentId", nullable = false, length = 32)
	private String  parentId;
	@Column(name = "parentName", nullable = true, length = 50)
	private String  parentName;
	@Column(name = "orderNum", nullable = false, length = 11)
	private String  orderNum;
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	
	
}
