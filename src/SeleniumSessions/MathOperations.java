package SeleniumSessions;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if both integer then result int
		//if 1 floating then
		
		System.out.println(10/2);
		System.out.println(9/2);
		System.out.println(9.0/2);
		System.out.println(9/2.0);
		//System.out.println(9/0);//Arithmetic exception AE
		System.out.println(0/9);
		System.out.println(0/1);
		
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		//System.out.println(0/0);//Arithmatic Exception
		System.out.println(0.0/0.0);//NaN(not a number)
		System.out.println(0.0/0);//NaN(not a number)
		System.out.println(0/0.0);//NaN(not a number)
		System.out.println(100/0.0);//Infinity
		
		System.out.println(10%2);
		System.out.println(9%2);
		System.out.println(9.2%2);
	}

}
