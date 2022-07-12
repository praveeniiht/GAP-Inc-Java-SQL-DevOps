package gap;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee.test();

		Employee emp1 = new Employee();
		emp1.setName("praveen");
		emp1.setDepartment("Finance");
		emp1.setDesgination("Manager");
		emp1.setOrganiation("Gap Inc India Pvt Ltd");
		emp1.working();
		emp1.sleeping();
		emp1.test();

		Employee emp2 = new Employee();
		emp2.setName("kumar");
		emp2.setDepartment("accounts");
		emp2.setDesgination("team lead");
		emp2.setOrganiation("Gap");
		emp2.working();
		emp2.sleeping();

		emp1.working();

		Employee.organiation = "GAP INDIA";
		emp1.working();
		emp2.working();
		// System.out.println(name + " is working in" + department + " as " +
		// desgination+" in "+organiation);
		Employee emp3 = new Employee();
		emp3.working();

	}

}
