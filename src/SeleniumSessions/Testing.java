package SeleniumSessions;

public class Testing {

	//WAF
	//pass the student name(String)
	//return student marks
	public int getStidentMarks(String studentName) {
		System.out.println("Getting marks for student "+ studentName);
		int marks = -1;
		
		if(studentName.equals("Ravi")) {
			//return 100;
			marks = 100;
		}
		else if(studentName.equals("Rashmi")) {
			//return 90;
			marks =90;
		}
		else if(studentName.equals("Rashi")) {
			//return 10;
			marks = 10;
		}
		else {
			System.out.println("Student is not found "+ studentName);
			//return -1;
		}
		return marks;
	}
	
	//WAF
	//launch browser:FF/ch/SF/IE
	//name:launchBrowser(browserName: String)
	//logic
	//return boolean true/false
	public boolean launchBrowser(String browserName) {
		System.out.println("launching browser: "+ browserName);
		boolean flag = false;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched..");
			flag = true;
			break;
		case "firefox":
			System.out.println("firefox is launched..");
			flag = true;
			break;
			
		case "safari":
			System.out.println("safari is launched..");
			flag = true;
			break;
		case "IE":
			System.out.println("IE is launched..");
			flag = true;
			break;

		default:
			System.out.println("Browser is not found..");
			break;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Testing obj = new Testing();
		int m1 = obj.getStidentMarks("yug");
		System.out.println(m1);
 
		if(obj.launchBrowser("chrome")) {
			System.out.println("launch the url");
		}
		else
			System.out.println("no need to enter url");
	}

}
