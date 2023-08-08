package com.String;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseString {
	
	public static void doReverse(String s) {
	     s=s+" ";
		String s2 = "",s3 = "";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				s2=s2+ch;
			}else {
				s3=s2+"  "+s3;
				s2="";	 
				
			}
		}System.out.println(s3);
		
		
	}
	
	  public static void reverseString(String s) { String sarr[]=s.split(" ");
	  String newStr=""; 
	  for(int i=s.length()-1;i>=0;i--) {
	  char ch=s.charAt(i);
	  
	  
		  
		  
	  } }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="computer is fun";
		doReverse(s);
		
	}

}
