package collections;

public class Student {
	
	String name;
	String branch;
	public Student() {
		
	}
	public Student(String name, String branch) {
		this.name=name;
		this.branch=branch;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", branch=" + branch + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
