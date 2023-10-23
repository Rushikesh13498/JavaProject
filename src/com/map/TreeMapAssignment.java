package com.map;

import java.util.TreeMap;

public class TreeMapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------------Q10,Q11-------------------");
		TreeMap<Integer, String>t=new TreeMap<>();
		
		t.put(1, "kullu");
		t.put(2, "kashmir");
		t.put(3, "ladakh");
		t.put(4, "manali");
		t.put(5, "amritsar");

		System.out.println(t);
		
		System.out.println("---------------------Q12------------------");
		
		System.out.println(t.containsKey(3));
		
		System.out.println("----------------------Q13-------------------");
		
		System.out.println(t.containsValue("amritsar"));
		
		System.out.println("------------------Q14-----------------");
		for(Integer i:t.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("---------------------Q15--------------------");
	    

		
		
	
	
	
	}

}
