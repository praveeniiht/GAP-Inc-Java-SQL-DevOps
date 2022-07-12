package gap;

public class Student {
	
	String name;
	String branch;
	String clg;
	
	Student(){
		name="dummyname";
		branch="dummybranch";
	}
	
	Student(String n){
		name=n;
		branch="civil";
	}
	Student(String b, String c){
		
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
