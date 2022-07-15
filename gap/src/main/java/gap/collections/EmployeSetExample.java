package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class EmployeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Praveen","finance","clerk");
		Employee e2 = new Employee("Kumar","marketing","executive");
		Employee e3 = new Employee("Anil","operations","manager");
		
		HashSet<Employee> hs = new HashSet();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e2);
		System.out.println(hs);
		
		TreeSet<Employee> ts = new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e2);
		System.out.println(ts);
		

	}

}
