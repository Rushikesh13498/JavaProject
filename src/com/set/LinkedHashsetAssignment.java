package com.set;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class LinkedHashsetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------Q1-------------------------");
		LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
		h1.add(11);
		h1.add(55);
		h1.add(65);
		h1.add(78);
		h1.add(62);

		System.out.println(h1);

		System.out.println("---------------------Q2-------------------------");

		LinkedHashSet<String> h2 = new LinkedHashSet<>();
		h2.add("red");
		h2.add("blue");
		h2.add("green");
		h2.add("maroon");
		h2.add("purple");
		h2.add("orange");
		h2.add("white");
		h2.add("black");

		System.out.println(h2);

		System.out.println("--------------------Q3--------------------");

		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(12);
		a.add(25);
		a.add(63);
		a.add(21);
		System.out.println("Arraylist:" + a);
		LinkedHashSet<Integer> hset = new 	LinkedHashSet<>(a);
		System.out.println("Arraylist stored in Linkedhashset" + hset);

		System.out.println("--------------------Q4--------------------");
		System.out.println("---------dispalying using iterator--------");
		Iterator<Integer> itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------------------Q5--------------------");
		System.out.println(h2.size());

		System.out.println("--------------------Q6--------------------");

		// System.out.println(a.removeAll(a));
		System.out.println(a);

		System.out.println("--------------------Q7--------------------");

		System.out.println(h2.isEmpty());

		System.out.println("--------------------Q8--------------------");
		int arr2[] = new int[a.size()];
		/*int i = 0;

		for (int ele : a) {
			arr2[i++] = ele;
		}
		for (int j : arr2) {
			System.out.println(j);
		}*/

		System.out.println("--------------------Q10--------------------");

		LinkedHashSet<Employee> e = new LinkedHashSet<>();
		e.add(new Employee(1, "ram", 25000));
		e.add(new Employee(2, "balram", 15000));
		e.add(new Employee(3, "sitaram", 55000));
		e.add(new Employee(4, "jalaram", 35000));
		e.add(new Employee(4, "jalaram", 35000));

		System.out.println(e);

		System.out.println("--------------------Q11--------------------");
		System.out.println(e);

		System.out.println("--------------------Q13--------------------");
		ArrayList<Employee> ar = new ArrayList<>(e);
		System.out.println(ar);
		
		System.out.println("-----------------------Q14,Q15---------------------");

		LinkedHashSet<Integer>hs=new LinkedHashSet<>();
		hs.add(10);
		hs.add(12);
		hs.add(23);
		hs.add(102);
		hs.add(11);
		hs.add(30);
		hs.add(21);
		
		System.out.println("hs:"+hs);
		
		LinkedHashSet<Integer>hs1=new LinkedHashSet<>();
		hs1.add(101);
		hs1.add(125);
		hs1.add(23);
		hs1.add(101);
		hs1.add(117);
		hs1.add(30);
		hs1.add(22);
		System.out.println("hs1:"+hs1);
		
		for(Integer i:hs) {
			if(hs1.contains(i)) {
				System.out.println("Duplicate elements:"+i);
			}
		}
		
		
		
		
	}

}
