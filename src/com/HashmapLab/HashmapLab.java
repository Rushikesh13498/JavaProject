package com.HashmapLab;

import java.util.*;
import java.util.Map.Entry;

class Student {
	int id;
	String name;
	float percentage;
	public Student(int id, String name, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}	
}
public class HashmapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Student,String>hm=new HashMap<>();
       hm.put(new Student (1,"Pooja",89), "A");
       hm.put(new Student (2,"ram",78), "B");
       hm.put(new Student (3,"Sonal",92), "A+");
       
       HashMap<String,String>h=new HashMap<>();
	
       System.out.println(hm);
       
       ArrayList<Student>al=new ArrayList<>();
       al.add(new Student (1,"Pooja",89));
	   al.add(new Student (2,"ram",78));
	   al.add(new Student (3,"Sonal",92));
	   
	   
	  Iterator<Student>it= al.iterator();
	   while(it.hasNext()) {
		   String grade="";
		   Student s= it.next();
	   System.out.println(s.name+" "+s.id+" "+s.percentage);
	   System.out.println("....................................");
	   	 if(s.percentage>90) {
	   		grade="A";
	   				
	   	 }else if(s.percentage>80) {
	   		 grade="B";
	   		 
	   	 }else if(s.percentage>70) {
	   		 grade="C";
	   		
	   	 }else {
	   		 grade="Fail";
	   	 }
	   	 h.put(s.name, grade);
	   	
	   	
	     
	   } 
	   Set<Entry<String,String>>s1=h.entrySet();
	   for(Entry<String, String> map:s1) {
			System.out.println(map.getKey()+"="+map.getValue());
	   }
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the name:");
	   String name=sc.next();
	  
	   Set<Entry<String,String>>e=h.entrySet();
	   
	   Iterator<Entry<String,String>>itr=e.iterator();
	   while(itr.hasNext()) {
		   Entry<String,String>str=itr.next();
		   if(str.getKey().equals(name)) {
			   System.out.println(str.getValue());
		   }
	   }
	  
			   
	}
}

