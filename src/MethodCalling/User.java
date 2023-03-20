package MethodCalling;

public class User {
	//1.constructor
	//2.methods-encapsulation - setter/getter
	//3.builder pattern
	//4. constructor is calling another constructor and it should be first line
	//5. can be used in method to call another method in the same class
	
	//this is used in current class constructor
	String name;
	int age;
	String city;
	
	public User(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public User(String name, int age) {
		this(name, age, "Pune");//it should be first line
		this.name = name;
		this.age = age;
	}

	public void login() {
		this.logout();
	}
	public void logout() {
		
	}
	public static void main(String[] args) {
		User u1=new User("Gaurav",30);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
	}

}
