package String;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String str ="hi this is my java code and I am so happy";
		int len = str.length();
		int li=0;
		int hi=len-1;
		System.out.println(len);
		System.out.println(hi);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(5));
		
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));// StringIndexOutOfBoundException
		
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf("java"));
		
		String m1="welcome admin";
		if(m1.indexOf("admin")== 8) {
			System.out.println("admin user is present");
		}
		else
			System.out.println("FAIL");
		
		System.out.println(str.indexOf('i'));//1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i
		System.out.println(str.indexOf("python"));
		
		String m2="product name is macbook";
		if(m2.indexOf("macbook")!=-1) {
			System.out.println("macbook is present in products");
		}
		
		
		String test = "this is java program";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		
		String p = "   hello world";
		System.out.println(p.trim());
		
		String p1="hello world";
		System.out.println(p1.replace(" ", ""));
		
		String dob="01-01-1990";
		
		System.out.println(dob.replace('-','/'));
		
		String msg="I love Java";
		System.out.println(msg.replace("love", "hate"));
		
		String q="   hello world   ";
		System.out.println(q.replaceAll(" ", ""));
		
		String e1="hello selenium";
		String e2="hello selenium";
		System.out.println(e1.equals(e2));
		System.out.println(e1.equalsIgnoreCase(e2.trim()));
		
		String tg="welcome to naveen training";
		System.out.println(tg.contains("naveen"));
		if(tg.contains("naveen")) {
			System.out.println("enroll for it");
		}
		else
			System.out.println("no need to enroll for it");
		
		String lang="JAVA_PYTHON_RUBY_DOTNET";
		String l[]=lang.split("_");
		//return type of Split method is String array
		
		System.out.println(l.length);
		System.out.println(Arrays.toString(l));
		
		
		String pop = "xXtestingxXseleniumXxXautomationXXxXTrainingX";
		String n[]=pop.split("Xx");
		System.out.println(n[0]); //nothing
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		System.out.println(n[5]);//AIOB
		
		
	}

}
