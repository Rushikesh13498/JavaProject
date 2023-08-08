package com.Array;

import java.util.Arrays;
import java.util.Scanner;
public class CharArrayDemo {
	
	public void findMin(char ch[]) {
		char minchar=ch[0];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<minchar) {
				
			
			minchar=ch[i];
			}
		}
		System.out.println(minchar);
	}

	void change(char[]c) {
		for (int i=0;i<c.length;i++) {
			if(c[i]>='a'&& c[i]<='z') {
				c[i]=(char)(c[i]-32);
			}else if
				(c[i]>='A' && c[i]<='Z') {
			c[i]=(char)(c[i]+32);
		}else {
			c[i]=c[i];
		}
		}
		System.out.println(Arrays.toString(c));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char[] ch=new char[4];
        System.out.println("enter te array");
        
        for (int i=0;i<ch.length;i++) {
        	ch[i]=sc.next().charAt(0);
        	
        }
        System.out.println("...............");
        
        System.out.println(Arrays.toString(ch));
        
        CharArrayDemo d=new CharArrayDemo();
        d.findMin(ch);
        System.out.println("..............");
        d.change(ch);
        
	}
}