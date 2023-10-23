package com.comparableandComparator;

import java.util.*;

public class Food {

	private int foodid;
	private String foodname;
	private double foodprice;
	public Food() {
		super();
	}
	public Food(int foodid, String foodname, double foodprice) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public double getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}
	@Override
	public String toString() {
		return "foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice;
	}
	
	
}
class FoodIdComparator implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getFoodid()-o2.getFoodid();
	}
	
}//food class closed 
class FoodNameComparator implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getFoodname().compareTo(o2.getFoodname());
	}
	
}

