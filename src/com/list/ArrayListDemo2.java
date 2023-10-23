package com.list;
import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generic collection
		//List accept duplicate values
		//List accept multiple null values
		//List follows insertion order
		ArrayList<String> namelist=new ArrayList<String>() ;
		namelist.add("shivani");
		namelist.add("sourabh");
		namelist.add("sharda");
		namelist.add(null);
		namelist.add("prasad");
		namelist.add("sourabh");
		namelist.add(null);
		System.out.println(namelist);
		
		String s=namelist.get(0);
		System.out.println(s);
		
		
		System.out.println("---by for loop---");
		//for-loop
		for(int i=0;i<namelist.size();i++) {
			System.out.println(namelist.get(i));
		}
		//for-each loop
		System.out.println("---by for each---");
		for(String s1:namelist) {
			System.out.println(s1);
		}	
		
	}

}
