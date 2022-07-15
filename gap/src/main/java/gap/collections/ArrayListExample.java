package collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		//LinkedList ar = new LinkedList();
		ar.add("India");
		ar.add("China");
		ar.add("Japan");
		ar.add("America");
		ar.add("China");
		ar.add(null);
		System.out.println(ar);
		
		if(ar.contains("india"))
				System.out.println("Found");
		else
				System.out.println("Not found..");
		
		ar.remove(0);
		System.out.println(ar);
		ar.remove("America");
		System.out.println(ar);
		
		

	}

}
