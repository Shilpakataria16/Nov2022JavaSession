package DataConversion;

public class Wrapper {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		//String to int conversion
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String y="100USD";
		System.out.println(y+20);
		String curr[] = y.split("USD");
		
		int j=Integer.parseInt(curr[0]);//NumberFormatException
		System.out.println(j+20);
		
		//String to double
		String z="12.33";
		System.out.println(z+20);
		
		double d=Double.parseDouble(z);
		System.out.println(d+20.22);
		
		//String to boolean
		String headless = "true";
		//Boolean.parseBoolean(headless);//true
		if(Boolean.parseBoolean(headless)) {
			System.out.println("run in headless");
		}
		
		//int to String
		int k=100;
		String k1 = String.valueOf(k);//"100"
		System.out.println(k1+20);
		
		//boolean to String
		boolean flag=true;
		String f1 = String.valueOf(flag);//"true"
		
		//Finding Max and Min value using Wrapper classes
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}

}
