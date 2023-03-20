package SeleniumSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// > >= < <= == !=
		//Conditional operators for primitive data types
		int i=10;
		int j=20;
		
		if(i==j)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		if(j>=i)
			System.out.println("j is greater than i");
		else
			System.out.println("i is greater than j");
		
		int total=100;
		if(total!=100)
			System.out.println("Bye");
		else
			System.out.println("Hi");
		
		int marks=90;
		if(marks<=100) {
			System.out.println("Valid marks");
			if(marks>=90) {
				System.out.println("A Grade");
				if(marks>=95) {
					System.out.println("Eligible for schloarship");
					if(marks==100)
						System.out.println("100% fee waived off");
				}
			
			}
			else {
				if(marks<=80)
					System.out.println("B Grade");
			}
		}
		else
			System.out.println("Not valid marks");
		
		
		//if if if if else
		/*
		 * String browser = "chrome"; 
		 * if(browser.equals("chrome"))
		 * 		System.out.println("chrome is launched"); 
		 * if(browser.equals("firefox"))
		 * 		System.out.println("firefox is launched"); 
		 * if(browser.equals("safari"))
		 * 		System.out.println("safari is launched"); 
		 * if(browser.equals("edge"))
		 * 		System.out.println("edge is launched"); 
		 * else
		 * System.out.println("invalid browser");
		 */
		
		//Not optimized code
		String browser="firefox";
		if(browser.equals("chrome"))
			System.out.println("chrome is launched");
		else if(browser.equals("firefox"))
			System.out.println("firefox is launched");
		else if(browser.equals("safari"))
			System.out.println("safari is launched");
		else if(browser.equals("edge"))
			System.out.println("edge is launched");
		else
			System.out.println("invalid browser");
	}
	
	
		

}
