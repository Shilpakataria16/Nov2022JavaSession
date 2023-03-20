package OOP_Inheritance;

public class BMW extends Car{
	//Method overriding
	//when we have a method in parent class and same
	//method in child class with the same method name
	//with the same number of parameters
	//with the same sequence of parameters
	//with the same return type
	
	@Override
	public void start() {
		System.out.println("BMW--start");
	}
	public void autoParking() {
		System.out.println("BMW--auto parking");
	}
	
	
	public static void billing() {
		System.out.println("BMW - billing");
	}
	//below methods are overloaded and overridden
	@Override
	public void payment(String cc,int cvv) {
		System.out.println("BMW payment using: "+cc+":"+cvv);
	}
	@Override
	public void payment(String upi) {
		System.out.println("BMW payment using: "+upi);
		
	}
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
}
