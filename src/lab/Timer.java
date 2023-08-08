package lab;

import java.util.LinkedList;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> al=new LinkedList<Integer>();
		for(int i=10;i>=1;i--)
		{
			al.add(i);
			System.out.println(al.getFirst());
			Thread.sleep(3000);
			al.remove();
			
		}
		System.out.println(al);
	}

}
