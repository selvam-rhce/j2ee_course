package dev.selvam.module7.jdbc;

import java.util.List;

public interface StudentDAO {
	
	public void creatStudentTable() throws Exception;
	public void saveStudent(Student studnt) throws Exception;
	public void updateStudent(Student studnt) throws Exception;
	public List<Student> listStudent() throws Exception;
	public void deleteStudent(int studntId) throws Exception;
	public Student searchStudent(int id) throws Exception;
	public void bulkInsert(List<Student> stntList) throws Exception;
	
}
