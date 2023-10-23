package com.list;

import java.util.*;
public class ArrayListMethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> schoolbag=new ArrayList<String>();
		schoolbag.add("pen");
		schoolbag.add("books");
		schoolbag.add("pencil");
		schoolbag.add("tifin");
		schoolbag.add("raincoat");
		schoolbag.add("waterbottle");
		
		ArrayList<String>tutionbag=new ArrayList<String>();
		tutionbag.add("pen");
		tutionbag.add("umbrella");
		tutionbag.add("pencil");
		tutionbag.add("books");
		
		System.out.println("school bag List:"+schoolbag);
		System.out.println("tution bag List:"+tutionbag);
		
		schoolbag.retainAll(tutionbag);
		
		System.out.println("----retain----");
		System.out.println("school bag List:"+schoolbag);
		System.out.println("tution bag List:"+tutionbag);
	}

}
