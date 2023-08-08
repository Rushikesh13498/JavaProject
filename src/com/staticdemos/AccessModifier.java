package com.staticdemos;

public class AccessModifier {
	
	private int x=10;
	String city="pune";
	
	protected int z=200;
	public float per=95.32f;

	
	private void doPrivate() {
		System.out.println("this is private");
	}
	public static void main(String[] args) {
		AccessModifier f=new AccessModifier();
		
		System.out.println(f.x);
		f.doPrivate();
		
		System.out.println((f.city));
		
		System.out.println(f.z);
	  
	    System.out.println(f.per);
	}
	

}
