package com.String;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is beautiful country";
		
		int count=0;
		char  ch = 0;
		
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(' '==ch) {
				count++;
				
			}
			
		}System.out.println(ch+" -->"+count);

	}

}
