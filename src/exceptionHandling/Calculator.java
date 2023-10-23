package exceptionHandling;

import java.util.Scanner;

public class Calculator {
	public void add(int a, int b) {
		int add = a + b;
		System.out.print(add);
	}

	public void subtract(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
	}

	public void multiply(int a, int b) {
		int multiply = a * b;
		System.out.println(multiply);
	}

	public void division(int a, int b) {
		int div = a / b;
		System.out.println(div);
	}

	public static void calculatorTest(int a, int b) {

		if (b == 0) {
			try {
				int div = a / b;
				System.out.println("Division:" + div);
			} catch (ArithmeticException e) {
				System.out.println(" " + "error!!!" + "cannot divide by zero");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("----Menu-----");
		System.out.println("1=add,2=subtract,3=multiply,4=division");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Addition:");
			c1.add(a, b);
			break;

		case 2:
			System.out.print("Substraction:");
			c1.subtract(a, b);
			break;

		case 3:
			System.out.print("Multiplication");
			c1.multiply(a, b);
			break;

		case 4:
			System.out.print("Division");
			c1.calculatorTest(a, b);
			c1.division(a, b);

		}

	}

}
