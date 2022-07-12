package gap;

import java.util.Scanner;

public class Arithmetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,sum,diff,prod;
		double quot;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		a = sc.nextInt();
		System.out.println("Enter second value");
		b = sc.nextInt();
		sum=a+b;
		diff=a-b;
		prod=a*b;
		quot=a/b;
		System.out.println("The sum is : "+sum);
		System.out.println("The diff is : "+diff);
		System.out.println("The prod is : "+prod);
		System.out.println("The quotient is : "+quot);
		


	}

}
