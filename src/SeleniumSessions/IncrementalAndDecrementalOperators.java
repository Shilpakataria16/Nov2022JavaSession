package SeleniumSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. post increment ++
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-99;
		int d=c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		int x=10;
		int y=x++;
		System.out.println(x);//11
		System.out.println(y);//10
		
		//2. pre increment
		int t=1;
		int u=++t;
		System.out.println(t);//11
		System.out.println(u);//10
		
		int k=-99;
		int p=++k;
		System.out.println(k);
		System.out.println(p);
		
		int g=-1001;
		int h=++g;
		System.out.println(g);
		System.out.println(h);
		
		//3. post decrement
		int s=2;
		int v=s--;
		System.out.println(s);
		System.out.println(v);
		
		int l1=-999;
		int l2=l1--;
		System.out.println(l1);
		System.out.println(l2);
		
		//4. pre decrement
		int r1=2;
		int r2=--r1;
		System.out.println(r1);
		System.out.println(r2);
		
		int num=10;
		System.out.println(num++);
		
		System.out.println(num);
		
		int total =10;
		System.out.println(++total);
		System.out.println(total);
		
		System.out.println(-2*10);
		System.out.println(2*10);
		System.out.println(-2*-10);
		
		float f=2.5f;
		float j=f++;
		System.out.println(f);
		System.out.println(j);
		
		char ch='a';
		//System.out.println(++ch);//b
		
		System.out.println((int)++ch);//b
		
		char th='1';
		System.out.println((int)++th);
		System.out.println((int)th);
		
		String test ="hello";
		//System.out.println(test++);
		
		int pop=1;
		pop=pop+1;
		System.out.println(pop);
		
		int p11=pop+1;
		System.out.println(p11);
		
		byte f1=50;
		byte f2=60;
		//byte f3=f1+f2;
		//compile time error
		//add two byte numbers answer should be interger
		int f3=f1+f2;
		
		
		
		
		
		
		
	}

}
