package com.Array;

import java.util.Scanner;

public class TheatreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner (System.in);
       Theatre2 t[]=new Theatre2[2];
       for(int i=0;i<t.length;i++) {
    	   System.out.println("Enter theatre id:");
    	   int id=sc.nextInt();
    	   System.out.println("Enter theatre name:");
    	   String name=sc.next();
    	   System.out.println("Enter movie id:");
    	   int m_id=sc.nextInt();
    	   System.out.println("Enter movie name:");
    	   String m_name=sc.next();
    	   System.out.println("Enter rating:");
    	   float rating=sc.nextFloat();
    	   t[i]=new Theatre2();
    	   t[i].setT_id(id);
    	   t[i].setT_name(name);
    	   Movie m=new Movie();
    	   t[i].setM(m);
    	   t[i].getM().setM_id(m_id);
    	   t[i].getM().setM_name(m_name);
    	   t[i].getM().setRating(rating);
       }
       for (int i=0;i<t.length;i++) {
    	   System.out.println("Theatre id:"+t[i].getT_id());
    	   System.out.println("Theatre Name:"+t[i].T_name());
    	   System.out.println("Movie id:"+t[i].getM().getM_id());
    	   System.out.println("Movie Name:"+t[i].getM().getM_name());
    	   System.out.println("Movie Rating:"+t[i].getM().getRating());
       }
       
	}

}
