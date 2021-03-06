package fisglobal;
// Is-a Relationship is provided in this code

class Box2D{  // Base Class
	int length;
	int breadth;
	Box2D(){
		length=1;
		breadth=2;
	}
	
	public void calArea() {
		System.out.println("The area is : "+(length*breadth));
	}
}

class Box3D extends Box2D{  // Derived Class
	int height;
	Box3D(){
		height=3;
	}
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}
}
/*
class Box3D{
	int length;
	int breadth;
	int height;
	Box3D(){
		length=1;
		breadth=2;
		height=3;
	}
	public void calArea() {
		System.out.println("The area is : "+(length*breadth));
	}
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}
}
*/
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Box3D b2 = new Box3D();
		b2.calArea();  // is called from Box2D
		b2.calVolume();  // is from its own method called Box3D
	}

}
