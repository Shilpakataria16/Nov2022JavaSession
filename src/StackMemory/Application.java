package StackMemory;

public class Application {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m2 method");
		m1(); //infinite stacks
	}
	
	
	public static void main(String[] args) {
		Application obj = new Application();
		obj.m1();

	}

	//stack memory allocation will be created based on stack execution
}
