package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array: static array
		//collection of elements with the same type
		
		//limitations of array
		//1. size is fixed: static array
		//to overcome this issue we have to use dynamic array
		//2. only similar type of data can be stored. To overcome this issue we can use Object array
		
		//Real time examples of static array: Flight booking, movie booking
		//number of seats in hall/flight is fixed. So static array
		//country dropdown-static
		//dynamic array example: Uber car booking. Create dynamic array for cars
		//number of pages in ecommerce site
		
		int i[]=new int[4];
		//li - lowest index
		//len - length
		//hi - highest index
		//li=0
		//hi=len-1
		//len=hi+1
		
		System.out.println(i.length);
		int len =i.length;
		int hi=len-1;
		int li=0;
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]); //AIOB
		//System.out.println(i[-1]);//AIOB
		
		//to print all the values from array
		//index based loop
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		//to print all the values from array
		System.out.println(Arrays.toString(i));
		
		
		int p[]=new int[4];
		p[2]=20;
		System.out.println(p[0]);//0
		System.out.println(p[2]);//20
		System.out.println(p[3]);//0
		//if you dont initialize the value it will be 0 by default for int
		
		
		System.out.println("printing array values using for each loop");
		
		//for each:
		//for each loop traverse from index 0 to length-1. It can not traverse in reverse order
		for(int e:i) {
			System.out.println(e);
			if(e==20) {
				System.out.println("bye!!");
			}
		}
		
		System.out.println("printing array directly");
		System.out.println(i);
		
		
		//2. double array
		double d[]= new double[4];
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] =35.55;
		d[3] = 45.66;
		
		System.out.println(d[0]+d[1]);
		//print all the values using toString method
		System.out.println(Arrays.toString(d));
		
		//print all the values using for each loop
		for(double e: d) {
			System.out.println(e);
		}
		
		//char
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		
		//print length
		System.out.println(ch.length);
		//print lowest index
		System.out.println("li = " + 0);
		//highest index
		System.out.println(ch.length-1);
		
		for(char e: ch) {
			System.out.println(e);
		}
		
		//String array
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JavaScript";
		lang[3] = "DotNet";
		
		for(String e : lang) {
			System.out.println(e);
			if(e.equals("Java"))
				System.out.println("wohoo Java");
			if(e.equals("Python"))
				System.out.println("Python so easy");
			
		}
		
		//Object Array:
		//Object is a class in Java -- is a super class of all the classes in Java
		//Emp info: Name(String),age(int), salary(double), gender(char), isPermanent(boolean)
		Object emp[] = new Object[5];
		emp[0] = "Emp1";
		emp[1] = 26;
		emp[2] = 25000.00;
		emp[3] = 'f';
		emp[4] = true;
		
		System.out.println("length of Object array " + emp.length);
		//for each loop
		for(Object e : emp) {
			System.out.println(e);
			if(e.equals("Emp1"))
				System.out.println("Employee is from QA");
		}
		
		//2 types to declare array
		//1. new keyword
		//2. Array literals: You need to know the values in advance
		int num[] = {12,34,23,56,67,88};
		System.out.println(num.length);
		
		String pr[] = {"apple","samsung","tmobile"};
		Object data[] = {"apple",25,'c',34.29};
		System.out.println(Arrays.toString(data));
		for(Object e:data) {
			System.out.println(e);
		}
	}

}
