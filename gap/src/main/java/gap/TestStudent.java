package gap;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("praveen","cse");
		System.out.println(student1.getName()+" "+student1.getBranch());
		
		
		Student student2 = new Student("kumar","civil");
		System.out.println(student2.getName()+" "+student2.getBranch());
		
		Student student3  = new Student();
		System.out.println(student3.getName()+" "+student3.getBranch());
		
		Student student4  = new Student("Anil");
		System.out.println(student4.getName()+" "+student4.getBranch());

	}

}
