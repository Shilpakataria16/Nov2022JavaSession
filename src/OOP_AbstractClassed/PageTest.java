package OOP_AbstractClassed;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageLoadingTime();
		lp.resetPwd();
		Page.pageCycle();
		LoginPage.pageCycle();
		
		//top casting
		//child class object can be referred by abstract parent class reference variable
		Page pg = new LoginPage();
		pg.url();
		pg.displayLogo();
		pg.pageLoadingTime();
		//reference type check will be done in top casting
		
		//down casting - Not applicable for abstract class
		
	}

}
