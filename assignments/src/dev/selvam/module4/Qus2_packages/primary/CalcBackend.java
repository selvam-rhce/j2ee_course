package dev.selvam.module4.Qus2_packages.primary;

public class CalcBackend {

	
	public void subtract(int num1, int num2) {
		System.out.println("\n####### Subtract #########");
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}
	public void multiply(int num1, int num2) {
		System.out.println("\n####### Multiply #########");
		System.out.println(num1+" * "+num2+" = "+(num1*num2));		
	}
	public void divide(int num1, int num2) {
		System.out.println("\n####### Divide #########");
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
	}
	public void factorial(int factnum) {
		int result = 1;
		for ( int  num=1; num <= factnum; num++ ) {
			result += num;
		}
		System.out.println("\n\nFactorial of "+factnum+" is "+result);
	}
	public void reversenum(int revnum) {
		int lastdigit;
		int result = 0;
		int tmprevnum = revnum;
		while (tmprevnum != 0) {
			lastdigit = tmprevnum % 10;
			result = result * 10 + lastdigit;
			tmprevnum /= 10;
		}
		System.out.println("\n\n");
		System.out.println(revnum+" revers is = "+result);
		
	}
	
}
