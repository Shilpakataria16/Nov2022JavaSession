package SeleniumSessions;

public class StringConcatenation {
	public static void main(String[] args) {
		String x= "hello";
		
		String y="world";
		
		int a=100;
		int b=200;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x+y);
		
		System.out.println(x+a);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		
		double d1=12.33;
		double d2=23.44;
		System.out.println(x+y+d1+d2);
		
		System.out.println("the value of a: "+a);
		System.out.println("the sum is : "+(a+b));
		
	}

}
