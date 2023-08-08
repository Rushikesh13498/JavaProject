package com.String;

public class StringMethodtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=" hello world ";
		System.out.println(s1+"h");
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing()+"h");
		System.out.println(s1.trim());//removes first space and last space only and not the space between two words
		String s10=s1.concat("Welcome To pune");
		System.out.println(s10);
		System.out.println();
		System.out.println(".....................");
		/*
		 * int index=s1.indexOf('i',9);//we can alsoput ASCII value instead character
		 * System.out.println("index of e is:"+index);
		 *///giving index of first occurrence
	 
		String s2=new String("hello World");
		System.out.println(s2.hashCode());
		System.out.println(s2.toLowerCase());//lowercase
		System.out.println(s2.toUpperCase());//uppercase
		System.out.println(s2.charAt(0));//find character at given position 
		System.out.println(s2.concat(s1));//to concatenate two string
		System.out.println(s1.equals(s2));//find out string is equal or not
		System.out.println("Compare to:"+s1.compareTo(s2));//compare both strings
		System.out.println(s1.compareToIgnoreCase(s2));//compare ignoring case(lower or upper )
		if(s1==s2) {
			System.out.println("it is equal");
		}else {
			System.out.println("not equal");
		}
		
		
	}

}
