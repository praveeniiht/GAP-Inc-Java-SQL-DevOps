package collections;

public class Employee implements Comparable<Employee>{
	
	String name;
	String dept;
	String desg;
	public Employee() {
		
	}
	public Employee(String name, String dept, String desg) {
		super();
		this.name = name;
		this.dept = dept;
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", dept=" + dept + ", desg=" + desg + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return -(this.desg.compareTo(e.getDesg()));
	}

}
