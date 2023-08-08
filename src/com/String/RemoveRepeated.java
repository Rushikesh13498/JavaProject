package com.String;

public class RemoveRepeated {
	public static void deleteRepeatedCharacters(String s) {
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println();
			}else {
				
			}
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rushikesh";
		deleteRepeatedCharacters(s);
		
	}

}
