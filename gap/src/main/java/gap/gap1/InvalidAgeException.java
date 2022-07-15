package gap1;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		super("Age cannot be less than zero or greater than 100");
	}

}
