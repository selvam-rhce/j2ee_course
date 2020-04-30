package dev.selvam.module1.ifCondition;

public class Qus1_checkVote {

	public static void main(String[] args) {
		
		int candidate1Age = 22;
		int candidate2Age = 12;
		int candidate3Age = 65;

		int votingAgeLimit = 18;
		
		
		System.out.println("Candidate \t Eligible for voting?");
		System.out.println("");
		
		// check Candidate1
		if ( candidate1Age > votingAgeLimit ) {
			System.out.println("Candidate1 \t Yes");
		}
		else {
			System.out.println("Candidate1 \t No");
		}
		
		// check Candidate2
		if ( candidate2Age > votingAgeLimit ) {
			System.out.println("Candidate2 \t Yes");
		}
		else {
			System.out.println("Candidate2 \t No");
		}
		
		// check Candidate3
		if ( candidate3Age > votingAgeLimit ) {
			System.out.println("Candidate3 \t Yes");
		}
		else {
			System.out.println("Candidate3 \t No");
		}
		
		
		
	}

}
