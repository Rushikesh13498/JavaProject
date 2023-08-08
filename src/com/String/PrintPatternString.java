package com.String;

public class PrintPatternString {

	public static void printPattern(String s) {
		char ch;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
			ch=s.charAt(j);
			System.out.print(ch+" ");	
			
		}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="java";
		 printPattern(s);
	}

}
