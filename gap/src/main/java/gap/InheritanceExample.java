package gap;

class Base {
	int x;
	int y;
	Base(int x, int y){
		this.x =x ;
		this.y=y;
		System.out.println("Inside the base class");
	}
	
	public void showBaseDetails() {
		System.out.println("x = "+x+" y= "+y);
	}
	
	public void display() {
		System.out.println("inside the base display method....");
	}
	
	@Override
	public String toString() {
		return "Hello";
	}
}

class Derived extends Base{
	int x;
	int y;
	Derived(){
		super(10,20);
		x=40;
		y=50;
		System.out.println("Inside the derived class");
	}
	public void showDerivedDetails() {
		System.out.println("x = "+x+" y= "+y);
	}
	
	@Override
	public void display() {
		//super.display();
		System.out.println("inside the dervied display method....");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Base b = new Base(200,300);
		System.out.println(b);
		Derived d =new Derived();
		d.showBaseDetails();
		d.showDerivedDetails();
		d.display();
	}

}
