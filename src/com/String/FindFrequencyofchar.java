package com.String;
import java.util.*;
public class FindFrequencyofchar {
	public static void findFrequency(String s ,char ch1) {
		char ch2;
		int count=0;
		for(int i=0;i<s.length();i++) {
			ch2=s.charAt(i);
			if(ch1==ch2) {
				count++;
			}
		}
		System.out.println(ch1+" --> "+count+" times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india is beautiful country";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character of which you want the frequency");
	char ch1=sc.next().charAt(0);
	
	
	findFrequency(s, ch1);
	
	
	}

}
