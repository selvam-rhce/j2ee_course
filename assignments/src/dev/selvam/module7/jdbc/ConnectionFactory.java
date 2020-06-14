package dev.selvam.module7.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection conn = null;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://192.168.160.81:3306/selvamdb";
	
	static final String USER = "root";
	static final String PASS = "Bullet_123";
	
	public static Connection getConnection() throws SQLException {
		
		if ( conn == null ) {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		
		return conn;
	}

}
