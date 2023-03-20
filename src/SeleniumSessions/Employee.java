package SeleniumSessions;

public class Employee {

	//class: category of Objects,blueprint/template of objects
	//object: is the physical entity
	
	//class variables
	String name;
	int age;
	String city;
	double salary;
	
	
	public static void main(String[] args) {
		//create object of the class;
		//using new keyword
		Employee e1 = new Employee();
		//e1 object reference name
		// R.H.S. is object
		//Body object , name(person name) object reference name
		
		e1.name = "Tom";
		e1.age = 25;
		e1.city = "LA";
		e1.salary=12.23;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.city +" "+ e1.salary);
		//Java will create copy of variables

		Employee e2 = new Employee();
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		System.out.println(e2.city);
		
//		Employee e3 = new Employee();
//		e3=null; //null reference object
//		e3.name = "naveen";
		
		
		//object without reference - No ref object
		new Employee().name = "Shilpa"; //object with no name
		new Employee().age = 30;
		
		System.gc();//to call garbage collector
		
	}

}
