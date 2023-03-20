package OOP_Inheritance;

//Multilevel inheritance
public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();//Method overriding-child class method is called
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		BMW.billing();
		Car.billing();
		
		BMW.display();
		b.running();
		b.payment("tester@icicibank");
		b.engine();
		
		System.out.println("--Audi--");
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.engine();
		
		//Inheritance- re-usability
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.payment("tester@hdfc");
		c.engine();
		
		//child class object can be referred by Grand parent class reference variable
		Vehicle v = new BMW();
		v.petrolEngine();
		
		
		
		//child class object can be referred by parent class reference variable
		//top/up casting
		Car c1 =new BMW(); //child class object is referred by parent class reference variable
		c1.start();
		c1.stop();
		c1.refuel();
		//individual methods can not be called from parent class reference
		//reference type check - at individual method(security check)
		
		//down casting
		//parent class object can be referred by child class reference variable
		BMW b1 =(BMW)new Car(); //ClassCastException at runtime
		
		//Method overriding - Polymorphism - runtime or dynamic polymorphism
		
		BMW b2=(BMW)new Vehicle();
	}

}
