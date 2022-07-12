package gap;

public class GapEmployee {
	
	String name;
	String desg;
	//Address address;
	
	public GapEmployee(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void getAddress(Address address) {
		System.out.println(name+" "+desg+" "+address.getDno()+" "+address.getCity());
	}

}
