package com.String;

public class CountWordsinString {
	
	public static void findNoofWords(String s) {
		s=s.trim();
		int count=0;
		
		for(int i=0;i<s.length()-1;i++) {
			char ch1=s.charAt(i);
			char ch2=s.charAt(i+1);
			if(ch1==' '&&ch2!=' ') {
				count++;
			}
		}
		System.out.println("no of words:"+(count+1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java is object orientated programming language";

		findNoofWords(s);
	}

}
