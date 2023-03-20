package String;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s="Selenium";
		s="Cypress"; //Selenium is not deleted from memory
		//s will point to Cypress
		//Garbage Collector will remove Selenium
		String s1="Selenium";
		System.out.println(s1); 
		String t="Selenium";
		System.out.println(s1+"automation");
		System.out.println(s1);
		
		String p="Naveen";
		p=p+"Automation Labs"; //create a new entry
		System.out.println(p);
		
		String t2="Naveen";
		System.out.println(t2);
		
		String r="  hello selenium  ";
		r=r.trim();
		System.out.println(r);
		
	}

}
