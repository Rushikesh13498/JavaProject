package com.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("ram");
		list.add("geeta");
		list.add("sam");
		list.add("derrick");
		list.add("peter");
System.out.println(list);

	list.addFirst("john");
	System.out.println(list);
	
	list.addLast("elena");
	System.out.println(list);
	
	list.removeFirst();
	System.out.println("after removing first element");
	System.out.println(list);
	
		list.removeLast();
		System.out.println("after removing last element");
		System.out.println(list);
	
		System.out.println();
		System.out.println("adding at 2nd index");
	list.add(2, "alia");
	System.out.println(list);
	
	
	System.out.println();
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	System.out.println(list.size());
	System.out.println(list.get(4));
	}

}
