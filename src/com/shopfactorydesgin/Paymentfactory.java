package com.shopfactorydesgin;

public class Paymentfactory {

	public Payment getPayment(String paymenttype) {

		if (paymenttype.equals("creditcard")) {
			return new Creditcard();
		} else if (paymenttype.equals("debitcard")) {
			return new Debitcard();
		} else if (paymenttype.equals("upi")) {
			return new UPI();
		}
		return null;

	}

	public Item getItem(String itemname) {
		Item i = null;
		if (itemname.equals("pen")) {
			return new Item("pen",i.setPrice(100) );
		} else if (itemname.equals("pendrive")) {
			
			return new Item("pendrive", i.setPrice(400));
		} else if (itemname.equals("book")) {
			return new Item("book", i.setPrice(200));
		} else if (itemname.equals("mouse")) {
			return new Item("mouse", i.setPrice(500));
		}else if(itemname.equals("keyboard")) {
			return new Item("keyboard", i.setPrice(1000));
		}
		return null;

	}
}
