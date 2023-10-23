package com.shopfactorydesgin;

public class Item {
	
	private int price;
	private String itemname;
	public Item( String itemname,int price) {
		super();
		this.price = price;
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public int setPrice(int price) {
		return this.price = price;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	
	
	
		
	
	

	
	
	
}
