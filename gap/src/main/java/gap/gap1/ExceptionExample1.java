package gap1;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=2;
		double c;
		String str="HAI";
		try {
		c=a/b;
		System.out.println("The quot is :"+c);
		Object String;
		if(str.equals("sample")) {
			String s="tested";
		}
		if(str.charAt(10)=='a')
			System.out.println("helloi");
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator has zero value, so cannot calculate..");
		}
		catch(NullPointerException e) {
			System.out.println("tried accessing null value...");
		}
		catch(RuntimeException e) {
			System.out.println("parent is handled...");
		}
		
		finally {
			System.out.println("inside the finally block.");
		}
		System.out.println("After the finally block...");
	}

}
