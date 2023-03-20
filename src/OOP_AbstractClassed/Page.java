package OOP_AbstractClassed;

public abstract class Page {
	//2 abstract methods and 2 non abstract methods
	//0% abstraction - no abstraction methods 
	//x% abstraction - partial abstraction
	//100% abstraction - all abstract methods
	
	//can not create object of abstract class
	//but can we create the constructor of the abstract class
	//we can create the constructor and it will be called when we create the
	//object of child class
	
	public Page() {
		System.out.println("Page -- constructor");
	}
	
	public abstract void title();
	
	public abstract void url();
	
	//can not be overriden
	public final void displayLogo() {
		System.out.println("Page -- logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("Page loading time is 10 secs");
	}
	//static method can not be abstract
	public static void pageCycle() {
		System.out.println("Page Cycle");
	}
}
