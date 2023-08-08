package com.Array;

import java.util.Arrays;

class Merge{
	int a[],b[];
    int a1=a.length;
    int b1=b.length;
     int c1=a1+b1;
     int c[]=new int [c1];

     public void display() {
    	System.out.println(Arrays.toString(c));
     }

     public class MergeArray {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,3,5,6,8,9};
        int b[]= {2,6,5,7,4,5};
        
        Merge m=new Merge();
        m.display();
}
}
     }
