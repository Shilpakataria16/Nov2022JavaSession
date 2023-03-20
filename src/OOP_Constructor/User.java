package OOP_Constructor;

public class User {
	String name;//class variable
	int age;
	String email;
	String pwd;
	String phone;
	
	public boolean forgotPwd() {
		//business logic
		return true;
	}
	
	//this keyword - class variable
	//hidden constructor - default constructor will be created by JVM
	public User(String name,int age) {//local variable
		this.name = name;
		this.age = age;
	}
	public User(String name,int age,String email) {//local variable
		this.name = name;
		this.age = age;
		this.email=email;
	}
	
	
	
	public User(String name, int age, String email, String pwd) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
	}
	
	public User(String name, int age, String email, String pwd, String phone) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		User u1 = new User("Ram",25);
		System.out.println(u1.name);
		System.out.println(u1.age);
		
		User u2=new User("Lisa",30,"lisa@gmail.com");
		System.out.println(u2.name + " " + u2.age + " "+ u2.email);
		System.out.println(u2.pwd); //null
	
		User u3 = new User("Nisha",25,"nisha@gmail.com","897867569");
		System.out.println(u3.name+" "+u3.phone);
		
	}

}
