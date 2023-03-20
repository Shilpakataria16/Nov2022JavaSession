package OOP_Constructor;

public class LoginPage {
	String userName;
	String pwd;
	public LoginPage(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}
	
	public boolean doLogin() {
		System.out.println("enter the username: " + userName);
		System.out.println("enter the pwd: " + pwd);
		System.out.println("click login button");
		System.out.println("user logged in");
		return true;
	}
	public void resetPwd() {
		System.out.println("reset pwd: "+ pwd);
	}
}
