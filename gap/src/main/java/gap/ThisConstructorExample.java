package gap;
class MyExample{
		
	MyExample(){
		
		System.out.println("Inside the default construtor");
	}
	MyExample(int x){
		this();
		display();// allowed.
		System.out.println("Inside the single parameter construtor");
		
	}
	public void display() {
	
		System.out.println("This is user defined metho..");
	}
}

public class ThisConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyExample m1 = new MyExample();
		MyExample m2 = new MyExample(10);

	}

}
