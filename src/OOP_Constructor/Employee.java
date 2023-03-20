package OOP_Constructor;

public class Employee {
	//constructor is not a function but it looks like a function. 
	//It has same name as class name
	//Constructor can not return anything - no return type for constructor
	//It helps to control the object creation. restrict object creation
	//Constructor is called when you create the object
	//constructor overloading is possible in Java
	
	//default constructor..0 param
	public Employee() {
		System.out.println("default constructor");
		
	}
	public Employee(int a) {//1 param
		System.out.println("1 param constructor"+a);
		
	}
	public Employee(int a,int b) {//2 param
		System.out.println("2 param constructor"+a+b);
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10,20);
		
	}

}
