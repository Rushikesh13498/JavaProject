package com.enumdemo;
import java.util.*;

public class enumMonthTest1 {
	
	enum Months {

		JANUARY,FEBRUARY,MARCH,APRIL,MAY;
	}
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String choice="January";
		//Months m=Months.APRIL;
		String choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Month:");
		choice=sc.next();
		Months m=Months.valueOf(choice.toUpperCase());
		switch(m) {
		case JANUARY:
			System.out.println("selected month is january");
			break;
		case FEBRUARY:
			System.out.println("selected month is feb");
			break;
		case MARCH:
			System.out.println("Selected month is march");
			break;
		case APRIL:
			System.out.println("selected month is april");
			break;
		case MAY:
			System.out.println("selected month is may");
			break;
		}
		
		
	}

}
