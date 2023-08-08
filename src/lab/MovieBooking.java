package lab;

import java.util.Scanner;

public class MovieBooking {
	String name,M_name;
	int age,ccode;
	
	
	
	public void display() {
	System.out.println("1-RRR\n 2-Avenger");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	name=sc.next();
	
	System.out.println("Enter your age:");
	age=sc.nextInt();
	
	System.out.println("Enter the movie name:");
	M_name=sc.next();
	
	
	}
	public void CalculatePrice(){
		int price=300;
		Scanner in=new Scanner(System.in);
		System.out.println("do you have coupon code?(yes=1/no=2)");
	    int ccode=in.nextInt();
		
		if (ccode==1) {
			System.out.println("Enter Discount code");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if (a==100) {
				double discount=300*0.15;
				double finalprice=300-discount;
				System.out.println("your Discounted price is:"+finalprice);
			}if(a==200) {
				double discount=300*0.20;
				double finalprice=300-discount;
				System.out.println("your Discounted price is:"+finalprice);
			}
			}else {
				System.out.println("Your ticket price is 300");
			}
			
		}
		
	
public void FinalDisplay() {
	System.out.println("Name:"+name+"   "+"Age:"+age+"  "+"Movie name is:"+M_name);
}
	public static void main(String[] args) {
		MovieBooking s1=new MovieBooking();
		s1.display();
		s1.CalculatePrice();
		s1.FinalDisplay();
		
		System.out.println("Congratulations!!!your ticket booking is confirmed sucessfully");
		

	}

}
