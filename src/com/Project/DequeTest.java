package com.Project;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer>d=new ArrayDeque<>();
		
		d.add(10);
		d.add(25);
		d.add(85);
		d.add(23);
		d.add(15);
		
		System.out.println(d);
		
		d.addFirst(26);
		System.out.println(d);
		
		d.addLast(40);
		System.out.println(d);
		
		d.removeFirst();
		System.out.println(d);
		
		d.removeLast();
		System.out.println(d);
		
		
		System.out.println(d.contains(25));
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
	
	}

}
