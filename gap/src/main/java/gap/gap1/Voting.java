package gap1;

public class Voting {
	
	int age;
	
	public void checkEligibility(int age) {
		if(age < 0 || age > 100)
			throw new InvalidAgeException();
		else if( age >0 && age <=17)
			throw new InSufficientAgeException();
		else
			System.out.println("You are eligible to vote...");
	}

}
