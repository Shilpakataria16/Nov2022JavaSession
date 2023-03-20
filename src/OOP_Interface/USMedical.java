package OOP_Interface;

public interface USMedical extends WHO,USHG{
	//interface variables are static
	int min_fee=10; //by default it is static and final variable
	//In interface can not have Method body only declaration - no business logic
	//multiple inheritance is allowed in case of interfaces
	//Method does not have body - Abstract method
	//can not have constructor of the interface
	//can not create object of interface
	
	//abstract methods 
	//final-NA
	//static -NA
	//private - NA
	
	public void cardioServices();
	public void neuroServices();
	public void physioServices();
	public void emergencyServices();
	
	public void covidVaccination();
	
	//jdk1.7: 100% abstraction
	//jdk 1.8: default non static methods: ~100%
	
	//after JDK 1.8:
	//1. static method with method body
	public static void taxCalculation() {
		System.out.println("US - taxCalculation");
	}
	
	//in interface no final method is allowed
	
	//2. default methods: not static
	default void getMedicalServices() {
		System.out.println("US - getMedicalServices");
	}
	
	
	//abstraction - hiding implementation
	//encapsulation - hiding private data members
}
