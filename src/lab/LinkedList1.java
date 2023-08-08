package lab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer>li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		li.add(sc.nextInt());
		}
		
		
		li.addFirst(11);
		System.out.println(li);
			
//		Iterator<Integer> l=li.iterator();
//		while(l.hasNext())
//		{
//			int a=l.next();
//			if(a%2==0)
//			{
//				l.remove();
//			}
//			else
//				System.out.print(a);
//				
//		}
//		

	}

}
