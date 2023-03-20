package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//dynamic array
		//ArrayList - default class
		//order based collection: it maintains index/order
		//for arraylist 10 virtual segments are created when arraylist is declared
		//virtual capacity - 10
		//physical capacity - 0
		//size method will return pc
		//after filling 10 pc java will give vc=pc/2
		//it is called load factor lf=pc/2
		//pc-current size
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		ar.add("testing");
		ar.add('d');
		ar.add(67.89);
		ar.add(true);
		ar.add(1000);
		System.out.println(ar.size());
		ar.add(1200);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(9));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(10));//IndexOutOfBoundException
		
		ar.remove(8);
		System.out.println(ar.get(8));//it will give value which was in 9th segment 
		//8th segment will be deleted. 9th segment will be shifted to 8th segment.
		System.out.println(ar.size());
		System.out.println(ar);
		
		ArrayList empData = new ArrayList();
		empData.add("tom");
		empData.add("Banglore");
		empData.add(1000);
		empData.add(true);
		
		System.out.println(empData.size());
		System.out.println(empData.get(1));
		System.out.println(empData);
		
		//for loop
		for(int i=0;i<empData.size();i++) {
			System.out.println(empData.get(i));
		}
	}

}
