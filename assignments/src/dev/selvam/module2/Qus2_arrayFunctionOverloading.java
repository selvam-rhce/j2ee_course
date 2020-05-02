package dev.selvam.module2;

import java.util.Scanner;

public class Qus2_arrayFunctionOverloading {

	public static void main(String[] args) {
		
/*
 * Qus: Write another function display() withEmployee ID array and Employee name array as arguments. 
 * (Note: here we are using concept of function overloading). 
 * This function will display the content of the 2 arrays in the following format.
 * 
 * ID	NAME
 * 00	John
 * 002	Clark 
 */
		
		
		// declaration part
		int numOfEmp=5;								// accept 5 emp
		int[] empId = new int[numOfEmp];			// empid array
		String[] empName = new String[numOfEmp];	// empname array
		int[] empSalary = new int[numOfEmp];;		// empsalary array
		int empCount;								
		
		// Opening scanner to read input from user
		Scanner myinputs = new Scanner(System.in);
		
		// Reading employee information one by one using for loop
		for (int empidx=0; empidx<numOfEmp; empidx++ ) 
		{
			empCount = empidx+1;
			System.out.println("Enter Employee"+empCount+" ID?");
			empId[empidx] = myinputs.nextInt();
			System.out.println("Enter Employee"+empCount+" NAME?");
			empName[empidx] = myinputs.next();
			System.out.println("Enter Employee"+empCount+" SALARY?");
			empSalary[empidx] = myinputs.nextInt();	
		}
	
		myinputs.close(); 							// closing scanner 
		
		display(empId, empName, empSalary);			// print all informations of employee
		display(empId, empName);					// Function overloading printing employee id and name informations 


	}
	
	static void display(int[] empId, String[] empName, int[] empSalary) {
		
		System.out.println("ID \t NAME \t\t SALARY\n");
		
		for (int empidx=0; empidx<empId.length;empidx++)
		{
			System.out.println(empId[empidx]+" \t "+empName[empidx]+" \t "+empSalary[empidx]);
		}
	}
	
	static void display(int[] empId, String[] empName) { //function overloading
		
		System.out.println("ID \t NAME\n");
		
		for (int empidx=0; empidx<empId.length;empidx++)
		{
			System.out.println(empId[empidx]+" \t "+empName[empidx]);
		}
	}

}
