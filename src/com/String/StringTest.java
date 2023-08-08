package com.String;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1;
         s1="i love my india" ;
         s1=s1.toUpperCase();
         
         for(int i=0;i<s1.length();i++) {
        	 //System.out.println(s1.charAt(i));
        	
        	 char ch=s1.charAt(i);
        	 System.out.print(ch+"="+(int)s1.charAt(i)+"\n");
         }
         
         
	}

}
