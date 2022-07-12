package gap;

class Box{
	int length;
	int breadth;  // Instance variables
	Box(){
		length=3;
		breadth=2;
	}
	Box(int length , int breadth){
		this.length=length;
		this.breadth=breadth; // method variables;
	}
	public void area() {
		System.out.println("The area is : "+(length*breadth));
	}
}

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box(10,20);
		b.area();

	}

}
