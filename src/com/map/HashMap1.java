package com.HashmapLab;

import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String>hm=new HashMap<>();
		hm.entrySet();
		hm.put(1, "red");
		hm.put(2, "Blue");
		hm.put(3, "Green");
		System.out.println(hm);
		
		System.out.println(".......................");
		
		Set<Entry<Integer,String>>set=hm.entrySet();
		for(Map.Entry<Integer, String>map:set) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}

}
