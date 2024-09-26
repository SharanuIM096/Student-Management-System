package com;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	private String name;
	private int age;
	private String grade;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGrade() {
		return grade;
	}
	

}
