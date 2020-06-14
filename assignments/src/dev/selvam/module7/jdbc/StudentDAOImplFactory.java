package dev.selvam.module7.jdbc;

import java.sql.SQLException;

public class StudentDAOImplFactory {

	private static StudentDAO dao = null ;
	public static StudentDAO getStudentDAO() throws SQLException {
		
		if ( dao == null) {
			dao = new StudentDAOImpl();
		}
		
		return dao;
		
	}
}
