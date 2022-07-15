package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class IterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c = x-> System.out.println(x*x);
		
		
		//ArrayList<Integer> nos = new ArrayList();
		LinkedList<Integer> nos = new LinkedList();
		nos.add(10);
		nos.add(5);
		nos.add(3);
		
		nos.forEach(c);
		
		
		
		System.out.println(nos);
		ArrayList<String> ar = new ArrayList();
		// LinkedList ar = new LinkedList();
		ar.add("India");
		ar.add("China");
		ar.add("Japan");
		ar.add("America");
		ar.add("China");

		// Iteration through for loop

		for (String country : ar) {
			System.out.println(country);
		}
		// Iterator interface
		System.out.println("through iterator...");
		Iterator itr = ar.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		ListIterator<String> ltr = ar.listIterator();
		System.out.println("list in forward direction");
		while (ltr.hasNext())
			System.out.println(ltr.next());
		
		System.out.println("list in backward direction");
		while (ltr.hasPrevious())
			System.out.println(ltr.previous());
		
		System.out.println("elements using forEach");
		ar.forEach(System.out::println);
		
		

	}

}
