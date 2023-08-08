package com.staticdemos;

public class StaticBlock {
	
	static {
		System.out.println("Block1");
		
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
	static {
		System.out.println("Block2");
	}

}
