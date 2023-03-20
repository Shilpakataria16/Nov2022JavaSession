package OOP_AbstractClassed;

public class LoginPage extends Page{

	@Override
	public void title() {
		System.out.println("LP - title");
		
	}

	@Override
	public void url() {
		System.out.println("LP - url");
		
	}

	public void resetPwd() {
		System.out.println("LP-reset pwd");
	}
	@Override
	public void pageLoadingTime() {
		System.out.println("Page loading time is 5 secs");
	}
	//Method hiding: static method can not be overridden but child class can have same 
	//static method
	public static void pageCycle() {
		System.out.println("Page Cycle");
	}
}
