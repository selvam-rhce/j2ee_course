package dev.selvam;

public class Arrays {

	public static void main(String[] args) {
		// different types of array declarationo
		
		int a[] = {5,6, 7,8,9,10};
		System.out.println("The format1 : int a[] = {5,6, 7,8,9,10};");
		int[] a1 = {5,6, 7,8,9,10};
		System.out.println("The format2 : int[] a1 = {5,6, 7,8,9,10};");
		int b[] = new int[5];
		b = new int[]{5,6,7,8,9};
		System.out.println("The format3 : int b[] = new int[5]; b = new int[]{5,6,7,8,9};");
		
		// to print array
		System.out.println("all elements of a[]");
		for ( int i = 0; i < a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
