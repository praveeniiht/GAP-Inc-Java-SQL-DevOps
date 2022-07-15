package gap1;

import java.util.Scanner;

public class TestVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		Voting voting = new Voting();
		try {
			voting.checkEligibility(age);
		}
		catch(InSufficientAgeException e) {
			System.out.println(e);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
