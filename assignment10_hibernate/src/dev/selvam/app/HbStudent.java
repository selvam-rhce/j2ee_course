package dev.selvam.app;

import java.util.List;
import java.util.Random;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dev.selvam.models.Student;

public class HbStudent {

	public static void main(String[] args) {
		
		SessionFactory myfact = FactoryUtil.getFactory();
		
		Session mysess = myfact.openSession();
		
		Transaction tx = mysess.beginTransaction();
		Random r = new Random();
		
		// INSERT 10 RECORDS
		System.out.println("######## SAVING BELOW RECORDS #######");
		int count = 10;
		while ( count >= 0 ){
		
			Student st = new Student();
			st.setMarks(r.nextInt(37-33) + 33);
			st.setName("test"+count);
			System.out.println(st.toString());
			mysess.save(st);
			count -= 1;
		
		}
		
		// UPDATE RECORDS ( update test10 student mark )
		TypedQuery<Student> getQuery = mysess.createQuery("FROM dev.selvam.models.Student WHERE name='test10'");
		List<Student> getList = getQuery.getResultList();
		for (Student student : getList) {
			student.setMarks(80);
			System.out.println("####### UPDATE STUDENT MARK (test10 == 80) #####");
			System.out.println(student.toString());
			mysess.save(student);
		}
		
		// DELETE THE STUDENTS LESS THAN 35 MARK
		System.out.println("####### DELETING RECORDS LESS THAN 35 MARK");
		String query = "DELETE dev.selvam.models.Student WHERE marks < 35";
		int delresult = mysess.createQuery(query).executeUpdate();
		System.out.println("Rows affected "+delresult);
		
		// LIST ALL
		System.out.println("######## Remaining students #########");
		List<Student> stList = mysess.createQuery("FROM dev.selvam.models.Student").getResultList();
		for (Student student : stList) {
			System.out.println(student.toString());
		}
		
		
		tx.commit();
		mysess.close();
		myfact.close();

	}

}
