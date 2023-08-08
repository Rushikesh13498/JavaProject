package com.encapsulation;

import java.util.Scanner;

public class Test {

	public static void changeChar(char c) {
		
		if(c>='A' && c<='z') {
			c=(char)(c+32);
			
		}
		else if(c>='a' && c<='z') {
			c=(char)(c-32);
		}
		System.out.println(c);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
		Test.changeChar(ch);
      
	}




	private void changeChar() {
		// TODO Auto-generated method stub
		
	}

}
