package com.set;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(200);
		
		System.out.println(list);
		
		System.out.println("-------Displaying unique element-----------");
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					
					list.remove(j);
			       
				}
			}ArrayList<Integer> newlist=new ArrayList();
			newlist.add(list.get(i));
			System.out.print(newlist+" ");
			
		}
		System.out.println();
		System.out.println("-----------------Iterator--------------------");
		Iterator<Integer>itr=list.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
		
		
	}

}
