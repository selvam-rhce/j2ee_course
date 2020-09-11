package dev.selvam.assignment12;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.selvam.assignment12.models.Mobile;
import dev.selvam.assignment12.models.MobilePhoneDAO;


public class Assignment12Application {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("dev/selvam/assignment12/config/applicationContext.xml");
		MobilePhoneDAO dao=(MobilePhoneDAO)context.getBean("mobiledao");
		
		List<Mobile> mobilelist = dao.getMobiles();
		for (Mobile mobile : mobilelist) {
			System.out.println(mobile.toString());
		}
		
		((ConfigurableApplicationContext)context).close();
	}

}
