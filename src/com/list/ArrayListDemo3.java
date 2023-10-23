package com.list;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("kaushal");
        a.add("Rushikesh");
        a.add("shyam");
        a.add("geeta");
        a.add("Ghanshyam");
        
        String s="rushikesh";
     boolean ispresent=false;
        for(int i=0;i<a.size();i++) {
        	String s1=s.toLowerCase();
        	String str=a.get(i).toLowerCase();
        	if(s1.equals(str)) {
        		ispresent=true;
        	break;
        	}
        	
        }
        if(ispresent) {
        	System.out.println("Given String is present");
        }
        else {
        	System.out.println("Given String is not present");
        }
	}

}
