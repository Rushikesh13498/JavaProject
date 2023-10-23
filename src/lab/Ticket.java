package lab;

import java.util.Scanner;

public class Ticket {

	private int ticketid;
	private int price;
    static int availableTickets;
    
	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
	
	    if(availableTickets>=0) {	
		Ticket.availableTickets = availableTickets;
	}else {
		System.out.println("Booking are full no more tickets available");
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t=new Ticket();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int n=sc.nextInt();
		
		System.out.println("Enter no of available tickets:");
		int a=sc.nextInt();
		if(a>0) {
			t.setAvailableTickets(a);
			
		}else {
			System.out.println("Booking are full no more tickets available");
			return ;
		}
		
		
		System.out.println("enter the ticketid:");
		int i=sc.nextInt();
		t.setTicketid(i);
		
		System.out.println("Enter the price:");
		int p=sc.nextInt();
		t.setPrice(p);
		
		System.out.println("Enter the no tickets you want to book:");
		int t1=sc.nextInt();
		
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("Ticket booking Details:");
		System.out.println();
		System.out.println("Total amount you paid is="+(p*t1)+"$");
		
		System.out.println(t1+" "+"tickets booked successfully :)");
		System.out.println("Thank YOU :)");
		
		System.out.println("Available tickets:"+((a-t1)));
		
		
		
		System.out.println("Available Tickets for Booking is:"+(a-t1)+" "+"seats");
		}	
		
	
		
	}


