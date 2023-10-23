package com.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>colorlist=new ArrayList<String>();
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		//it is only appliable for list collection
		//bi-directional
		System.out.println("---forward---");
		ListIterator<String> listitr=colorlist.listIterator();
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		
		System.out.println("---backward---");
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
	}

}
