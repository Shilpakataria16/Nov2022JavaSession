package SeleniumAssignments;

public class LoopsAssignment {

	public static void main(String[] args) {
		System.out.println("Program 1");
		//1. WAP to print following output:
		//		I am Batman﻿
		//		
		//		I am Batman﻿
		//		
		//		I am Batman﻿
		//		
		//		I am Batman
		//		
		//		I am Batman

		for(int i=0;i<=3;i++) {
			System.out.println("I am Batman");
		}

		//2. WAP to print following output:
		//
		//			I am Batman 1
		//
		//			I am Batman 2
		//
		//			I am Batman 3
		//
		//			I am Batman 4
		//
		//			I am Batman 5
		//
		//			I am Batman 6
		//
		//			I am Batman 7
		//
		//			I am Batman 8
		//
		//			I am Batman 9

		System.out.println("Program 2");
		for(int i=1;i<=9;i++) {
			System.out.println("I am Batman"+" " +i);
		}
		
		//3. WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("Program 3");
		System.out.println("using for loop");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println("using while loop");
		int j = 10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
		int k = 10;
		System.out.println("using do-while loop");
		do{
			System.out.println(k);
			k--;
		}while(k>=1);
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
		System.out.println("Program 4");
		int a;
		a = 1;
		while(a<=10) {
			System.out.println(a+". Hello World");
			a++;
		}
		
		//5. Write a program in Java to print 1 to 10 using while loop
		System.out.println("Program 5");
		int b=1;
		while(b<=10) {
			System.out.println(b);
			b++;
		}
		
		//6. WAP to find out the max number from the given three different positive numbers.

		//		num1 = 100
		//		
		//		num2 = 200
		//		
		//		num3 = 300
		System.out.println("Program 6");
		int num1 =100;
		int num2=200;
		int num3 =300;
		int max;
		if(num1<num2) {
			max = num2;
			if(num2<num3)
				max = num3;
		}else {
			max = num1;
			if(num1<num3)
				max = num3;
		}
		System.out.println(max);
		
		//7. print all odd and even numbers between 1 to 100
		System.out.println("Program 7");
		for(int i=1;i<=100;i++) {
			if(i%2 == 0)
				System.out.println("Even number: "+ i);
			else
				System.out.println("Odd number: "+ i);
		}
		
		//8. What will be the output of this program:

		//int i = 1;
		
		//while(i<=1)
		
		//System.out.println("Hi Java");
		
		//Ans. infinite. Since no increment sentence
		
		//9. Print A-Z , a-z, 0-9 with  the respective ASCII numbers on the console using while and for loop.
		System.out.println("Program 9");
		System.out.println("printing ascii value of uppercase alphabets");
		for(char c='A';c<='Z';c++) {
			System.out.println("Ascii value of "+ c +" : "+(int)c);
		}
		System.out.println("printing ascii value of lowercase alphabets");
		for(char c='a';c<='z';c++) {
			System.out.println("Ascii value of "+ c +" : "+(int)c);
		}
		System.out.println("printing ascii value of numbers 0-9");
		String st;
		for(int i=0;i<=9;i++) {
			st = Integer.toString(i);
			for(char ch:st.toCharArray()) {
				System.out.println("Ascii value of "+ ch +" : "+(int)ch);
			}

		}
		
		
		


		
	}

}
