package com.Array;

import java.util.Arrays;

public class CharSorting {

	public void Sort(char ch[]) {
			for (int i=0;i<ch.length;i++) {
				for (int j=i+1;j<ch.length;j++) {
					if (ch[i]<ch[j]) {
						char temp = ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
						System.out.println(Arrays.toString(ch));
					}
				}
			}
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      char ch[]= {'p','a','s','d','z'};
	      
	      CharSorting d=new CharSorting();
	      d.Sort(ch);
	      
		}

	}


	
