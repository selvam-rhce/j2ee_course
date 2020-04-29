package dev.selvam;

public class BreakAndContinue {

	public static void main(String[] args) {
		double[] productPrices = {100.20, 432.43, 234.54, 643.98, 843.1};
		double searchItem = 100.20;
		
		for ( int idx = 0; idx < productPrices.length; idx++) {
			System.out.println(">>> Searching ");
			if ( productPrices[idx] == searchItem) {
				System.out.println("Fount "+searchItem+" is at "+idx+" index");
				break;
			}
			
		}
		
		// usecase: update offer 50% if price more than 200
		System.out.println("####### Applying 50% discount for productprice more than 200 #########");
		System.out.println("*********** Before discount ***********");
		for ( int idx = 0; idx < productPrices.length; idx++) {
			System.out.println(productPrices[idx]);
		}
		
		for ( int idx = 0; idx < productPrices.length; idx++) {
			if ( productPrices[idx] < 200) {
				continue;
			}
			productPrices[idx] -= productPrices[idx] * 0.50;

	}
		System.out.println("*********** After discount ***********");
		for ( int idx = 0; idx < productPrices.length; idx++) {
			System.out.println(productPrices[idx]);
		}

}
}
