package com.String;
import java.util.*;
public class ValidatingMobileNumber {
	
	public static void checkValidornot(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='9'||ch=='8'||ch=='7'||ch=='6') {
				
				System.out.println("This mobile number is valid......:)");
				break;
			}else {
				System.out.println("This mobile number is not valid....please enter valid mobile number");
		        break;
			}
			
		}
	}
	public static void check10digits(String s) {
		String[] str=s.split(s);
		str=new String[10];
		for (int i = 0; i < str.length; i++) {
                if(s.length()==str.length) {
               System.out.println(s+ " --> "+"number contains 10 digits this mobile number is valid");
                	break;
                }else {
                	System.out.println(s+" -->"+"Number is not valid ...please enter correct number");
                      break;              
                }
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the mobile number you want to check whether it is valid or not");
     
	String s=sc.next();
	check10digits(s);
	checkValidornot(s);
	
	}

}
