package String;

public class StringReverse {
	
	//reverseString()
	//input param:String str
	//return: reversed string
	public static String reverseString(String str) {
		//null check
		if(str==null) {
			System.out.println("Null is not allowed. Please pass the right value");
			return null;
		}
		int len=str.length();
		//length check if length = 1
		if(len==1) {
			return str;
		}
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		return rev;
		
	}
	
	public static void main(String[] args) {
		String r1 = reverseString("Selenium");
		System.out.println(r1);
		
		r1 = reverseString("Selenium Automation");
		System.out.println(r1);
		
		r1 = reverseString(null);
		System.out.println(r1);
		
		r1 = reverseString("10065");
		System.out.println(r1);
		
		r1 = reverseString("J");
		System.out.println(r1);
	}

	//123-->321
	//int reverse
}
