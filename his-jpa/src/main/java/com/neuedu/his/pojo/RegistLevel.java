package com.neuedu.his.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="t_registLevel")
@GenericGenerator(name="jpa-uuid",strategy="uuid")
public class RegistLevel {
	//主键
	@Id
	@GeneratedValue(generator="jpa-uuid")
	@Column(length=32)
	private String id;
	//好别编码
	@Column(name="registCode",length=64)
	private String registCode;
	//号别名称
	@Column(name="registName",length=64)
	private String registName;
	//显示顺序号
	@Column(name="sequenceNo",length=3)
	private String sequenceNo;
	//挂号费
	@Column(name="registFee",length=10)
	private String registFee;
	//挂号限额
	@Column(name="registQuota",length=3)
	private String registQuota;
	//删除标记
	@Column(name="delMark",length=1)
	private String delMark="1";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegistCode() {
		return registCode;
	}
	public void setRegistCode(String registCode) {
		this.registCode = registCode;
	}
	public String getRegistName() {
		return registName;
	}
	public void setRegistName(String registName) {
		this.registName = registName;
	}
	public String getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public String getRegistFee() {
		return registFee;
	}
	public void setRegistFee(String registFee) {
		this.registFee = registFee;
	}
	public String getRegistQuota() {
		return registQuota;
	}
	public void setRegistQuota(String registQuota) {
		this.registQuota = registQuota;
	}
	public String getDelMark() {
		return delMark;
	}
	public void setDelMark(String delMark) {
		this.delMark = delMark;
	}
	
	
	
}
