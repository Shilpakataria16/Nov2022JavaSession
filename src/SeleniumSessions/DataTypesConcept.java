package SeleniumSessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		//data types in java
		//1. primitive- no need to create object
		//size is fixed of data type
		//Integral family
		//Integer: byte,short,int,long
		//character:char
		//floating point: float ,double
		//Boolean:boolean
		
		//2.non primitive:need object
		//Array, String, Interface, Class
		
		
		//Java is not 100% object oriented
		//Java is case sensitive
		//platform independent
		
		//1.byte
		//size: 1 byte =8 bits
		//range: -128 to 127
		byte b = 10;
		b=30;
		byte b1=20;

		System.out.println(b);
		System.out.println(b1);
		
		byte b11 =127;
		byte t1 = 0;
		
		//2. short
		//size: 2 bytes = 2*8 = 16 bits
		//range: -32768 to 32767
		short sh = 500;
		short sh1 = -300;
		System.out.println(sh+sh1);
		
		//3. int
		//size: 4 bytes=32 bits
		//range: -2147483648 to +2147483647
		int i = 100000;
		int j =1;
		int k=3000;
		byte l=20;
		System.out.println(k+l);
		
		//4.long
		//size: 8 bytes =64 bits
		long num = 78779222;
		//(l/L identifies long number)
		long n = 99989998989l;
		System.out.println(n);
		
		long ph = 9828736478l;
		
		//float
		//size: 4 bytes = 32 bits
		//range: upto 7 digits after decimal
		float n1=12.33f;
		System.out.println(n1);
		
		float n2 = (float)23.44;
		System.out.println(n2);
		
		float n3=100;
		System.out.println(n3);
		
		float n4=1.1f;
		float n5=0.9f;
		
		//double:
		//size: 8 bytes = 64 bits
		//range: upto 16 digits after decimal
		double d = 12.333333;
		double d1=200;
		System.out.println(d1);
		
		//char
		//size: 2 bytes = 16 bits
		
		char c1='a';//a-z
		char c11 ='b';
		char c2='1';//0-9
		char c3='Z';//A-Z
		char c4='$';//special characters
		
		char gender ='f';
		char status ='Y';
		
		//ASCII value range
		//a-z:97 to 122
		System.out.println(c1+c11);//ascii value because of arithmetic operation
		//ascii value will be considered only when some calculation is performed
		//A-Z: 65 to 90
		//0-9:48 to 57
		char r1='0';
		char r2='9';
		System.out.println(r1+r2);
		System.out.println(r1*r2);
		
		char u1='a';
		char u2='b';
		System.out.println(u1+""+u2);//output ab
		
		System.out.println((int)u1);//output ascii value by typecasting it to int
		
		System.out.println((int)u1+(int)u2);
		System.out.println(u1+0);//97
		System.out.println(u1+'0');//97+48=145
		
		
		//boolean
		//size: ~1 bit
		boolean fg = true;
		boolean fg1= false;
		
		
		//numbers on which there will not be any calculation store in string like phone number, acc number
		
		//memory management - don't create unnecessary variable
	}

}
