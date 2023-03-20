package WebDriver_Architecture;

public class NaveenAutoAppTest {
	//static WebDriver driver;
	public static void main(String[] args) {
		//chrome
		String browser="chrome";
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FireFoxDriver();
		}
		else {
			System.out.println("plz pass the right browser");
		}
		driver.get("https://www.naveenautomationlabs.com");
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		driver.get("https://www.naveenautomationlabs.com");
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Naveen Automation Labs")) {
			System.out.println("title is correct");
		}
		else
			System.out.println("incorrect title");
		
		driver.sendKeys("emailid", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginBtn");
		driver.closeBrowser();
	}
}
