package com.Array;

public class FindMinimumCharacter {
	
	public void findMin(char a[]) {
		char min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
	
			min=a[i];
			}
		}
		System.out.println("Minimum character as per ASCII values is= "+min);
	}
	public void findMax(char a[]) {
		char max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum character as per ASCII values is= "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char a[]= {'A', 'D', 'E', 'x', 'z', 'R','Z','p'};
	
   FindMinimumCharacter m=new FindMinimumCharacter();
   m.findMin(a);
   m.findMax(a);
	
	}

}
