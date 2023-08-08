package com.Loops;

import java.util.Scanner;

public class DisplayTable {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a number to display its table:");
	  int number = input.nextInt();
	  input.close();
	  
	  for (int i=1;i<=10;i++) {
	
	  System.out.println(number*i);
	  }
	  
	  
	  }
  
	
}