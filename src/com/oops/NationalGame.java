package com.oops;

import java.util.Scanner;

public class NationalGame {
	String cname;
	int choice;
	
	
	
	public void display() {
	System.out.println("Enter the Country Name:\n 1:India\n 2:China\n 3:Bangladesh\n 4:Italy\n 5:United States");
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		System.out.println("National Game of India is HOCKEY. \n Thank You!");
		break;
		
	case 2:
		System.out.println("National Game of China is TABLE TENNIS. \n Thank You!");
		break;
		
	case 3:
		System.out.println("National Game of Bangladesh is Kabaddi. \n Thank You!");
		break;
		
	case 4:
		System.out.println("National Game of Italy is FOOTBALL. \n Thank You!");
		break;
		
	case 5:
		System.out.println("National Game of United States is BASEBALL. \n Thank You!");
		break;
	}
	
	}
	public static void main(String[] args) {
		NationalGame n=new NationalGame();
		n.display();
		
		
	}

}
