package com.Array;

import java.util.Arrays;

public class CharArray {
	
	public void change(char arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)(arr[i]+2);
		}System.out.println(Arrays.toString(arr));
		
		int i = 0;
		if(arr[i]=='y' || arr[i]=='z') {
			 arr[i]=(char)(arr[i]-24);
		}
	    
	
	 System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char arr[]={'a','e','s','z'};
      
      CharArray d=new CharArray();
      d.change(arr);

}
}