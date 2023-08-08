package com.Array;

import java.util.Scanner;

class Movies1{
	int id;
	String mname;
	double rating;
	
	public Movies1(int id,String mname,double rating) {
		this.id=id;
		this.mname=mname;
		this.rating=rating;
	}
	public String toString() {
		return id+" "+mname+" "+rating;
	}
}
public class Movierating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Movies1[] m=new Movies1[3];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<m.length;i++) {
    	  System.out.println("Enter movie id:");
    	  int id=sc.nextInt();
		  
    	  System.out.println("Enter movie name:");
		  String mname=sc.next();
		  
		  System.out.println("Enter movie rating:");
    	  double rating=sc.nextDouble();
    	  
    	  m[i]=new Movies1(id,mname,rating);
		  
      
      }
      for(int i=0;i<m.length;i++)
      {
    	  for(int j=i+1;j<m.length;j++)
    	  {
    		  if(m[i].rating<m[j].rating)
    		  {
    			  
    			  double temp=m[i].rating;
    			  m[i].rating=m[j].rating;
    			  m[j].rating=temp;
    			  
    			  String temp1=m[i].mname;
    			  m[i].mname=m[j].mname;
    			  m[j].mname=temp1;
    			  
    			  int temp2=m[i].id;
    			  m[i].id=m[j].id;
    			  m[j].id=temp2;
    			  
    		  }
    	  }
      }
	  for (int i=0;i<m.length;i++) {
		  System.out.println(m[i]);
	  }
	}
}

