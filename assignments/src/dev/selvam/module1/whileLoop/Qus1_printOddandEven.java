package dev.selvam.module1.whileLoop;

public class Qus1_printOddandEven {

	public static void main(String[] args) {
		
		
		// Printing 10 even numbers
		System.out.println("******* 10 Even Numbers ********");
		int a=1;
		while ( a <= 20) {
			if ( a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}
		
		// Printing 10 odd numbers
		System.out.println("******* 10 Odd Numbers ********");
		a=1;
		while ( a <= 20 ) {
			if ( a % 2 != 0) {
				System.out.println(a);
			}
			a++;
		}

	}

}
