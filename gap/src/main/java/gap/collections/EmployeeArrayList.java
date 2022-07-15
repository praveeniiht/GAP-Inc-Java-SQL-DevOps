package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Praveen","finance","clerk");
		Employee e2 = new Employee("Kumar","marketing","executive");
		Employee e3 = new Employee("Anil","operations","manager");
		ArrayList<Employee> emps = new ArrayList();
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		System.out.println(emps);
		
		for(Employee e : emps)
			System.out.println(e.getName()+" "+e.getDept()+" "+e.getDesg());
		System.out.println("iteration using list iterator");
		ListIterator<Employee> ltr = emps.listIterator();
		while(ltr.hasNext()) {
			Employee e = ltr.next();
			System.out.println(e.getName()+" "+e.getDept()+" "+e.getDesg());
		}
			
	}

}
