package com.Array;

public class FrequencyofallCharacters {

	public static void find(String s) {
		
		int count=0;
		char ch;
		for(int i=0;i<s.length();i++) {
			boolean isVisited=false;
			ch=s.charAt(i);
			count=1;
			
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			for(int k=0;k<i;k++) {
				if(ch==s.charAt(k)) {
					isVisited=true;
				}
			}
			if(!isVisited) {
				System.out.println(ch+" --> "+count);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india is beautiful country";
		
		FrequencyofallCharacters.find(s);
	}

}
