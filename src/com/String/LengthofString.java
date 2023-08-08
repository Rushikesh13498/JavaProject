package com.String;

public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="python";
		String s2="helloo";
       System.out.println(s.length());//length of string
       System.out.println(s2.length());
       System.out.println(s.compareTo(s2));//compare to method
       s=s2;
       System.out.println(s);
       
       
       //string split method
       String s3="Welcome,to,the,world,of,java";
        
        String[] s5=s3.split(",");
        for(int i=0;i<s5.length;i++) {
        	System.out.print(" "+s5[i]+" ");
        	System.out.println();
        }
        System.out.println(".........................");
        //first occurrence in the string and count total no of words in string
        System.out.println("....first occurrence in the string and count total no of words in string....");
        String s8="Welcome,to,the,world,of,java";
        String []str=s8.split(",");
        
        System.out.println("First occurrence:"+s8.charAt(0));
        int count=0;
       
        for(int i=0;i<str.length;i++) {
        	count++;
        	
        	
        System.out.println(str[i]);
        
        }System.out.println("count="+count);
        
        //trim leading white spaces from string
        System.out.println("..............display string after trimming the white spaces...........");
        String s9="Welcome to the reality";
        String[] s1=s9.split(" ");
        
       for(int i=0;i<s1.length;i++) {
    	   System.out.print(s1[i]);
       }
	}

}
