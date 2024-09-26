package com;

import java.util.List;
import java.util.Scanner;



public class StudentManagementApp {
	
	private static Scanner sc= new Scanner(System.in);
	private static StudentManager  studentManager=new StudentManager();
	private static FileManager fileManager= new FileManager();
	
	public static void main(String[] args) {
		
		
		
		while(true) {
			System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Save Students to File");
            System.out.println("5. Load Students from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice) {
            
            case 1:   addStudent();
            break;
            
            case 2: displayAllStudents();
            break;
            
            case 3: searchByStudentByName();
            break;
            
            case 4:  SaveStudentstoFile() ;
            break;
            
            case 5: loadStudentFromFile();
            break;
            
            case 6: System.exit(0);
            break;
            
            default : System.out.println("invalid choice");
            	
            }
		}
	}
	
	public static void addStudent() {
		System.out.println("Enter the student name");
		String name=sc.nextLine();
		
		System.out.println("Enter the student age");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Grade");
		String grade=sc.nextLine();
		
		Student student=new Student(name,age,grade);
		studentManager.addStudent(student);
	
	}
	public static void displayAllStudents() {
	List<Student> students=studentManager.getAllStudents();
	
	if(students.isEmpty()) {
		System.out.println("No students found");
	}
	else {
		for(Student student:students) {
			System.out.println(student);
		}
	}
	
	}
	
	public static void searchByStudentByName() {
		System.out.println("Enter the student name to search");
		String name=sc.next();
		Student found=studentManager.searchByStudentByName(name);
		if(found!=null) {
			System.out.println(found);
		}
		
	}
	
	public static void SaveStudentstoFile() {
		System.out.println("Enter the filename you want to store");
		String filename=sc.nextLine();
		fileManager.saveStudentToFile(studentManager.getAllStudents(), filename);

	}
	
	public static void  loadStudentFromFile() {
		
		System.out.println("Enter the file name you want to search");
		String filename=sc.nextLine();
		sc.nextLine();
		   List<Student>   loadedStudents =fileManager.loadStudentsFromFile(filename);
		   if(loadedStudents!=null) {
		   studentManager.getAllStudents().clear();
		   studentManager.getAllStudents().addAll(loadedStudents);
		
		   }
	}
	

}
