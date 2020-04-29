package dev.selvam;

import java.net.NetPermission;

public class ConditionalOperator {

	public static void main(String[] args) {
		int amount = 1000;
		int promocode = 5001;
		double discount;

		// Offer disount 20% if amount >= 200 and amount < 500
		// offer discount 30% if amount >= 500 and amount < 1000
		// offer discount 50% if amount > 1000
		
		if ( amount >= 200 && amount < 500) {
			if ( promocode == 2001 ) {
				discount = 0.2;
				System.out.println("Promocode "+promocode+" applied successfully !!!");
				System.out.println("Please pay "+(amount - ( amount * discount))+" after "+(discount*100)+"% discount");
			}
			else {
				System.out.println("You are eligible for promocode 2001");
			}
		}else if ( amount >= 500 && amount < 1000) {
			if ( promocode == 3001 ) {
				discount = 0.3;
				System.out.println("Promocode "+promocode+" applied successfully !!!");
				System.out.println("Please pay "+(amount - ( amount * discount))+" after "+(discount*100)+"% discount");
			}
			else {
				System.out.println("You are eligible for promocode 3001");
			}
		}else if ( amount >= 1000) {
			if ( promocode == 5001 ) {
				discount = 0.5;
				System.out.println("Promocode "+promocode+" applied successfully !!!");
				System.out.println("Please pay "+(amount - ( amount * discount))+" after "+(discount*100)+"% discount");
			}
			else {
				System.out.println("You are eligible for promocode 5001");
			}
		}
		
		// without final switch case not accept variables
		final int netBanking = 1;
		final int CardPay = 2;
		final int amazonPay = 3;
		final int googlePay = 4;
		
		int userSelect = amazonPay;
		
		switch (userSelect) {
		case netBanking:
			System.out.println("User selected NetBanking");
			break;

		case CardPay:
			System.out.println("User selected CardPay");
			break;
		case amazonPay:
			System.out.println("User selected amazonPay");
			break;
		case googlePay:
			System.out.println(" user selected GooglePay");
		default:
			System.out.println("Invalid selection");
			break;
		}
		
		
	}

}
