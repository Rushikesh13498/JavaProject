package com.set;

import java.util.HashMap;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(45);
		tset.add(36);
		tset.add(0);
		tset.add(12);
		tset.add(23);
		tset.add(44);
		tset.add(40);
		tset.add(5);
		tset.add(4);

		System.out.println("Treeset:"+tset);
		System.out.println("first()element:"+tset.first());
		System.out.println("last() element:"+tset.last());
		//navigable set
		System.out.println("higher(40):"+tset.higher(40));
		System.out.println("lower(45):"+tset.lower(45));
		System.out.println("floor(45):"+tset.floor(45));// if not present return lower value
		System.out.println("ceiling(45):"+tset.ceiling(45));// if not present return higher value
		System.out.println("descendingSet():"+tset.descendingSet());
		System.out.println("pollFirst():"+tset.pollFirst());//removes first element print the element
		System.out.println("pollLast():"+tset.pollLast());//removes last element print the element

		
		System.out.println("subset:"+tset.subSet(4, 23));
		System.out.println("headset:"+tset.headSet(12));
		System.out.println("tailset:"+tset.tailSet(40));
		
		
		
	}

}
