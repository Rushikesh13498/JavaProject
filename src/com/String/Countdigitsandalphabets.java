package com.String;

public class Countdigitsandalphabets {

	public  static void displaycount(String s) {
		s.split(s);
		int countdig=0;
		int countalpha=0;
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				countdig++;
			}else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				countalpha++;
			}else {
				count++;
			}
		}System.out.println("total no. of digits are:"+countdig);
		System.out.println("total no. of alphabets in given string :"+countalpha);
		System.out.println("total no. of Special characters in given string:"+count);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String s="PatilhSGUy@2200$%5446";
		Countdigitsandalphabets.displaycount(s);

	}

}
