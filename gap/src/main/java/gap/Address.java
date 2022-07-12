package gap;

public class Address {
	
	int dno;
	String street;
	String city;
	String pin;
	public Address() {
		
	}
	
	
	public Address(int dno, String street, String city, String pin) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
