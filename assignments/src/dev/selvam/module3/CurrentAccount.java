package dev.selvam.module3;

import java.util.Random;

public final class CurrentAccount extends Account { 


	long accountNumber;
	String accountName;
	int amount;
	final int minBalence = 100;
	
	public CurrentAccount(String name) {
		Random randgen = new Random();
		this.accountNumber = randgen.nextInt(100000000);
		this.amount = 0;
		this.accountName = name;
		System.out.println("Thank you for choosing Currents account."
				+"\n");
	}

	@Override
	void deposite(int amount) {
		this.amount += amount;
		this.showAccountInfo();
		
	}

	@Override
	void withdraw(int withdrawamount) {
		if ( (this.amount - withdrawamount) >= this.minBalence ) {
			this.amount -= amount;
			System.out.println("[INFO] Successfully withdrawn "+withdrawamount);
			this.showAccountInfo();
		}
		else {
			System.out.println("[ERROR] Minimum balence should be  amount "+this.minBalence
					+"\n"+"You can  withdraw upto "+(this.amount-minBalence));
		}
		
		
	}

	@Override
	void showAccountInfo() {
		System.out.println("***************** Account Details *****************\n");
		System.out.println("AccouontNumber : "+accountNumber
				+"\n"+ "AccountName : "+accountName
				+"\n"+ "Current Balence : "+amount);
		System.out.println("\n***************************************************\n");
		
	}

}
