package com.august_22;
import java.util.*;
public class PrintAlongwithposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>st=new ArrayList<>();
		
		st.add("vipil");
		st.add("rahul");
		st.add("sakshi");
		st.add("rushikesh");
		st.add("payal");
		st.add("shital");
		
		for(int i=0;i<st.size();i++) {
		System.out.println("index:"+i+"   name:"+st.get(i));
		
		}
		//clone arraylist 1 to another
		ArrayList <String>st1=new ArrayList<>();
		st1=(ArrayList<String>) st.clone();
		System.out.println(st);
		System.out.println("Cloned arraylist:");
		System.out.println(st1)	;
		
		//join two arralist in one 
		ArrayList<String>join=new ArrayList<>();
		join.addAll(st);
		join.addAll(st1);
		
		System.out.println(join);
		
		
	}

}
