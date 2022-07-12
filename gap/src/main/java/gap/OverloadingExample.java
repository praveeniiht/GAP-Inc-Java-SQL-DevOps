package gap;
class Test1{
	public void sample(int x) {
		System.out.println("Inside the single integer parameter method");
	}
	public void sample(int a, char z) {
		System.out.println("Inside the single integer parameter method-1");
	}
	public void sample(int x, int y) {
		System.out.println("Inside the double integer parameter method-2");
	}
	public void sample(int x, int y , int z) {
		System.out.println("Inside the triple integer parameter method");
	}
	
}

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.sample(10,20);

	}

}
