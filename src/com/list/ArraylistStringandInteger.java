package com.list;

import java.util.ArrayList;

public class ArraylistStringandInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList intarr=new ArrayList();

		intarr.add(30);
		intarr.add(45);
		intarr.add(96);
		System.out.println("----Display Integer---------");
		for(int i=0;i<intarr.size();i++) {
		
			int a=(int) intarr.get(i);
			System.out.println(i);
		}
		
		System.out.println("----Display String------------- ");
		ArrayList strarr=new ArrayList();
		
		strarr.add("hrishi");
		strarr.add("patil");
		strarr.add("payal");
		
		for(int i=0;i<strarr.size();i++) {
			String s=(String) strarr.get(i);
			System.out.println(s);
		}
		
	}

}
