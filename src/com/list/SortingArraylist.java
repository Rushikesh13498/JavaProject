package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>namelist=new ArrayList<String>();
		namelist.add("Don");
		namelist.add("Ram");
		namelist.add("balRam");
		namelist.add("sitaRam");
		namelist.add("jalaRam");
		
		System.out.println("------namelist----");
		System.out.println(namelist);
		
		Collections.shuffle(namelist);
		System.out.println("-------collection methods list----");
		System.out.println(namelist);
		
		
		
		
		
	}

}
