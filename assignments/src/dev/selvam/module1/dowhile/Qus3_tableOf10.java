package dev.selvam.module1.dowhile;

public class Qus3_tableOf10 {

	public static void main(String[] args) {
		
		int tableNumber=10; // table number
		int tableLimit=10; // upto 10 will be printed
		int i=1;
		do {
			System.out.println(tableNumber+" X "+i+" = "+(tableNumber*i));
			 i++;
		}while ( i<=tableLimit);

	}

}
