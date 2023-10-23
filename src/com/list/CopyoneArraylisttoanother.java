package com.list;

import java.util.ArrayList;

public class CopyoneArraylisttoanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>slist=new ArrayList<>();
		
		slist.add("rohan");
		slist.add("rakesh");
		slist.add("rihansh");
		slist.add("raj");
		slist.add("jayesh");
	
	System.out.println("namelist:"+slist);
	
	ArrayList<String> slist2=new ArrayList<String>();
	
	slist2=slist;
	System.out.println("------------------------------");
	System.out.println("Copied namelist;"+slist2);
	
	
	}

}
