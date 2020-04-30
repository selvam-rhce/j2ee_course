package dev.selvam.module1.forloop;

public class Qus1_printOddandEven {

	public static void main(String[] args) {
		
		
		// Printing 10 even numbers
		System.out.println("******* 10 Even Numbers ********");
		for ( int a=1; a <= 20; a++) {
			if ( a % 2 == 0) {
				System.out.println(a);
			}
		}
		
		// Printing 10 odd numbers
		System.out.println("******* 10 Odd Numbers ********");
		for ( int a=1; a <= 20; a++) {
			if ( a % 2 != 0) {
				System.out.println(a);
			}
		}

	}

}
