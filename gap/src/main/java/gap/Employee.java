package gap;

public class Employee {

	private String name;
	private String department;
	private String desgination;
	static String organiation;

	public String getOrganiation() {
		return organiation;
	}

	public void setOrganiation(String organiation) {
		this.organiation = organiation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	public void getDetails() {
		
	}
	public void printDetails() {
		
	}
	public static void test() {
		System.out.println("Inside the static test method...");
	}

	public   void working() {
		int noh;
		
		System.out.println(name + " is working in" + department + " as " + desgination+" in "+organiation);
	}

	public void sleeping() {
		System.out.println(name + " is sleeping in " + department);
	}

}
