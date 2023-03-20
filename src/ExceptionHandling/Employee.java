package ExceptionHandling;

public class Employee {
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
		try {
			Employee obj =new Employee();
			obj=null;
			obj.name="Shilpa";
			int i=9/0;
			System.out.println("hello");
		}
		//Throwable->Exception->Arithmetic
		//Errorclass-also child of Throwable class
		//Exception is coming because of code
		//Error - not because of code. Ex-Stack overflow 
		//no memory flow available
		//Memory failure,memory leakage, hardware failure
		
		//if Throwable is written then catch block will catch error too
		//catch(ArithmeticException e) {
		//catch(Error e) {
		
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Bye");
		
	}

}
