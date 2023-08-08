package com.String;

public class PrintVowels {

	public static void displayVowels(String s) {
		int countVowels=0;
		int countConsonants=0;
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countVowels++;
				System.out.println(ch+" "+"is vowel.");
			}
			else {
				countConsonants++;
				System.out.println(ch+" "+"is consonants.");
			}
		}System.out.println("total no. of vowels are:"+countVowels);
System.out.println("total no of consonants are:"+countConsonants);
	}
	
	public static void printAllvowels(String s) {
		char ch;
		for(int i=0;i<s.length();i++) {
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Welcome";
		
		displayVowels(s1);
		printAllvowels(s1);
		
		
	}

}
