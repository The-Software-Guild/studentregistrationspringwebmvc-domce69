package com.wileyedge;

public class Student {
	
	private int count = 0;
	private int id;
	private String name;
	private int age;
	private int mobile;
	private String address;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int mobile, String address) {
		super();
		System.out.println("Inside student constructor");
		this.id = ++count;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}