package com.Conditional;

import java.util.Scanner;

public class CheckCharacter {

    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Character: ");
        
        char ch = input.next().charAt(0);
        
        if ((ch >='a' && ch<= 'z' )||(ch >='A' && ch<='Z')) {
            System.out.println("The entered input is an Alphabet\n");
            
        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + "The entered input is a DIGIT.");
        
        } else {
            System.out.println("The entered input is Symbol\n");
        }
    }

}
