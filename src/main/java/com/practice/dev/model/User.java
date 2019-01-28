package com.practice.dev.model;

public class User {
	
	private String name;
	private String dept;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public User(String name,String dept,long salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

}
