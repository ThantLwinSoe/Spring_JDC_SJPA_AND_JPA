package com.jdc.app.model.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Column;

@Entity
public class Student {
	
	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String major;
	@Column(nullable = false)
	private int rollNum;
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, String major, int rollNum) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.rollNum = rollNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
}
