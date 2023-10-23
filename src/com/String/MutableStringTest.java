package com.String;

public class MutableStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer sb1=new StringBuffer();//JSE1.0
     StringBuilder sb2=new StringBuilder();//JSE-1.5
	
	
	System.out.println("capacity: "+sb1.capacity());
	sb1.append("hello");
	System.out.println("sb1:-->"+sb1);
	System.out.println("capacity:--> "+sb1.capacity());
	sb1.append("Welcome hello");
	System.out.println("capacity:--> "+sb1.capacity());
	
	System.out.println(sb1);
	
	sb1.delete(2, 5);
	System.out.println(sb1);//hewelcome hello
	
	sb1.insert(2, "ti");
	System.out.println(sb1);//hetiwelcome hello
	
	System.out.println(sb1.length());
	
	sb1.replace(1, 6, "str");
	System.out.println(sb1);//hstr
	
	
	
	
	
	
	}

}
