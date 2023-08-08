package com.Array;

public class Frequency {
	
	  static void find(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean visited=false;
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					visited=true;
					break;
				}
			}
			if(visited==false) {
				
				for(int k=i+1;k<arr.length;k++) {
					
					if (arr[i]==arr[k]) {
						count++;
					}
				}
				System.out.println(arr[i]+"---"+count);
			}
		}
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]={1,2,3,1,2,5,1,5,1,6,8,1,2};
      Frequency.find(arr);
}
}