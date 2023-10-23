package lab;

import java.util.Scanner;

public class MovieBooking {
	String name, M_name;
	char Movie_name;
	int age, ccode;

	public void display() {
		System.out.println("1-RRR\n2-Avenger");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.next();

		System.out.println("Enter your age:");
		age = sc.nextInt();
		if (age > 18) {

			System.out.println("Enter the movie name:");
			M_name = sc.next().toUpperCase();

			int price = 300;
			Scanner in = new Scanner(System.in);
			System.out.println("do you have coupon code?(yes=1/no=2)");
			int ccode = in.nextInt();

			if (ccode == 1) {
				System.out.println("Enter Discount code(100 || 200):");
				Scanner sc1 = new Scanner(System.in);
				int a = sc1.nextInt();
				if (a == 100) {
					double discount = 300 * 0.15;
					double finalprice = 300 - discount;
					System.out.println("your Discounted price is:" + finalprice);
				}
				if (a == 200) {
					double discount = 300 * 0.20;
					double finalprice = 300 - discount;
					System.out.println("your Discounted price is:" + finalprice);
				}
			} else {
				System.out.println("Your ticket price is 300");
			}
			System.out.println("Name:" + name + "   " + "Age:" + age + "  " + "\n" + "Movie name is:" + M_name);
			System.out.println("Congratulations!!!your ticket booking is confirmed sucessfully");

		} else {
			System.out.println("Go Home KID!!! " + "\n" + "You little child " + name.toUpperCase() + "!!!"
					+ " Go home and Study hard don't waste time" + "\nOtherwise come with your parents.............  ");

		}

	}

	public static void main(String[] args) {
		MovieBooking s1 = new MovieBooking();
		s1.display();

	}

}
