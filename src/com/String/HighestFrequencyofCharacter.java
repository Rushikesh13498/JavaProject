package com.String;
import java.util.*;
public class HighestFrequencyofCharacter {
	
	public static void findHighestFrequencychar(String s) {
		int []freq=new int[s.length()];
		char maxchar=s.charAt(0);
		char str[]=s.toCharArray();
		
		for (int i = 0; i < str.length; i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					freq[i]++;
					
				}
			}
		}
		int max=freq[0];
		for (int i = 0; i < freq.length; i++) {
			if(max<freq[i]) {
				max=freq[i];
				maxchar=str[i];
			}
			
		}
		System.out.println("Highest Frequency charcter in given string:");
		System.out.println("Character"+" "+maxchar+""+"-->"+max+"times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="india is beautiful country in asia";
  String s1="chandu ke chacha ne chandu ko chashma diya";
		findHighestFrequencychar(s);      
      findHighestFrequencychar(s1);
      
	}

}
