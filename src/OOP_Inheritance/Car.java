package OOP_Inheritance;

public class Car extends Vehicle{
	//final:
	//1. constant value
	//2.to prevent method overriding & Method hiding
	//3. to prevent inheritance
	
	//final keyword - this method can not be overridden
	//final keyword Use case:display logo
	public void start() {
		System.out.println("Car--start");
	}
	public void stop() {
		System.out.println("Car--stop");
	}
	public void refuel() {
		System.out.println("Car--refuel");
	}
   
	//can not override static method
	//this is individual method
	//Method hiding
	public static void billing() {
		System.out.println("Car - billing");
	}
	
	//static - can not be overriden
	//final - can not be overridden
	public static final void display() {
		System.out.println("Car -- display");
	}
	public final void running() {
		System.out.println("Car -- running");
	}
	public void payment(String cc,int cvv) {
		System.out.println("Car payment using: "+cc+":"+cvv);
	}
	public void payment(String upi) {
		System.out.println("Car payment using: "+upi);
	}
	@Override
	public void engine() {
		System.out.println("car -- engine");
	}
	
}
