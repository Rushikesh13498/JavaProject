package com.String;

public class FindLongestWord {
	public static void findlongest(String s) {
		String []words=new String[100];
		String word="";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
