package java_oops_project;

public class Employee {
	
	private String empName;
	private int grade;
	
	public int getGrade() {
		return grade;
	}

	public Employee(String empName, int grade) {
		this.empName = empName;
		this.grade = grade;
	}
	
//	public String getEmpInfo() {
//		return empName + "( " + grade + ")";
//	}
	
	// whenever you print an object, toString is executed.
	// basically overriding the "toString" of the Object class
	public String toString() {
		return empName + "(" + grade + ")";
		
	}
}