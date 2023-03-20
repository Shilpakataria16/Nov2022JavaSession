package OOP_Encapsulation;

public class Employee {
	public String name;
	public int age;
	private double salary;
	
	//private data member is encapsulated in public methods
	//public getter and setter
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
