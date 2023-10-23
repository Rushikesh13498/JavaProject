package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector <Integer>list=new Vector<>();
		
		list.addElement(5);
		list.addElement(56);
		list.addElement(89);
		list.addElement(12);
		
		System.out.println(list);

		Enumeration<Integer>eitr=list.elements();
		while(eitr.hasMoreElements()) {
			System.out.println(eitr.nextElement());
		}
		
	}

}
