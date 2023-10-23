package com.list;
import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//non-generic collection
		
		ArrayList list=new ArrayList();//Constructs an empty list with an initial capacity of ten.
		System.out.println(list);
		
		//add data in list
		list.add("shivani");
		list.add(22);
		list.add(78.5);
		list.add(true);
		list.add('p');
		
		System.out.println(list);
		
		//value fetch from list
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		//System.out.println(list.get(10));//Exception
		
		//size
		System.out.println("size:"+list.size());
		
		//print list using for loop
		System.out.println("----loop---");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//Task- display using for-each
		
		
		//non-generic collection
		//type safety
		//whenever we fetch data using get()method in non-generic collection
		//we will compile time error 
		
		//type casting
		//as we need to do here explicit type casting 
		//Double d=list.get(2);
		Double d=(Double)list.get(2);
		System.out.println("d:"+d);
	}

}
