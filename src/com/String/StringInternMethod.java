package com.String;

public class StringInternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1=new String("abc");
        String s2=s1.intern();
        
        System.out.println(s1==s2);
	//using intern string we can save the memory
        String s3="xyz";
        String s4=new String("xyz");
	String s5=s4.intern();
	System.out.println(s3==s5);
	
	String str1=new String("hello");
	String str2=new String("hello");
	
	System.out.println(str1==str2);
System.out.println(str1.intern()==str2.intern());	
	}
	

}
