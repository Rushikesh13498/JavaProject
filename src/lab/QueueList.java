package lab;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueList {

	public static void main(String[] args) {
		Queue l=new LinkedList();
		l.add(10);
		l.add(100);
		l.add(20);
		l.add(30);
		l.add(100);
		l.remove();
		//l.remove(new Integer(100));
		System.out.println(l);
		
		
		ArrayDeque<Integer> al=new ArrayDeque<>();
		al.add(23);
		al.add(45);
		al.addFirst(34);
		al.addLast(45);
		
		System.out.println(al);
		
		al.removeLastOccurrence(new Integer(45));
		System.out.println(al);
		
		
	

	}

}
