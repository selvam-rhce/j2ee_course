package dev.selvam.module7.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
	
	private static Connection conn = null;
	private static Statement st = null;
	
	public StudentDAOImpl() throws SQLException {
	
		conn = ConnectionFactory.getConnection();
		st = conn.createStatement();
	}

	
	public void creatStudentTable() throws SQLException {
		String createSql = "CREATE TABLE IF NOT EXISTS Student ("
				+ "id int AUTO_INCREMENT PRIMARY KEY,"
				+ "name varchar(40),"
				+ "class int,"
				+ "marks int);";
		int rt = st.executeUpdate(createSql);
		if ( rt > 0 )
			System.out.println("Student table created successfully");
		else if ( rt == 0 )
			System.out.println("Student table already available");
		else
			System.out.println("Not able to create Student table");
		
		if ( rt >= 0 ) {
			String flushSql = "DELETE FROM Student";
			int rtf = st.executeUpdate(flushSql); 
			if ( rtf >= 0 )
				System.out.println("Flushed all data on Student table");
			else
				System.out.println("Not able to delete records from Student table");
		}
			
	}
	

	@Override
	public void saveStudent(Student studnt) throws SQLException {
		String saveSql = "INSERT INTO Student values ( "+studnt.getID()+",'"+studnt.getName()+"',"+studnt.getStd_class()+","
				+ studnt.getMarks()+")";
		System.out.println(saveSql);
		int rt = st.executeUpdate(saveSql);
		if ( rt > 0 )
			System.out.println("Student saved");

	}

	@Override
	public void updateStudent(Student studnt) throws SQLException {
		String updateSql = "UPDATE Student set name='"+studnt.getName()+"', class="+studnt.getStd_class()+
				", marks="+studnt.getMarks()+" where id="+studnt.getID();
		int rt = st.executeUpdate(updateSql);
		if ( rt > 0 ) {
			System.out.println("Student Updated with below values");
			System.out.println(studnt.toString());
		}
		else {
			
		}

	}

	@Override
	public List<Student> listStudent() throws SQLException {
		List<Student> stntList = new ArrayList<Student>();
		String listSql = "select id,name,class,marks from Student";
		ResultSet rs = st.executeQuery(listSql);
		while(rs.next())
		{
			int stntId = rs.getInt(1);
			String name = rs.getString(2);
			int cls = rs.getInt(3);
			int mark = rs.getInt(4);
			Student mystnt = new Student(stntId, name, cls, mark);
			stntList.add(mystnt);
		}
		return stntList;
	}

	@Override
	public void deleteStudent(int studntId) throws SQLException {
		String delSql = "delete from Student where id="+studntId;
		int rt = st.executeUpdate(delSql);
		if ( rt > 0 )
			System.out.println("Student deleted successfully");
		else
			System.out.println("No matching student found");
		
	}

	@Override
	public Student searchStudent(int id) throws SQLException {
		Student myst = null;
		String searchSql = "SELECT id,name,class,marks from Student where id="+id;
		ResultSet rs = st.executeQuery(searchSql);
		if ( rs.next())
		{
			int sid = rs.getInt(1);
			String name = rs.getString(2);
			int cls = rs.getInt(3);
			int mark = rs.getInt(4);
			myst = new Student(sid,name,cls,mark);
		}
		return myst;
	}


	@Override
	public void bulkInsert(List<Student> stntList) throws Exception {
		conn.setAutoCommit(false);
		String insertSql = "INSERT INTO Student (id, name, class, marks) values (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(insertSql);
		
		for (Student student : stntList) {
			ps.setInt(1, student.getID());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getStd_class());
			ps.setInt(4, student.getMarks());
			ps.addBatch();
		}
		try {
			ps.executeBatch();
			System.out.println("Batch Executed successfully");
			conn.commit();
		}
		catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
			System.out.println("Rollbacked Batch Execution");
		}
		
	}

}
