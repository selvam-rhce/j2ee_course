package dev.selvam.module1.whileLoop;

public class Qus4_reverseDigitOfNumber {

	public static void main(String[] args) {
		
		// reverse given number
		// sample input = 100002
		// the output = 200001
		
		int givenNumber = 982374;
		int reverseDigit = 0;
		
		System.out.println("Given Number = "+givenNumber);
		
		while (givenNumber !=0 ) {
			reverseDigit = reverseDigit * 10 + (givenNumber%10);
			givenNumber /= 10;
		}

		System.out.println("Reverse Number = "+reverseDigit);
	}

}
