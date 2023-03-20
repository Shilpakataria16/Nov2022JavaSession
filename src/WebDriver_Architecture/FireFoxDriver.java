package WebDriver_Architecture;

public class FireFoxDriver implements WebDriver {
	public FireFoxDriver() {
		// TODO Auto-generated constructor stub
		System.out.println("Firefox is launched");
	}
	@Override
	public void findElement(String element) {
		// TODO Auto-generated method stub
		System.out.println("find element: "+ element);
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("enter url "+url);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		System.out.println("getting the page title");
		return "Test title";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("Clicking on element"+ element);
	}

	@Override
	public void sendKeys(String element, String value) {
		// TODO Auto-generated method stub
		System.out.println("enetering value"+value+"into "+element);
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("close browser");
	}

}
