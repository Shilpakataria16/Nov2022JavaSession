package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name="Emp1";
		e1.age=30;
		
		e1.setSalary(12.33);
		System.out.println(e1.getSalary()+ " " + e1.name + " " + e1.age);
		
		//POST
		Company c1=new Company("IBM",1000,500);
//		c1.setName("IBM");
//		c1.setEmpCount(1000);
//		c1.setSharePrice(500);
		
		//GET Call
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());
		System.out.println(c1.getEmpCount());//1000
		
		//PUT Call
		c1.setEmpCount(2000);
		
		//GET Call
		System.out.println(c1.getEmpCount());
		
		Registration reg = new Registration("Puja", 28, "Mumbai", "11/02/1991");
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		
		reg.setAddress("Pune");
		System.out.println(reg.getName());
		System.out.println(reg.getAddress());
		
		Registration reg1=new Registration("Tina", 30);
		reg1.setDob("02-02-1999");
		reg1.setAddress("Indore");
		
		Browser br = new Browser();
		br.launchBrowser();
	}

}
