package com.list;

import java.util.ArrayList;

public class ArrayListMethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namelist1=new ArrayList<String>();
		namelist1.add("shivani");
		namelist1.add("sourabh");
		namelist1.add("sharda");
		namelist1.add("prasad");
		namelist1.add("suraj");
		
		ArrayList<String> namelist2=new ArrayList<String>();
		namelist2.add("shivani");
		namelist2.add("navin");
		namelist2.add("saurabh");
		namelist2.add("harshal");
		namelist2.add("swati");
		
		namelist1.addAll(namelist2);
		
		System.out.println(namelist1);
		System.out.println(namelist2);
		
		boolean ans=namelist1.containsAll(namelist2);
		System.out.println("ans:"+ans);
	}

}
