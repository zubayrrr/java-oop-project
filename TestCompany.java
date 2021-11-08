package java_oops_project;

public class TestCompany {
	
	public static void main(String[] args) {
		
		Employee alex = new Employee("Alex Rod", 6);
		Employee linda = new Employee("Linda Berry", 7);
		Employee john = new Employee("John Doe", 3);
		Employee sara = new Employee("Sara Time", 7);
		Employee james = new Employee("James Doe", 4);
		
		Department sales = new Department("XYZ Sales");
		Department IT = new Department("XYZ IT");
		
		sales.addEmployee(alex);
		sales.addEmployee(linda);
		sales.addEmployee(john);
		
		IT.addEmployee(sara);
		IT.addEmployee(james);
		
		sales.describe();
		IT.describe();
	}
}