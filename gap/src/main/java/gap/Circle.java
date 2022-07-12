package gap;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		Scanner sc = new Scanner(System.in);
		double area,perimeter;
		System.out.println("Enter the radius of the circle");
		radius = sc.nextInt();
		area = 3.14 * radius * radius;
		perimeter = 2*3.141*radius;
		System.out.println("The area is : "+area);
		System.out.println("The perimeter is : "+perimeter);
	}
}
