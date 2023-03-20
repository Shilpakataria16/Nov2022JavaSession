package SeleniumSessions;

public class ForLoopsConcept {

	public static void main(String[] args) {
		//1 to 10
		int i=1;
		for(;i<=10;) {
			System.out.println(i);
			i++;
		}

		/*
		 * //infinite loop for(;;)
		 *  System.out.println("bye");
		 */
		
		/*
		 * //infinite loop for(;true;) System.out.println("bye");
		 */
		
		/*
		 * int count=1; for(;;) { System.out.println(count+" bye"); if(count==50) {
		 * break; } count++; }
		 */
		
		System.out.println("---------");
		//5 to 50
		for(int k=5;k<=50;k++) {
			System.out.println(k);
			if(k%5==0) {
				System.out.println("Divisible by 5: "+k);
				break; //print first number divisible by 5 then break the loop
			}
		}
		
		System.out.println("---------");
		//print all the alphabets
		for(char c='a';c<='z';c++) {
			System.out.println(c);
			System.out.println((int)c+":"+c);//print ascii value
		}
		
		System.out.println("---------");
		for(byte b=1;b<=6;b++)
			System.out.println(b);
		
		System.out.println("---------");
		for(double d=1.1;d<=10.0;d++) {
			System.out.println(d);
		}
		
		System.out.println("---------");
		for(String s="Hello";s.equals("Hello");) {
			System.out.println(s);
			break;
		}
		
		//use cases for loop
		//number of iterations are fixed
		//month dropdown: jan to dec
		//ecommerce:category iterations
		
		
	}

}
