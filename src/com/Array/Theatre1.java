package com.Array;

import java.util.Scanner;

class Movies {
	String mname;
	float rating;

	public Movies(String mname, float rating) {
		this.mname = mname;
		this.rating = rating;
	}

	public String toString() {
		return mname + " " + rating;
	}
}

public class Theatre1 {
	int id;
	String name;
	Movies m;

	public Theatre1(int id, String name,Movies m) {
		this.name = name;
		this.id = id;
		this.m = m;
	}

	public String toString() {
		return id + " " + name + " " + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre1[] t1 = new Theatre1[2];
		for (int i = 0; i < t1.length; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the id of theatre:");
			int id = sc.nextInt();
			System.out.println("enter the name of theatre:");
			String name = sc.next();
			System.out.println("enter the movie name:");
			String mname = sc.next();
			System.out.println("enter the movie rating:");
			float rating = sc.nextFloat();

			  Movies m1=new Movies(mname, rating);
			  t1[i]=new Theatre1(id,name,m1);
			
			System.out.println(".....................");
		}
		for (Theatre1 theatre : t1) {
			System.out.println(theatre);
		}
//		/* for(int i=0;i<t1.length;i++) { System.out.println(t1[i]); } */
		

	}
}