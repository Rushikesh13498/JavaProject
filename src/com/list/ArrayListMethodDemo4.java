package com.list;

import java.util.ArrayList;

public class ArrayListMethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>colorlist=new ArrayList<String>();
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		String s=colorlist.remove(0);//throw IndexOutOfBoundsException if index is not present
		System.out.println("s="+s);
		System.out.println(colorlist);
		
		////////////////////////////////////
		boolean ans=colorlist.remove("black"); //return false if object is not present
		System.out.println("ans:"+ans);
		System.out.println(colorlist);
	}

}
