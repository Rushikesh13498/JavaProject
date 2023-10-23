package com.list;

import java.util.*;
public class InsertioninLinkedList {

	public static void main(String[] args) {

		
		LinkedList<String>list=new LinkedList<String>();
	
	list.add("ram");
	list.add("Raj");
	list.add("Kamal");
	list.add("Arjun");
	
	System.out.println(list);
	
	list.addFirst("Pooja");
	System.out.println(list);
	list.offerFirst("rushikesh");
	System.out.println(list);
	list.add("utkarsh");
	System.out.println(list);
	list.add(3, "mahesh");
	System.out.println(list);
	
	list.addLast("ashu");
	System.out.println(list);
	list.offerLast("venky");
	System.out.println(list);
	/*
	 * for(String l:list) { for(int i=l.length()-1;i>0;i--) {
	 * 
	 * }System.out.print(" "+l);
	 * 
	 * }
	 */
	System.out.println();
	System.out.println("-----------------------------------------------------------------");
	list.remove();
	System.out.println(list);
	System.out.println(list.remove());
	list.removeFirst();
	System.out.println(list);
	list.poll();

	System.out.println(list);
	list.pollFirst();
	System.out.println(list);
	list.pollLast();
	System.out.println(list);
	System.out.println("------------------------------------------------------------");
	System.out.println(list.getFirst());
	System.out.println(list.peek());
	System.out.println(list.peekFirst());
	System.out.println(list.peekLast());
	System.out.println(list.getLast());
	System.out.println(list.get(2));
	
	
	
	
	
	}

}
