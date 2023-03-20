package SeleniumSessions;

public class Car {
	String name;
	int price;
	String color;
	static final int wheels=4;
	//variable declared with final keyword - value can not be changed
	//static can be used only for class. can not be used for local variables
	//java will create only 1 copy of static variable
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public static void speedTest() {
		System.out.println("Car -- speed test");
	}
	public static void main(String[] args) {

		int i =10;//local variable
		final int days =7;
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 90;
		c1.color = "Red";
		
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 80;
		c2.color = "White";
		
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
		
		//how to access static variables
		//1. direct calling
		System.out.println(wheels);
		System.out.println(c1.name+ " " + c1.price + " " + c1.color + wheels);
		
		//2. by using class name:
		System.out.println(Car.wheels);
		System.out.println(c1.name+ " " + c1.price + " " + c1.color + Car.wheels);
		
		//how to call static methods
		//1. direct calling
		speedTest();
		c1.start();
		
		//2. by using class name
		//static stuff can be accessed by object reference name with the warning
		Car.speedTest();
		c1.speedTest();
		System.out.println(c1.wheels);
		
	}

}
