package com.enumdemo;

//final class Days extends Enum
 enum Days{
	 MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class enumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Days.MONDAY);
		System.out.println(Days.THURSDAY);
		
		//traversing the enum
		//values() method internally convert enum in arrays
		System.out.println("----enum----");
		for(Days d:Days.values()) {
			System.out.println(d);
		}
		
		System.out.println("----valueOf()----");
		
		System.out.println("Value of Monday:"+Days.valueOf("MONDAY"));
		System.out.println("Value of Monday:"+Days.valueOf("MONDAY").ordinal());
		
		System.out.println("----enum----");
		for(Days d:Days.values()) {
			System.out.println(d+"   :"+d.ordinal());
		}
	}

}
