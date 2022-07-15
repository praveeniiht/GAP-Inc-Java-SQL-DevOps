package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}
	
}

class BranchComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getBranch().compareTo(s2.getBranch());
	}
	
}
*/

public class TestStudentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> compname = (s1,s2)->s1.getName().compareTo(s2.getName());
		Comparator<Student> compbranch = (s1,s2)->s1.getBranch().compareTo(s2.getBranch());
		Student s1 = new Student("mohan","cse");
		Student s2 = new Student("karan","mech");
		Student s3 = new Student("amar","biotech");
		
		ArrayList<Student> ar = new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println("Elements without sorting..");
		System.out.println(ar);
		
		Collections.sort(ar, compname);
		System.out.println("Elements on name sorting basis");
		System.out.println(ar);
		
		Collections.sort(ar, compbranch);
		System.out.println("Elements on branch sorting basis");
		System.out.println(ar);

	}

}
