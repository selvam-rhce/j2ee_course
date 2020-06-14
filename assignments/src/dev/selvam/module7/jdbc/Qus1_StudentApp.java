package dev.selvam.module7.jdbc;

public class Qus1_StudentApp {

	public static void main(String[] args) throws Exception {
		
		StudentDAO dao = StudentDAOImplFactory.getStudentDAO();
		
		//create table if not exists
		System.out.println("********** Create and Flush Student Table *************\n");
		dao.creatStudentTable();
		
		// insert student
		System.out.println("\n\n********** Insert data into Student Table *************\n");
		Student firstStudent = new Student(5,"selvam", 8, 70);
		dao.saveStudent(firstStudent);
		Student secondStudent = new Student(8,"whoknows", 2, 60);
		dao.saveStudent(secondStudent);
		Student thirdStudent = new Student(9,"aaranya", 5, 50);
		dao.saveStudent(thirdStudent);
		Student fourthStudent = new Student(20,"mallika", 10, 79);
		dao.saveStudent(fourthStudent);
		
		// search student
		System.out.println("\n\n********** Search data on Student Table *************\n");
		Student searchStudent = dao.searchStudent(5);
		System.out.println(searchStudent.toString());
		
		// list student table
		System.out.println("\n\n********** List all data of Student Table *************\n");
		for (Student forstudent : dao.listStudent()) {
			System.out.println(forstudent.toString());
		}
		
		// update student
		System.out.println("\n\n********** Update data on Student Table *************\n");
		Student updateStudent = new Student(5, "selvam", 8, 100);
		dao.updateStudent(updateStudent);
		
		// delete student
		System.out.println("\n\n********** Delete data from Student Table *************\n");
		dao.deleteStudent(5);
		

	}
}
