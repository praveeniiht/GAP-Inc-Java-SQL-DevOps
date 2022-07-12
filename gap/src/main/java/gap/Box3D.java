package gap;
/*
public class Box3D {
	int length;
	int breadth;
	int height;
	public void calArea() {
		System.out.println("The area is : "+(length*breadth));
	}
	
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}

}
*/

public class Box3D extends Box{
	
	Box3D(){
		height=4;
	}
	
	int height;
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}

}






