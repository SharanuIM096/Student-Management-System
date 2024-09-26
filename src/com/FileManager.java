package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileManager {

	public void saveStudentToFile(List<Student> students, String fileName) {
		
		File f= new File(fileName);
	

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {

			oos.writeObject(students);
		
			System.out.println("Students saved to file: " + fileName);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public List<Student> loadStudentsFromFile(String fileName){
		
		List<Student> students=null;
		
		
		try(ObjectInputStream  ois=new ObjectInputStream(new FileInputStream(fileName))) {
				students=(List<Student>) ois.readObject();
				
				for(Student std:students) {
					System.out.println(std);
				}
				
				 System.out.println("Students loaded from file: " + fileName);
			}
		catch (IOException  | ClassNotFoundException e) {
			
			e.printStackTrace();
		
		}
		
		return students;
		
		
	}

}
