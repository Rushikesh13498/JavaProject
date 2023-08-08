package lab;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	pq.add(12);
	pq.add(23);
	pq.add(32);
	pq.add(45);
	pq.add(100);
	pq.add(8);
	pq.offer(67);
	
//	Integer a=67;
//	pq.remove(a);
	
	System.out.println(pq);

	}

}
