package OOP_Constructor;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp1=new LoginPage("admin@gmail.com","admin123");
		if(lp1.doLogin()) {
			System.out.println("display menu items");
		}
		
		LoginPage lp2=new LoginPage("admin2@gmail.com","admin321");
		System.out.println(lp2.userName + " " + lp2.pwd);
	}

}
