package exceptionHandling;

import java.util.Scanner;
//technical class task
public class Student {

	int id;
	String name;
	int marks;

	public Student() {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void acceptMarks(int marks) {
		try {
			if (marks > 0 && marks < 100) {
				System.out.println("thank you for input!!!!");
			} else {
				throw new ArithmeticException("Please enter valid marks (i.e grater than 0 and less than 100)");

			}
		} finally {
              System.out.println("........");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Details");
		System.out.println("........................");
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		try {
			s.acceptMarks(marks);
		} catch (ArithmeticException e) {
			System.out.println("Message -->" + e.getMessage());
		}
	}

}
