package dev.selvam.module5.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class DemoHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Double> studentHT = new  Hashtable<String, Double>();
		
		studentHT.put("John", 75.00);
		studentHT.put("Smita", 56.00);
		studentHT.put("kavin", 65.05);
		studentHT.put("kaviya", 91.00);
		studentHT.put("jesica", 98.50);
		
		Double highMark=0.0,currvalue;
		String highMarkStnt=null,currstnd;
		Enumeration<String> studentID = studentHT.keys();
		
		while (studentID.hasMoreElements()) {
			currstnd = studentID.nextElement();
			currvalue = studentHT.get(currstnd);
			if (highMark < currvalue ) {
				highMark=currvalue;
				highMarkStnt=currstnd;
			}
		} 
		System.out.println("Highest Mark student is : "+highMarkStnt);

	}

}
