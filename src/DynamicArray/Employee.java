package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("name1");
		namesList.add("name2");
		namesList.add("name3");
		System.out.println(namesList);
		System.out.println(namesList.size());
		
		for(String e:namesList) {
			System.out.println(e);
			if(e.equals("name2")) {
				System.out.println("She is a manager");
				break;
			}
		}
		
		List<String>browserList=Arrays.asList("chrome","firefox","IE","Safari","Edge");
		System.out.println(browserList.size());
		System.out.println(browserList);
		
		List<Integer> studentMarks=Arrays.asList(78,67,88);
		
		//static array to dynamic array
		String country[]= {"India","USA","UK","Brazil","Germany"};
		List<String> countryList =Arrays.asList(country);//this array list is immutable
		System.out.println(countryList);
		
		countryList.add("France");//unsupported exception
		System.out.println(countryList);
	}

}
