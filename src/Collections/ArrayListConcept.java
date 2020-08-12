package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3]; //static array --- size is fixed
		
		//dynamic array -- ArrayList
		//1.Can contain duplicate values/elements
		//2.maintains insertion order
		//3.
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add(50);//5
		
		System.out.println(ar.size());
		
		System.out.println("-----------------------");
		
		List <String> list = new java.util.ArrayList<>();
		
		list.add("Sarav");
		list.add("MSd");
		list.add("Dhoni");
		
		for (String b :list)
		System.out.println(b);
		
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());
		
				
		list.remove(0);
		
		System.out.println(list);
		
		System.out.println("-------------------------");
		
		ArrayList<Integer> ms= new ArrayList<>();
		
		ms.add(2);
		ms.add(5);
		
		System.out.println(ms.add(3));
		
	}

}
