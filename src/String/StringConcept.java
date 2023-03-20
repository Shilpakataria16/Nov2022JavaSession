package String;

public class StringConcept {

	public static void main(String[] args) {
		//String constant pool
		//string literals
		String str="Selenium";
		String str1="Selenium";
		//for above statements only 1 object will be created and both variables will refer to same object
		String str2="selenium";
		String t1="Java";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		
		//String object with new keyword
		String s1=new String("testing");//2 objects will be created in heap
		String s2=new String("testing");//3 object will be created in total
		String s3="testing";//no new object
		String s4="testing";
		System.out.println(s3 == s4);//true
		System.out.println(s1 == s2);//false //compare based on address
		System.out.println(s1.equals(s2));//true //compare based on values
		
		System.out.println(s1 == s3);//false
		System.out.println(s3==s4);//true
		
		System.out.println(s1.equals(s3));//true
		
		String s5 = "Testing";//1 object - SCP
		s5 = null;
		System.out.println(s5.length());//null pointer exception
		
		String s6="Naveen";
		s6="user";
	}

}
