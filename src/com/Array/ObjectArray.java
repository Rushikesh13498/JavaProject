package com.Array;
import java.util.Arrays;
import java.util.Scanner;

class Theatre{
	int NoofScreen[];
	String name;
	String location;
	String mname;
	
	public Theatre(int[] NoofScreen, String location, String name,String mname) {
		this.NoofScreen=NoofScreen;
		this.name=name;
		this.location=location;
		this.mname=mname;
	}
	public String toString() {
		return name+" "+location+" "+mname+""+Arrays.toString(NoofScreen);
	}
}
public class ObjectArray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Theatre[] t=new Theatre[1];
      Scanner sc=new Scanner(System.in);
      
      for (int i=0;i<t.length;i++) {
    	  System.out.println("Enter the name of Theatre:");
    	  String name=sc.next();
    	  
    	  System.out.println("Enter the location of Theatre:");
    	  String location=sc.next();
    	  
    	  System.out.println("Enter the movie name:");
    	  String mname=sc.next();
    	  
    	  System.out.println("Enter the no of screen present in this theatre:");
    	  int size =sc.nextInt();
    	  
    	  System.out.println("Enter Screen no:");
		  int NoofScreen[]=new int[size];
    	  
    	  for(int j=0;j<size;j++) {
    		  NoofScreen[j]=sc.nextInt();
    	  }
    	  t[i]=new Theatre(NoofScreen,location,name,mname);
      }
     
			
			  for(int i=0;i<t.length;i++) { 
				  System.out.println(t[i]); 
				  }
			
         
      }
	

}
