package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_rule")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Rule {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "id", nullable = false, length = 32)
	private String id;
	@Column(name = "ruleName", nullable = false, length = 64)
	private String ruleName;
	@Column(name = "deptID", nullable = false, length = 32)
	private int deptID;
	@Column(name = "userID", nullable = false, length = 32)
	private String userID;
	@Column(name = "week", nullable = false, length = 14)
	private String week;
	@Column(name = "delMark", nullable = false, length = 1)
	private int delMark = 1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public int getDelMark() {
		return delMark;
	}

	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
}
