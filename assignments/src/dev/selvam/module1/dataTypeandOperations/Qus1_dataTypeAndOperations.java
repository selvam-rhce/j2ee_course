package dev.selvam.module1.dataTypeandOperations;

public class Qus1_dataTypeAndOperations {

	public static void main(String[] args) {
		
		
		// Qus : Write programs to use all the data types and given arithmetic operations.
		
		// int and double are known as Data Types 
		
		int mark1 = 100;
		int mark2 = 74;
		int mark3 = 62;

		// double
		double average;
		
		// addition and division
		
		average = (mark1 + mark2 + mark3) /(double) 3; // just doing some tricky
		
		System.out.println("******************** int *********************");
		System.out.println("mark1 : "+mark1+"\nmark2 : "+mark2+"\nmark3 : "+mark3);
		
		System.out.println("******************** double *********************");
		System.out.println("Average of all 3 marks : "+average);

		
		System.out.println("\n\n");
		
		
		// Subtraction
		System.out.println("Difference between mark1 and mark2 : "+(mark1-mark2));
		
		// Multiplication
		int point=10;
		System.out.println("Multiply point by 3 : "+(point*3));
		
		// increment
		System.out.println("post increment of point : "+(point++)); // this is post increment thats why shows same value
		System.out.println("Preincrement of pint "+(++point)); // this includes previous incr also
		
		// decrement
		System.out.println("post Decrement of point : "+(point--)); // this is post decrement thats why show same value
		System.out.println("Pre decrement of point : "+(--point)); // this includes previous decr also
		
		// example for char
		
		char mychar = 's';
		System.out.println("This is sample char :"+mychar);
		
		// example for float
		
		float averageOfTwoMark = (mark1 + mark2 ) /(float) 2;
		System.out.println("Average of first two marks : "+averageOfTwoMark);
		
		// example boolean 
		boolean isAllMarkAvailable = false;
		System.out.println("Is all marks available : "+isAllMarkAvailable);

		

		
	}

}
