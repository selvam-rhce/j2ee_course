package dev.selvam;

public class Iterations {

	public static void main(String[] args) {

		double[] productPrices = { 101.24, 202.43, 543.23, 145.2};
		
		System.out.println("####### using for loop ########");
		System.out.println("Product prices after discount");
		for ( int i=0; i<productPrices.length; i++) {
			System.out.println("productPrices["+i+"] : "+ ( productPrices[i] - (productPrices[i] * 0.50)));
		}
		
		System.out.println("###### using while loop #######");
		System.out.println("Product prices after discount");
		int i=0;
		while( i < productPrices.length) {
			System.out.println("productPrices["+i+"] : "+ ( productPrices[i] - (productPrices[i] * 0.50)));
			++i;
		}
		
		System.out.println("###### using do while loop #######");
		System.out.println("Product prices after discount");
		i=0;
		do {
			System.out.println("productPrices["+i+"] : "+ ( productPrices[i] - (productPrices[i] * 0.50)));
			++i;
		}while( i < productPrices.length);
		
		
	}

}
