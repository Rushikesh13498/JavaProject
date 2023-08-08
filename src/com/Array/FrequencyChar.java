package com.Array;

public class FrequencyChar {
		
		  static void find(char arr[]) {
				/*
				 * for(int i=0;i<arr.length;i++) { boolean visited=false; int count=1; for(int
				 * j=i-1;j>=0;j--) { if(arr[i]==arr[j]) { visited=true; break;
				 * }System.out.println(arr[i]); }
				 */
				boolean visited =false;
				  if(visited==false) {
				  int i = 0;
				  int count=0;
				  for(int k=i+1;k<arr.length;k++) {
				  
				  if (arr[i]==arr[k]) {
					  count++;
					  }
				  } System.out.println(arr[i]); 
				  }
				 
				  
			}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      char arr[]={'a','b','b','c','c','b'};
	      FrequencyChar.find(arr);
	}
	}
