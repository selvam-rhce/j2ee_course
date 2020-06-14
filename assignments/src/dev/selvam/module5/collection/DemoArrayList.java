package dev.selvam.module5.collection;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> myarlist = new ArrayList<Integer>();
		
		// insert 1 to 10 in arraylist
		for ( int i=1; i<=10; i++) {
			myarlist.add(i);
		}
		
		// print arraylist
		System.out.println("############ ArrayList #########");
		for (Integer arlistelement : myarlist) {
			System.out.println(arlistelement);
			
		}
	}

}
