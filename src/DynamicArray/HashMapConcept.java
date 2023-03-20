package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		//<k,v>
		//name=shilpa
		//marks=100
		//seller = seller@gmail.com
		//does not maintain the order
		//returns value based on key
		
		
		//15 virtual segments for HashMap
		HashMap<String,String> empMap = new HashMap<String,String>();
		empMap.put("Emp1", "SDET");
		empMap.put("Emp2", "SDET1");
		empMap.put("Emp3", "SDET2");
		empMap.put("Emp4", "SDET Manager");
		empMap.put("Emp5", "AVP");
		empMap.put("Emp5", "VP");
		empMap.put("Emp6", null);
		empMap.put(null, "CTO");
		empMap.put(null, null);
		
		System.out.println(empMap.get("Emp5"));
		System.out.println(empMap.get("Emp9")); //return null
		System.out.println(empMap.get("Emp6"));
		System.out.println(empMap.get(null));
		
		System.out.println(empMap);
		
		HashMap<String,Integer> browserMap = new HashMap<String,Integer>();
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);
	}

}
