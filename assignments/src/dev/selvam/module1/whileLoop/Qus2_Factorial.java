package dev.selvam.module1.whileLoop;

public class Qus2_Factorial {

	public static void main(String[] args) {
		
/*
 * Factorial : A factorial is a function that multiplies a number by every number below it. 
 * For example 5!= 5*4*3*2*1=120
 * 
 */
		int givenNumber = 5;
		int result = 1;
		int i=1;
		
		while ( i<=givenNumber) {
			result *= i;
			i++;
		}
		System.out.println("Factorial of "+givenNumber+" = "+result);

	}

}
