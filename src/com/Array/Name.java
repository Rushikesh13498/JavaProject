package com.Array;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name=new String[10];
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of names you wwant to print");
        int no=sc.nextInt();
		
		for( int i=0;i<=no;i++) {
			System.out.println("Enter the name:");
			name[i]=sc.next();
			
		}for( int i=0;i<no;i++) {
			System.out.println("name:"+name[i]);
			
		}
		
	
		
		
		
	}

}
