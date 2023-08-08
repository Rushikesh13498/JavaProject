package com.String;

public class PrintShortformofName {

	public static void print(String s) {
		s=s.toUpperCase();
		int index1=s.indexOf(' ');
		int index2=s.lastIndexOf(' ');
		System.out.println(s.charAt(0)+"."+s.charAt(index1+1)+"."+s.charAt(index2+1)+".");
		System.out.println();
		System.out.println(s.charAt(0)+"."+s.charAt(index1+1)+"."+s.substring(index2+1,s.length()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Rushikesh vinod Patil";
		print(s);
		
	}

}
