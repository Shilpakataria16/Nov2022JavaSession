package SeleniumSessions;

public class User {
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		User u1= new User();
		u1.name = "Ryan";
		u1.age = 8;
		u1.city = "Plano";

		User u2= new User();
		u2.name = "Riley";
		u2.age = 5;
		u2.city = "Plano";
		
		User u3= new User();
		u3.name = "Nikhil";
		u3.age = 38;
		u3.city = "Plano";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u1 = u2; //u1 will start pointing to u2
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u2 = u3;//u2 will point to u3
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u3=u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		
	}

}
