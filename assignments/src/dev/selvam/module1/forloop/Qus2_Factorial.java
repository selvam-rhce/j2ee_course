package dev.selvam.module1.forloop;

public class Qus2_Factorial {

	public static void main(String[] args) {
		
/*
 * Factorial : A factorial is a function that multiplies a number by every number below it. 
 * For example 5!= 5*4*3*2*1=120
 * 
 */
		int givenNumber = 6;
		int result = 1;
		
		for ( int i=1; i<=givenNumber; i++) {
			result *= i;
		}
		System.out.println("Factorial of "+givenNumber+" = "+result);

	}

}
