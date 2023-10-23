package com.designpatterns;

public class Food {
	
	private static Food food=new Food();
	
	public static Food getFood() {
		return food;
	}

}
