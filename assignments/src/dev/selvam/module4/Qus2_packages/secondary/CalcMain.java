package dev.selvam.module4.Qus2_packages.secondary;

import dev.selvam.module4.Qus2_packages.primary.CalcBackend;

public class CalcMain {

	public static void main(String[] args) {
		CalcBackend mycalc = new CalcBackend();
		
		
//		subtraction
		mycalc.subtract(10, 2);
		
//		divide
		mycalc.divide(10, 2);
		
//		multiply
		mycalc.multiply(10, 2);
		
//		factorial
		mycalc.factorial(10);
		
//		reversenum
		mycalc.reversenum(1054545);
	}
}
