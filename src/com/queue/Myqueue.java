package com.queue;

import java.util.PriorityQueue;

public class Myqueue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		PriorityQueue<Integer>q=new PriorityQueue<>();
		
		q.add(10);
		q.add(45);
		q.add(63);
		q.add(20);
		q.add(12);
		q.add(20);
		q.add(12);
		
		System.out.println(q);
		
		q.offer(85);
		q.offer(14);
		System.out.println(q);
		
		boolean ans=q.remove(330);
		System.out.println("ans:"+ans+"\n"+q);
		
		Integer i=q.poll();
		System.out.println("after poll:"+i);
		
		i=q.remove();
		System.out.println(i);
		
		System.out.println(q.size());
		System.out.println();
	}

}
