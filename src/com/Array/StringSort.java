package com.Array;

import java.util.Arrays;

public class StringSort {

          public void Sort(String c[]) {
			for (int i=0;i<c.length;i++) {
				for (int j=i+1;j<c.length;j++) {
					if (c[i].charAt(0) > c[j].charAt(0)) {
						String temp = c[i];
						c[i]=c[j];
						c[j]=temp;
						System.out.println(Arrays.toString(c));
					}
				}
			}
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      String c[]= {"pune","patna","delhi","bhopal","chennai"};
	      
	      StringSort a=new StringSort();
	      a.Sort(c);
	      
		}

	}

