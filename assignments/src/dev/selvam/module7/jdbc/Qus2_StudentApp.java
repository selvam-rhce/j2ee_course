package dev.selvam.module7.jdbc;

import java.util.ArrayList;
import java.util.List;

public class Qus2_StudentApp {

	public static void main(String[] args) throws Exception {
		
		StudentDAO dao = StudentDAOImplFactory.getStudentDAO();
		
		//create table if not exists
		System.out.println("********** Create and Flush Student Table *************\n");
		dao.creatStudentTable();
		
		//Bulk update
		System.out.println("\n\n********** Bulk insert data into Student Table *************\n");
		List<Student> mystList = new ArrayList<Student>();
		
		Student s1 = new Student(11, "s1", 1, 45);
		Student s2 = new Student(12, "s2", 1, 55);
		Student s3 = new Student(13, "s3", 1, 65);
		Student s4 = new Student(14, "s4", 1, 75);
		Student s5 = new Student(11, "s5", 1, 85);
		
		mystList.add(s1);
		mystList.add(s2);
		mystList.add(s3);
		mystList.add(s4);
		mystList.add(s5);
		
		dao.bulkInsert(mystList);
		System.out.println("\n\n ******** Data after Bulk insert ********");
		for (Student forstudent : dao.listStudent()) {
			System.out.println(forstudent.toString());
		}
		

	}
}
