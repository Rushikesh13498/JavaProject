package com.comparableandComparator;

import java.util.*;
public class FoodArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Food f1=new Food(1, "tea", 120);
		ArrayList<Food> foodlist=new ArrayList<Food>();
		//foodlist.add(f1);
		foodlist.add(new Food(2, "tea", 20));
		foodlist.add(new Food(1,"vada pav",15));
		foodlist.add(new Food(4, "Coffee", 30));
		foodlist.add(new Food(3,"dosa",60));
		
		System.out.println("---before sorting foodlist---");
		Iterator<Food> itr=foodlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---foodlist sort by foodid---");
		Collections.sort(foodlist,new FoodIdComparator());
		itr=foodlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---foodlist sort by foodname---");
		Collections.sort(foodlist,new FoodNameComparator());
		itr=foodlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Task - Foodprice ,but using public class
	}

}
