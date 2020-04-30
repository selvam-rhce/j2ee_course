package dev.selvam.module1.dowhile;

public class Qus1_printOddandEven {

	public static void main(String[] args) {
		
		
		// Printing 10 even numbers
		System.out.println("******* 10 Even Numbers ********");
		int a=1;
		do {
			if ( a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}while ( a <= 20);
		
		// Printing 10 odd numbers
		System.out.println("******* 10 Odd Numbers ********");
		a=1;
		do {
			if ( a % 2 != 0) {
				System.out.println(a);
			}
			a++;
		}while ( a <= 20 ) ;

	}

}
