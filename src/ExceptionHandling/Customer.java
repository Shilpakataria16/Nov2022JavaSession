package ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("name1");
		namesList.add("name2");
		namesList.add("name3");
		
		//namesList.add(5, "name");//IndexOutOfBoundException
		//namesList.get(7);//IndexOutOfBoundException
		
		for(int i=namesList.size()-1;i>=0;i--) {
			System.out.println(namesList.get(i));
		}

		System.out.println(namesList);
		Collections.reverse(namesList);
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println(namesList);
		Collections.swap(namesList, 2, 1);
		System.out.println(namesList);
		
		namesList.add("name4");
		namesList.add(0, "name0");
		System.out.println(namesList);
		
		namesList.remove(1);
		System.out.println(namesList);
	}

}
