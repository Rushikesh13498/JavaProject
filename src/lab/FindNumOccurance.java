package lab;

import java.util.Scanner;

public class FindNumOccurance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int count=0;
		while(num>0) {
			int a=num%10;
			System.out.println("Which number do you want to search");
	        int search=sc.nextInt();
			if(a==search) {
            	 count++;
            	 num=num/10;
             }System.out.println(a+" "+count);
               
		}
		
            
		}

	}


