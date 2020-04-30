package dev.selvam.module1.ifCondition;

public class Qus3_PositiveOrNegativeOrZero {

	public static void main(String[] args) {
		
		
		int num1 = 42;
		int num2 = -13;
		int num3 = 0;
		
		// checking num1 is positive or negative
		if ( num1 == 0 ) {
			System.out.println("Num1 is Zero");
		}
		else if ( num1 > 0 ) {
			System.out.println("Num1 = "+num1+" is positive");
		}
		else {
			System.out.println("Num1 = "+num1+" is negative");
		}
		
		// checking num2 is positive or negative
		if ( num2 == 0 ) {
			System.out.println("Num2 is Zero");
		}
		else if ( num2 > 0 ) {
			System.out.println("Num2 = "+num2+" is positive");
		}
		else {
			System.out.println("Num2 = "+num2+" is negative");
		}
		
		// checking num3 is positive or negative
		if ( num3 == 0 ) {
			System.out.println("Num3 is Zero");
		}
		else if ( num3 % 2 == 0 ) {
			System.out.println("Num3 = "+num3+" is positive");
		}
		else {
			System.out.println("Num1 = "+num3+" is negative");
		}
		

	}

}
