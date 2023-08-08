package lab;

import java.util.Scanner;

public class ATM {
	int pin=5468;
	int balance=1000;
	int choice;
	String user;
	int pass;
	int Amount;
	int Total;
	 
	
	public void acceptDetails() {

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter you Username:");
	    user=sc.next();
	    
	    Scanner p=new Scanner(System.in);
		System.out.println("Enter your PIN:");
		pass=p.nextInt();
	}
	public void display()
	{
	System.out.println("WELCOME Back!"+user);
	}
	
	public void menu() {
	
	if(pass==5468) {
System.out.println("welcome to bank of America");
		
		do {
        System.out.println("please choose one option from below");
		
		System.out.println("1.Withdraw ");
		System.out.println("2.deposit ");
		System.out.println("3.check balance ");
		System.out.println("4.Exit");
		Scanner input=new Scanner(System.in);
		choice=input.nextInt();
		switch(choice) {
		case 1:
			Scanner s=new Scanner(System.in);
			System.out.println("enter the amount you want to withdraw:");
			int amount=s.nextInt();
			Total=amount+this.Amount;
			if (Total<=500) {
				System.out.println("insufficient balance");
				System.out.println(".....................");
				break;
			}else {
				System.out.println("Please collect cash:)");
				System.out.println("succesfully withdrawal amount is:"+amount);
				System.out.println("your Remaining Balance is:"+(Total-Amount));
				System.out.println(".....................");
			    break;
			}
		case 2:
			Scanner d=new Scanner(System.in);
			System.out.println("enter the amount you want to Deposit");
			Amount=d.nextInt();
			System.out.println("amount deposited:"+(Amount));
			System.out.println("Total Balance is :"+(Amount+1000));
			System.out.println(".....................");
			break;
			
		case 3:
			System.out.println("the account balance of"+" "+user+" "+"is:"+(Total+1000));
			System.out.println(".....................");
			break;
			
		case 4:
			System.out.println("Thank You Visit Again!!!");
			System.out.println(".....................");
		}

		}while(choice!=4);
		
		}else {
			System.out.println("please try again. You have entered wrong pin.");
			
		}
		
		
	
	
	}
	

	public static void main(String[] args) {
		ATM user1=new ATM();
		user1.acceptDetails();
		user1.display();
		user1.menu();
		
		
	
	
	}
	
	

}
