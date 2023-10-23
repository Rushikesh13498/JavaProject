package lab;

import java.util.ArrayList;

public class ArrayListdemo {
	
    public static void main(String[]args) {
    	ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        
    	System.out.println(al);
    	
    	ArrayList<String> s=new ArrayList<String>();
    	s.add("red");
    	s.add("blue");
    	s.add("Green");
    	
    	System.out.println(s);
    	s.add(1, "Yellow");
    	System.out.println(s);
    	
    	ArrayList<String> s1=new ArrayList<String>();
    	s1.add("pink");
    	s1.add("voilet");
    	s1.add("Indigo");
        // s.addAll(s1);
       //  System.out.println(s);
    	
         s.addAll(1, s1);
         System.out.println(s);
    }
}
