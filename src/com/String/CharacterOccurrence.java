package com.String;

public class CharacterOccurrence {
	
	public static void displayCharacterOccurrence(String str) {
		
		
		int []count=new int[256];
		for(int i=0;i<str.length();i++) {
			count[(int)str.charAt(i)]++;
			
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				System.out.println((char)i+"-->"+count[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="India is beautiful country";
		displayCharacterOccurrence(str);
	}

}
