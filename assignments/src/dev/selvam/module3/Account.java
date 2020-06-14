package dev.selvam.module3;

abstract class Account {
	public final int minBalence = 0;
	long accountNumber;
	String accountName;
	int amount;
	abstract void showAccountInfo();
	abstract void deposite(int amount);
	abstract void withdraw(int amount);


}
