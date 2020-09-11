package dev.selvam.assignment12;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.selvam.assignment12.models.Mobile;
import dev.selvam.assignment12.models.MobilePhoneDAO;

public class TestClass {
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("dev/selvam/assignment12/config/applicationContext.xml");
	MobilePhoneDAO dao = (MobilePhoneDAO)context.getBean("mobiledao");
	
	ArrayList<Mobile> moblist = new ArrayList<Mobile>();
	
	Mobile m1 = new Mobile(2, "yuphoria", 8000, "black");
	moblist.add(m1);
	Mobile m2 = new Mobile(3, "intel", 9000, "white");
	moblist.add(m2);
	Mobile m3 = new Mobile(4, "panasonic", 10000, "yellow");
	moblist.add(m3);
	Mobile m4 = new Mobile(5, "redme", 11000, "blue");
	moblist.add(m4);
	Mobile m5 = new Mobile(6, "samsung", 12000, "red");
	moblist.add(m5);
	Mobile m6 = new Mobile(7, "nokia", 13000, "gray");
	moblist.add(m6);
	Mobile m7 = new Mobile(8, "index", 14000, "green");
	moblist.add(m7);
	Mobile m8 = new Mobile(9, "vivo", 15000, "orange");
	moblist.add(m8);
	Mobile m9 = new Mobile(10, "oppo", 16000, "black");
	moblist.add(m9);
	Mobile m10 = new Mobile(11, "micromax", 17000, "black");
	moblist.add(m10);
	
	for (Mobile mobile : moblist) {
		dao.saveMobile(mobile);
		System.out.println(mobile.toString());
	}
	
	((ConfigurableApplicationContext)context).close();
	}

}
