package com.String;

import java.util.*;
//togglecase means only first char is lowercase remaining all are in upperacse
public class ToggleCase {
	
	public static void doToggleCase(String s) {
		for(int i=0;i<s.length();i++) {
			s.split(" ");
			int ch=s.charAt(i);
			if(i==0) {
			System.out.print(s.charAt(i));
			}else{
				ch=(ch-32);
				System.out.print((char)ch);	
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String which you want in Togglecase:");
		String s=sc.next();
		doToggleCase(s);
		 
	}

}
