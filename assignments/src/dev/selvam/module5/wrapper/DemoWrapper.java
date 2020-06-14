package dev.selvam.module5.wrapper;

import java.util.ArrayList;

public class DemoWrapper {

	public static void main(String[] args) {
		
		ArrayList<Object> randarray = new ArrayList<Object>();
		
		// Byte
		byte bytemaxvalue = Byte.MAX_VALUE;
		Byte mybyte = new Byte(bytemaxvalue);
		randarray.add(mybyte);
		
		// Short
		short shortmaxvalue = Short.MAX_VALUE;
		Short myshort = new Short(shortmaxvalue);
		randarray.add(myshort);
		
		// Int
		int intmaxvalue = Integer.MAX_VALUE;
		Integer myint = new Integer(intmaxvalue);
		randarray.add(myint);
		
		// long
		long longmaxvalue = Long.MAX_VALUE; // long should be end with l
		Long mylong = new Long(longmaxvalue);
		randarray.add(mylong);
		
		// float
		float floatmaxvalue = Float.MAX_VALUE;
		float myfloat = new Float(floatmaxvalue);
		randarray.add(myfloat);
		
		// double
		double doublemaxvalue = Double.MAX_VALUE;
		Double mydouble = new Double(doublemaxvalue);
		randarray.add(mydouble);
		
		// char
		char charmaxvalue = Character.MAX_VALUE;
		Character mychar = new Character(charmaxvalue);
		randarray.add(mychar);
		
		// boolean
		boolean booleanvalue = Boolean.FALSE;
		Boolean mybool = new Boolean(booleanvalue);
		randarray.add(mybool);

		System.out.println("########## below the output of different wrapper classes #####");
		for (Object object : randarray) {
			System.out.println(object);
		}
		
	}

}
