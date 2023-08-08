package com.String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Roses:are:red";
		char ch[]=s.toCharArray();
		System.out.println("character array");
		for(char c:ch) {
			System.out.println(c);
		}
		
		String sarr[]=s.split(":");
		for(String s1:sarr) {
			System.out.print(s1+" ");
		}
		
	}

}
