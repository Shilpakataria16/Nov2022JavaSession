package SeleniumSessions;

public class Application {
	//Method overloading: OOP
	//Method overloading means within same class. We have diff methods
	//1. Same name
	//2. with different number of parameters with diffrent type
	//3. with different sequence of parameters
	//4. return type does not matter
	
	//Poly(Many)+morphism(Forms) -- OOP
	//compile time (static)
	
	public void test() {//0 param
		System.out.println("test -0 param");
	}
	public void test(int i) {//1 param
		System.out.println("1 param: "+i);
	}
	public void test(String str) {//1 param
		
	}
	public void test(int i,int j) {//2 params
		
	}
	public void test(int i,String j) {//2 params
		
	}
	public void test(String i,int j) {//2 params
		
	}
	
	//examples:
	//login:
	public void login() {
		
	}
	public void login(String uName,String pwd) {
		
	}
	public void login(String uName,String pwd,String role,int otp) {
		
	}
	
	//search
	public void search() {
		
	}
	public void search(String prodName) {
		
	}
	public void search(String prodName,int price) {
		
	}
	public void search(String prodName,int price,String color) {
		
	}
	//payment
	public void doPayment(String cc,String cvv) {
		
	}
	public void doPayment(String upi) {
			
	}
	public void doPayment(String un,String pwd,int otp) {
		
	}	
	public static void main(String[] args) {
		Application obj = new Application();
		obj.test();
		obj.test(20);
		obj.test("test");
		
	}

}
