package com.oops;

import com.staticdemos.AccessModifier;

public class AccessDemo extends AccessModifier{

	public static void main(String[] args) {
		
		AccessModifier a=new AccessModifier();
		
		AccessDemo d=new AccessDemo();
		System.out.println(d.z);
		System.out.println(a.per);
		System.out.println(d.per);
	}

}
