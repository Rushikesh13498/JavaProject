package com.Array;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,3,2,5,6,4,8,9,3};
      
      int temp[]=new int[a.length-1];
      int tindex=0;
      int deleteIndex=4;
      
      for(int i=0;i<a.length;i++) {
    	  if(i != deleteIndex){
    		  temp[tindex]=a[i];
    		  tindex++;
    	  }
      }
	a=temp;
	System.out.println(Arrays.toString(a));

}
}