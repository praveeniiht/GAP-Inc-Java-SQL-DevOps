package collections;
class Test{
	public static void testing() {
		System.out.println("Inside the testing method...");
	}
	public void nontesting() {
		System.out.println("inside the non testing method...");
	}
}

public class MethodReferencingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable r = ()->System.out.println("Inside the thread example");
		Test test = new Test();
		Runnable r = test::nontesting;
		Thread t = new Thread(r);
		t.start();
	}

}
