package OOP_Constructor;

public class Car {
	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	//function used for business logic
	public double getCarMileage() {
		double a =12.23;
		double b=23.33;
		double mg = a+b;
		return mg;
	}
	
	public Car(String name, String color) {
		
		this.name = name;
		this.color = color;
	}

	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public Car(String name, int price, boolean isAutomatic) {
		
		this.name = name;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}

	public Car(String name, String color, int price, boolean isAutomatic) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
	
	
}
