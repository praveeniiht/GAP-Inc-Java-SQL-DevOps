package gap1;

public class InSufficientAgeException extends RuntimeException{
	public InSufficientAgeException() {
		super("Age is less than 18 ");
	}
}
