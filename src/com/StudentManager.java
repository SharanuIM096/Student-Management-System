package com;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	
	private List<Student> students;
	
	
	public StudentManager() {
		this.students=new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	

	
	public Student searchByStudentByName(String name) {
		for(Student student:students) {
			if(student.getName().equalsIgnoreCase(name)) {
			return student;
			}
		}
		return null;
		
	}
	
	public List<Student> getAllStudents(){
		return students;
	}

}
