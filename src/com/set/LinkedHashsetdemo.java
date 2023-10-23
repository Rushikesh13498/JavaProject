package com.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String>lset=new LinkedHashSet<>();
		
		lset.add("Mahadev");
		lset.add("Krishna");
		lset.add("Brahma");
		lset.add("parvati");
		lset.add(null);
		lset.add("sai");
		lset.add("ram");
		lset.add("vishnu");
		
		System.out.println(lset);
		
		
		
		System.out.println("----------for loop--------------");
		for (int i = 0; i < lset.size(); i++) {
			System.out.println(lset);
			break;
		}
		
		System.out.println("---------enhanced for loop-----------");
		for(String s:lset) {
			System.out.println(s);
		}
		
		System.out.println("-------------iterator---------------");
		Iterator<String>itr=lset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------------arraylist-------------");
		ArrayList<String>alist=new ArrayList<>(lset);
		System.out.println(alist);
		
		
		System.out.println("------------------------------");
		
		
		
		
		
		
	}

}
