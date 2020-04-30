package dev.selvam.module1.dataTypeandOperations;

public class Qus2_AllArithmeticOperatons {

	public static void main(String[] args) {
		
/*
 * 		 Qus: Write program to perform all the arithmetic operations given in the table
 * 		
 * 		Given Operations are:
 * 			- Addition
 * 			- Subtraction
 * 			- Multiplication
 * 			- Division
 * 			- Increment operator
 * 			- Decrement operator	 	
 */
		
		// declaration part
		int point1 = 123;
		int point2 = 42;
		int point3 = 65;
		
		int total;
		double averageOfTwo;
		float averageOfThree;
		
		// Addition
		total = point1 + point2 + point3;
		System.out.println("Addition of point{1..3} : "+total);
		addSpace();
		
		// Subtraction
		System.out.println("Subtraction of point2 from point1 : "+(point1-point2));
		addSpace();
		
		// Multiplication
		System.out.println("Multiplication of point2 and point3 : "+(point2*point3));
		addSpace();
		
		// Division
		averageOfTwo = (point1+point2) / 2;
		System.out.println("Average of First 2 points : "+averageOfTwo);
		addSpace();
		averageOfThree = total / 3;
		System.out.println("Average of First 2 points : "+averageOfThree);
		addSpace();
		
		// increment
		//PostIncrement
		System.out.println("Post Increment of point3 : "+(point3++));
		addSpace();
		
		//PreIncrement
		System.out.println("PreIncrement of point1 : "+(++point1));
		addSpace();
		
		// Decrement
		//PostDecrement
		System.out.println("Post Decrement of point2 : "+(point2--));
		addSpace();
		
		//PreDecrement
		System.out.println("PreDecrement of point3 : "+(--point3));
		addSpace();
		
		
	}
	
	static void addSpace() {
		System.out.println("\n");
	}


}
