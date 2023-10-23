package com.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String>hmap=new HashMap<>();
		hmap.put(1, "Rushikesh");
		hmap.put(2, "payal");
		hmap.put(3, "priya");
		hmap.put(4, "sakshi");
		hmap.put(5, "rutuja");
		hmap.put(6, "shital");
		hmap.put(7, "rahul");
		hmap.put(8, "vipil");
		hmap.put(9, "sanskar");
		
		System.out.println(hmap);
		
		System.out.println("-----------using map entry set----------------");
		for(Map.Entry<Integer, String>m:hmap.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		System.out.println("----------hashmap key by using set----------");
		Set<Integer>key=hmap.keySet();
	
		for(Integer i:key) {
			System.out.println(i);
		}
		
		System.out.println("----------display using  key and value----------");
	
	
		for(Integer i:key) {
			System.out.println(i+":"+hmap.get(i));
	}

		System.out.println("-----------displaying using set entry function---------------------");
		Set<Entry<Integer, String>>eset=hmap.entrySet();
		System.out.println(eset);
		
		
}
}