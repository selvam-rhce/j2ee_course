package dev.selvam.module1.whileLoop;

public class Qus5_fibonacciNumbers {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int givenNumber = 10;
		int result;
		
		System.out.println(num1);
		System.out.println(num2);
		int i=2;
		while ( i<givenNumber ) {
			  result=num1+num2;    
			  System.out.println(result);    
			  num1=num2;    
			  num2=result;    
			  i++;
		}

	}

}
