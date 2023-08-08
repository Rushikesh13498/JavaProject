package lab;

import java.util.Scanner;

abstract class Father {

	String name;
	int min;
	int marks;

	void marks(String name, int min, int marks) {
		this.name = name;
		this.min = min;
		this.marks = marks;
	}
	abstract void marksObtain();
}

class Child extends Father {

	@Override
	void marksObtain() {
		if (marks >= min) {
			System.out.println("I will give you a Laptop..");
		} else {
			System.out.println("you will not get laptop...! Study hard");
		}
	}
}

public class AbstractClass {

	public static void main(String[] args) {

		Child s = new Child();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name :");
		s.name = sc.next();

		System.out.println("Enter the Minimum marks You Want:");
		s.min = sc.nextInt();

		System.out.println("Enter the marks obtain of Student :");
		s.marks = sc.nextInt();

		s.marksObtain();

	}
}

