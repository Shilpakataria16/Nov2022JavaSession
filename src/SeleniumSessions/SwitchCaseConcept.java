package SeleniumSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser="chrome";
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("firefox is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		default:
			System.out.println("invalid browser");
			break;
		}

		//marks grading
		//can not be used like this. Need to provide range of numbers
		int marks=90;
		switch (marks) {
		case 90:
			System.out.println("Grade A");
			break;
		case 80:
			System.out.println("Grade B");
			break;
		case 70:
			System.out.println("Grade C");
			break;
		default:
			System.out.println("FAIL");
			break;
		}
		
		//swtich case can not be used for float
		/*
		 * float weight = 70.2f; switch (weight) {
		 * 
		 * }
		 */
		
		char ch='h';
		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
			
		default:
			System.out.println("not a vowel");
			break;
		}
		
		//switch case can be used for byte,short,int,String,char
		//long not allowed
		/*
		 * byte num=10; switch (num) { case 10:
		 * 
		 * break;
		 * 
		 * default: break; }
		 */
		
		//Real time examples of switch case use case
		//1. cross browser logic
		//2. ecommerce app-select multiple countries-language
		//3. multi environment- DEV,QA,STAGE,UAT,PROD
		//4. API methods: GET,POST,PUT,DELETE
		//5. Dropdown: Single,multiple,all
		//6. Payment methods: Credit card, UPI,Paypal,WU,Bank
		
		
	}
	
	
			

}
