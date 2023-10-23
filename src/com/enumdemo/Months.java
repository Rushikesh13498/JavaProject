package com.enumdemo;

public enum Months {

	JANUARY(31),FEBRUARY(28),MARCH(31),APRIL(30),MAY(31);
	
	int val;
	private Months(int val){
		this.val=val;
	}
	
}
