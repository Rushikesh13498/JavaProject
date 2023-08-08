package com.String;
import java.util.*;
public class PalindromeString {

	public static void checkPalindrome(String s) {
		String reverseStr="";
		for(int i=s.length()-1;i>=0;--i) {
			reverseStr=reverseStr+s.charAt(i);
		}
		if(s.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(s+" --> "+"String is Palindrome");
		}else {
			System.out.println(s+" --> "+"String is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
		String s=sc.next();
		checkPalindrome(s);
	}

}
