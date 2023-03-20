package MethodCalling;

public class Employee {
	String name;
	int age;
	
	public int add(int a,int b) {
		System.out.println("sum of 2 numbers");
		int sum = a+b;
		return sum;
	}
	
	public void getInfo(Employee emp) {
		emp.name="tester";
		emp.age=25;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		//e1.add(10, 20);//call by value
		
		System.out.println(e1.name+" "+e1.age);
		e1.getInfo(e1);//call by reference
		//1 object can have more than 1 ref
		//emp=e1
		System.out.println(e1.name+" "+e1.age);
	}

}
