package dev.selvam;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic +, -, *, /
		
		int purchase1 = 200;
		int purchase2 = 501;
		int purchase3 = 1000;
		int totalpurchase;
		double discount = 0.02;
		
		totalpurchase = purchase1 + purchase2 + purchase3;
		System.out.println("Total purchase : "+totalpurchase);
		int priceAfterDiscount = totalpurchase - (int) (totalpurchase * discount);
		System.out.println("Total price after discount : "+ priceAfterDiscount);
		
		// increment operator ++, --
		
		int num1 = 100;
		System.out.println("Initial value of num1 : "+num1);
		
		// increment by 1
		// post increment num1++
		System.out.println("During postincr num1++ : "+ num1++); // this will show first and then increment
		System.out.println("After postinc num1 : "+num1);  // here we can get incr value
		
		System.out.println("During preincr ++num1 : "+(++num1)); // this will increment right away
		
		// assignment operator = , ==, *=, +=, -=
		// while assigning values we can able to perform arithmetic operation
		
		int testnum1 = 10;
		int testnum2 = 2;
		System.out.println("testnum1 : "+testnum1);
		System.out.println("testnum2 : "+testnum2);
		
		System.out.println("testnum1 = testnum1 * testnum2 : "+ (testnum1 * testnum2) );
		testnum1 *= testnum2;
		System.out.println("alternative testnum1 *= testnum2 : "+testnum1);
		
		
		
		
		// Relational operator >, <, >=, <=, ==, !=
		
		int oprnum1 = 100;
		int oprnum2 = 200;
		System.out.println("opernum1 = "+oprnum1+" oprnum2 = "+oprnum2);
		System.out.println("oprnum1 > oprnum2 = "+ (oprnum1 > oprnum2));
		
		// Logical operator &&, ||
		
		boolean primecust = true;
		System.out.println("elligible for discount : "+(totalpurchase > 500 && primecust));
		
		// shift operator >>, <<, >>>, 	
		
		
	}

}
