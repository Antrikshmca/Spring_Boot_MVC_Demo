package com.antriksh.spring.boot.mvc.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Student {

	@Id
	//SS@GeneratedValue
	private Integer stuId;
	private String stuName;
	private String stuBranch;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuBranch=" + stuBranch + "]";
	}
}
