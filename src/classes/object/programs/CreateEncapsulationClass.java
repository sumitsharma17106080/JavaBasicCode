package classes.object.programs;


class Employee{
	private String name;
	private double salary;
	private String role;
	// instance variables of a class as private for Encapsulation
	
	
	public String getName() {
		return name;
	}
	public Employee(String name, double salary, String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public void details() {
		System.out.println("Employee Name=" + name + ", Salary=" + salary + ", Role=" + role);
	}

	
}

public class CreateEncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setName("Sumit");
		e1.setSalary(56789);
		e1.setRole("Project Enginner");
		Employee e2=new Employee();
		e2.setName("Ankit");
		e2.setSalary(98789);
		e2.setRole("Manager");
		
		e1.details();
		e2.details();

	}

}
