package lab;

import java.util.*;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(12);
		l.add(25);
		l.add(30);
		l.add(2);

		System.out.println(l);
		System.out.println("-----------------------Arraylist to array-------------------");
		int arr2[] = new int[l.size()];

		
		  int i = 0;
		  
		  for (int ele : l) { arr2[i++] = ele; } for (int j : arr2) {
		  System.out.println(j); }
		 
		System.out.println("-------------------");
		Object []ele=l.toArray();
		for(Object obj:ele) {
			System.out.println(obj);
		}

		System.out.println("---------------------------------Array to Arraylist----------------");

		List<Integer> l2 = new ArrayList<>();
		for (Integer j : arr2) {
			l2.add(j);

		}
		System.out.println(l2);

		System.out.println("----------------------------------------");
		
		
		
		
		
		
	}

}
