package SeleniumSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// BIG O : O(n)
		int i=1;
		System.out.println(i);
		//time complexity of above code is O(1)
		
		String s="Hello";
		System.out.println(s);
		//O(1)
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		//0(1)
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		//O(10)
		//O(n) depends on condition
		
		//1+n+n+n => 1+3n => 3n+1 --Linear equation
		// 3n+1 => 3n => O(3n) => O(n)
		//linear equation (remove constants)
		
		for(int k=1;k<=10;k++) {
			for(int l=1;l<=10;l++) {
				System.out.println("hi");
			}
		}
		//(1+n+n)(1+n+n+n)
		//(1+2n)(1+3n)=>1+2n+3n+6n^2 => 6n^2+5n+1 --Quadretic equation
		//6n^2 + 5n + 1 => 6n^2 + 5n => n(6n+5) => n(6n) => n^2 => O(n^2)
		
		for(int k=1;k<=10;k++) {
			for(int l=1;l<=10;l++) {
				for(int m=1;m<=10;m++) {
					System.out.println("hi");
				}
				
			}
		}
		//(1+n+n)(1+n+n)(1+n+n+n) =>(1+2n)(1+2n)(1+3n) => (1+2n+2n+4n^2)(1+3n) => (1+4n+4n^2)(1+3n) => 1+3n+4n+12n^2+4n^2+12n^3 =>1+ 7n+ 16n^2 +12n^3 => 7n+16n^2+12n^3 => n(7+16n+12n^2) => n(16n+12n^2) => n^2(16+12n) =>n^2(12n) =>12n^3 => n^3
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		//n
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		//n
		//n+n =>2n => n
	}

}
