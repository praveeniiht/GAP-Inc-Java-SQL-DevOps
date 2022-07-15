package gap1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int a=10,b=2;
		
		try {
			if(a<b)
				throw new NullPointerException();
			else
				throw new StringIndexOutOfBoundsException();
		}
		catch(NullPointerException e) {
			System.out.println("inside the null pointer exception ");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("inside stringindex out of bounds exception ");
		}
		finally {
			
		}

	}

}
