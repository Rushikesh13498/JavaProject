package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(25);
		a.add(56);
		a.add(852);
		a.add(45);
		a.add(89);
		a.add(175);

		System.out.println("----------empty or not----------");
		if (a.isEmpty() == false) {
			System.out.println("Arraylist is not empty");
		} else {
			System.out.println("is empty");
		}
		
		
		System.out.println("----------size of Arraylist--------");
		System.out.println(a.size());
		
		System.out.println("-----------display using for loop------------");
		for (int i = 0; i < a.size(); i++) {
			int list = a.get(i);
			System.out.println(list);
		}

		System.out.println("---------using iterator------------");
		ListIterator<Integer> itr = a.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------displaying using for each loop-----------");
		for (Integer i : a) {
			System.out.println(i);

		}
		System.out.println("-------after removing-------------");
		a.remove(0);
		System.out.println(a);

		System.out.println("---------after retaining---------");
		a.retainAll(a);
		System.out.println("a-->" + a);

		System.out.println("------removing all----------");
		a.removeAll(a);
		System.out.println("a-->" + a);
		
		
		System.out.println("-----------inserting element on 1st position-----------");
	     a.add(0, 456);
	  System.out.println(a);
	     
	}

}
