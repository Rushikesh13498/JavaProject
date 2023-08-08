package com.Basics;
import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for five subjects:");

        System.out.print("Subject 1: ");
        double subject1 = input.nextDouble();

        System.out.print("Subject 2: ");
        double subject2 = input.nextDouble();

        System.out.print("Subject 3: ");
        double subject3 = input.nextDouble();

        System.out.print("Subject 4: ");
        double subject4 = input.nextDouble();

        System.out.print("Subject 5: ");
        double subject5 = input.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double average = totalMarks / 5 ; 
        double percentage = (totalMarks / 500) * 100;

        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
