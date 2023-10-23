package com.list;

import java.util.ArrayList;

public class MixedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList mix=new ArrayList();
		
		mix.add(0, 11);
		mix.add(1, "hello");

		
		System.out.println("-----------mixed Arraylist---------");
		for(int i=0;i<mix.size();i++) {
		Object value=mix.get(i);
		System.out.println(value);
		}
	}

}
