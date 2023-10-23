package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test2222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> list=new LinkedList();
   list.add(new Integer (2));
   list.add(8);
   list.add(5);
   list.add(1);
   
   Iterator i=list.iterator();
   Collections.reverse(list);
   Collections.shuffle(list);
   while(i.hasNext()) {
	   System.out.println(i.next()+" ");
   }
   
   
   
   Integer intarr[]= {2,3,1};
		//Arrays.sort(intarr,new Sort());
	
	
	ArrayList<String> namelist=new ArrayList<String>();
	namelist.add("shivani");
	namelist.add("navin");
	namelist.add("kals");
	namelist.add(1, "d");
	
	System.out.println(namelist);
	Collections.sort(namelist);
	System.out.println(namelist);
	
	
	
	
	
	/*
	 * Iterator<String>itr=namelist.iterator(); while(itr.hasNext()) {
	 * System.out.println(itr.next()); namelist.add("kails"); }
	 */
	
	
	}

}
