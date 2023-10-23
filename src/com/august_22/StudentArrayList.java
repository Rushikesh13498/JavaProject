package com.august_22;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>s=new ArrayList<>();
		
		s.add(new Student(1,"rohan"));
		s.add(new Student(2,"raj"));
		s.add(new Student(3,"satyam"));
		s.add(new Student(4,"prakash"));
		s.add(new Student(5,"jayesh"));
		s.add(new Student(6,"vishal"));
		
		
		System.out.println(s);
		
		
		
		
		System.out.println("Removing student whose roll no between 2 to 4");
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getRollno()>2 && s.get(i).getRollno()<4) {
				s.remove(i).getName();
			}
		}System.out.println(s);
		
		
		
		
		System.out.println("removing student using iterator");
		Iterator<Student> sitr=s.iterator();
		while(sitr.hasNext()) {
			Student st=sitr.next();
			if(st.getRollno()>2 && st.getRollno()<4) {
				sitr.remove();
			}
		}System.out.println(s);
		
		
	}

}
