package com.Collection;

import java.util.*;

class Student{
	int id;
	String name;
	List<String>hobbies;
	public Student(int id, String name, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		
		return "Student[id="+id+",name="+name+",hobbies="+hobbies;
	}
	
	
	
}

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Student>list=new LinkedList<>();
		
		list.add(new Student(101,"ram",Arrays.asList("gaming","playing","trekking")));
		list.add(new Student(105,"geeta",Arrays.asList("dancing","cooking","painting")));

	for(Student s:list) {
		System.out.println(s);
	}
	
	}

}
