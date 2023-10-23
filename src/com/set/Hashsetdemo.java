package com.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer>set=new HashSet<>();
		
		set.add(25);
		set.add(45);
		set.add(14);
		set.add(15);
		set.add(26);
		set.add(63);
		set.add(null);
		set.add(63);
		
		System.out.println(set);
		
		System.out.println("-----------------------display using for loop---------------------------");
		for(int i=0;i<set.size();i++) {
			System.out.println(set);
	        break;
		}
		
		System.out.println("-------------------display using iterator-----------------");
	    Iterator<Integer>itr=set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    		
		}
	    
	    System.out.println("--------------display using enhanced for loop--------------------");
		for(Integer i:set) {
			System.out.print(i);
			System.out.println();
			
		}
		
		System.out.println("----------------display using Arraylist --------------------");
		ArrayList<Integer>aset=new ArrayList<>(set);
		System.out.println(aset);
	
	
	
	
	
	}
	

}
