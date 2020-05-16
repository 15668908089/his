package com.neuedu.his.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_scheduling")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Scheduling {
	@Id
	@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "id", nullable = false, length = 32)
	private String id;
	@Column(name = "schedDate", nullable = true, length = 32)
	private String schedDate;
	@Column(name = "userID", nullable = true, length = 32)
	private String userID;
	@Column(name = "deptID", nullable = true, length = 32)
	private String deptID;
	@Column(name = "noon", nullable = true, length = 2)
	private String noon;
	@Column(name = "ruleId", nullable = true, length = 32)
	private String ruleId;
	@Transient
	private String startDate;
	@Transient
	private String endDate;
	@Transient
	private String week;
	
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	public String getNoon() {
		return noon;
	}
	public void setNoon(String noon) {
		this.noon = noon;
	}
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getSchedDate() {
		return schedDate;
	}
	public void setSchedDate(String schedDate) {
		this.schedDate = schedDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
