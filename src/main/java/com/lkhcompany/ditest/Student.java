package com.lkhcompany.ditest;

public class Student {
	
	private String name;
	private int age;
	private double height;
	private double wieght;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, double height, double wieght) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.wieght = wieght;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWieght() {
		return wieght;
	}
	public void setWieght(double wieght) {
		this.wieght = wieght;
	}
	
}
