package SeleniumSessions;

public class MethodsInJava {
	//data members
	//1. class variables
	//2. class methods
	
	//function: piece of program
	//functions are independent
	//can not create a function inside a function
	
	//1.no input and no return
	//void means no return: function can not return anything
	public void Test() {
		System.out.println("test method");
		int a =20;
		int b=80;
		System.out.println(a+b);
	}
	
	//2. no input and some return
	
	public int getBillAmount() {
		System.out.println("get billing amount");
		int foodBills = 100;
		int drinksBills = 50;
		int totalAmt  = foodBills+drinksBills;
		return totalAmt;
	}
	
	public String getEmployeeName() {
		String name = "Shilpa";
		return name;
	}
	
	public String getName() {
		System.out.println("get name");
		return "selenium";
	}
	
	public boolean isElementExist() {
		System.out.println("check if element is present");
		boolean flag = true;
		return flag;
	}
	
	
	//3. some input and some return
	//2 variable: a and b
	//return sum of these two numbers
	//a and b are method parametrs
	public int getSum(int a,int b) {
		System.out.println("sum of 2 numbers..");
		int sum = a+b;
		return sum;
	}
	
	//input params: int,double
	//return multiplication of 2 numbers
	public double getMultiplication(int x,double y) {
		System.out.println("getMultiplication");
		double mul = x*y;
		return mul;
	}
	
	public String getEmpSalaryInfo(String empName,int bonusAmt) {
		System.out.println("emp salary");
		
		return empName+":"+bonusAmt;
	}
	
	public static void main(String[] args) {
		//call the function: we have to create object 
		MethodsInJava obj = new MethodsInJava();
		obj.Test();

		int m1 = obj.getBillAmount();
		System.out.println(m1-10);
		
		System.out.println(obj.getBillAmount());
		
		String emp = obj.getEmployeeName();
		
		if(obj.isElementExist()) {
			System.out.println("click on element");
		}
		int s1= obj.getSum(10, 20);//10 and 20 are arguments
		System.out.println(s1);
		
		int s2=obj.getSum(40, 50);
		System.out.println(s2);
		
		double mul1 = obj.getMultiplication(10, 2.2);
		System.out.println(mul1);
		
		String empInfo = obj.getEmpSalaryInfo("Shilpa", 20);
		System.out.println(empInfo);
		
	}

}
