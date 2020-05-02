package dev.selvam.module2;

import java.util.Scanner;

public class Qus3_arrayFunctionWithSearch {

	public static void main(String[] args) {
		
/*
 * Qus: Write another function named display() which takes 4 arguments.
 * The arguments are namedas String and 3 arrays (Employee id, name and salary). 
 * Function prototype looks like:display (String name, int regno[], String Empname[], double salary[]).  
 * This function will search for the name in the Empname array and will display its corresponding 
 * id and salary in the below given format. For example, 
 * if Divya is given as the name to search then display () function will display the following record
 * 
 * ID	NAME	salary
 * 00	Divya	10000
 * 
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
	
		
		display(empId, empName, empSalary);			// printing employee informations
		display(empId, empName);					// function overloading
		
		
		System.out.println("Enter the employee you want to search?");
		String searchName = myinputs.next();
		myinputs.close(); 							// closing scanner
		
		display(searchName, empId, empName, empSalary);					// printing employee informations 

	}
	
	static void display(int[] empId, String[] empName, int[] empSalary) {
		
		System.out.println("ID \t NAME \t\t SALARY\n");
		
		for (int empidx=0; empidx<empId.length;empidx++)
		{
			System.out.println(empId[empidx]+" \t "+empName[empidx]+" \t "+empSalary[empidx]);
		}
		System.out.println("\n");
	}
	
	static void display(int[] empId, String[] empName) { //function overloading
		
		System.out.println("ID \t NAME\n");
		
		for (int empidx=0; empidx<empId.length;empidx++)
		{
			System.out.println(empId[empidx]+" \t "+empName[empidx]);
		}
		System.out.println("\n");
	}
	
	static void display(String name, int[] empId, String[] empName, int[] empSalary) {
		
		System.out.println("ID \t NAME \t\t SALARY\n");
		
		for (int empidx=0; empidx<empId.length;empidx++)
		{
			if (name.equals(empName[empidx])) {				// only print the required employee
				System.out.println(empId[empidx]+" \t "+empName[empidx]+" \t "+empSalary[empidx]);
			}
		}
		System.out.println("\n");
	}

}
