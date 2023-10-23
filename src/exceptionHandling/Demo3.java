package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]=new int[5];
		Scanner sc=new Scanner(System.in);
		try {
			for (int i = 0; i < n.length; i++) {
				System.out.println("enter elements:");
				n[i]=sc.nextInt();
				
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("input mismatch exception");
		}
		
		System.out.println("---array---");
		for (int i = 0; i < n.length; i++) {
			System.out.print(" "+n[i]);
		}
		
	}

}
