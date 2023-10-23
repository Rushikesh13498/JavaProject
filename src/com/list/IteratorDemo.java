package com.list;

import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>colorlist=new ArrayList<String>();
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		//to retrieve elements one bye one
		//read and remove element
		//Universal Iterator
		Iterator<String>itr=colorlist.iterator();
		//hasNext()->return true of the iteration has more elements
		//next()->return the next element in iteration .
		//it throws NoSuchElementException if no more element is present
		
		/*System.out.println(itr.hasNext());//true
		System.out.println(itr.next());//red
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		*/
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
