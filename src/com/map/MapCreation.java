package com.Collection;

import java.util.*;

public class MapCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<>();
		
		String s=hm.put(7, "red");
		System.out.println(s);
		hm.put(15, "Black");
		hm.put(5, "Black");
		hm.put(55, "Black");
		hm.put(51, "Blue");

		String s2=hm.put(7, "pink");
		System.out.println(s2);
		System.out.println(hm);
	}

}
