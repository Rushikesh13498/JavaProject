package com.list;
import java.util.*;
public class ArrayListDynamicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namelist=new ArrayList<String>();
		namelist.add("shivani");
		namelist.add("navin");
		namelist.add("saurabh");
		namelist.add("sharda");
		namelist.add("swati");
		namelist.add("prasad");
		namelist.add("pallavi");
		namelist.add("kaushal");
		namelist.add("rushikesh");
		namelist.add("harshal");
		
		System.out.println("-----Name list----");
		for(String name:namelist) {
			System.out.println(name);
		}
		
		namelist.add("keshav");
		namelist.add("suraj");
		namelist.add("subodh");
		namelist.add("rakesh");
		System.out.println("-----------------------");
		Collections.sort(namelist);
		System.out.println("----name list after 10 name----");
		System.out.println(namelist);
	}

}
