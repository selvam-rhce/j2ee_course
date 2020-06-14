package dev.selvam.module3;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Banking \n Select you account type: \n 1. Savings Account \n 2. Current Account");
		
		Scanner myscan = new Scanner(System.in);
		int userSelection = myscan.nextInt();
		
		System.out.println("Enter you name ");
		String accountname = myscan.next();
		
		Account userAccount = null;
		switch (userSelection) {
		case 1:
			userAccount = new SB_Account(accountname);
			System.out.println("Created Saving Banks Account !!!");
			userAccount.showAccountInfo();
			break;
			
		case 2:
			userAccount = new CurrentAccount(accountname);
			System.out.println("Created Current account !!!");
			userAccount.showAccountInfo();
			break;
		}

		Boolean exitaction = true;
		while(exitaction) {
			System.out.println("\n Utilities \n 1.Show Account info "
					+ "\n 2.deposite amount"
					+ "\n 3.withdraw amount"
					+ "\n 4. exit");
			userSelection = myscan.nextInt();
			int amount = 0;
			switch (userSelection) {
			case 1: 
				userAccount.showAccountInfo();
				break;
			case 2:
				System.out.println("Enter the amount to  be deposite");
				amount = myscan.nextInt();
				userAccount.deposite(amount);
				break;
			case 3:
				System.out.println("Enter the amount to  be withdraw");
				amount = myscan.nextInt();
				userAccount.withdraw(amount);
				break;
			case 4:
				System.out.println("Thanks for banking with us.");
				exitaction = false;
				break;
			}			
		}
		myscan.close();
		
	}

}
