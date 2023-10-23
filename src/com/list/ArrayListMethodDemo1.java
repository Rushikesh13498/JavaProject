package com.list;

import java.util.ArrayList;

public class ArrayListMethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namelist=new ArrayList<String>();
		
		System.out.println("isEmpty():"+namelist.isEmpty());
		namelist.add("shivani");
		namelist.add("sourabh");
		namelist.add("sharda");
		namelist.add(null);
		namelist.add("prasad");
		namelist.add("sourabh");
		namelist.add(null);
		System.out.println("isEmpty():"+namelist.isEmpty());
		
		System.out.println(namelist);
		System.out.println(namelist.size());
		
		namelist.add(2, "raj");
		System.out.println("----after add---");
		System.out.println(namelist);
		System.out.println(namelist.size());
		System.out.println("---after set----");
		namelist.set(2, "neha");
		System.out.println(namelist);
		System.out.println(namelist.size());
		
		int i=namelist.indexOf("sourabh");
		System.out.println("i:"+i);
		
		int j=namelist.lastIndexOf("sourabh");
		System.out.println("j:"+j);
		
		boolean ans=namelist.contains("vishal");
		System.out.println("Ans:"+ans);
		
		namelist.clear();
		System.out.println(namelist);
	}

}
