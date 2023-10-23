package com.shopfactorydesgin;
import java.util.*;
public class PaymentTest {
	
	public static void main(String[] args) {
		Paymentfactory factory=new Paymentfactory();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the itemname you want to buy");
		String itemname=sc.next().toLowerCase();
		System.out.println("Enter the quantity");
		int quantity=sc.nextInt();
		Item i=new Item(itemname, quantity)
		if(itemname.equals(itemname)) {
			
		}
		
		int payableamount=I.getPrice()*quantity;
		System.out.println(payableamount);
		
		System.out.println("Enter the type of payment (creditcard/debitcard/upi)");
		String paymenttype=sc.next().toLowerCase();
		
		 Payment payment=factory.getPayment(paymenttype); 
		 
		 if(payment!=null) {
			 payment.payment();
		 }
		Item itemobj;
		itemobj=factory.getItem(itemname);
		
		
		
	}

}
