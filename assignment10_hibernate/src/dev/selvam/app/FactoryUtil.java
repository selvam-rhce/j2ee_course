package dev.selvam.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class FactoryUtil {

	public static SessionFactory getFactory() {
		Configuration myconf = new Configuration();
		myconf.configure("dev/selvam/config/hibernate.cfg.xml");
		SessionFactory sfactory = myconf.buildSessionFactory();
		return sfactory;
	}
}
