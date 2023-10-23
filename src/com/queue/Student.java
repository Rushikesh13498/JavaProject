package com.queue;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private int mark;
	
	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, mark, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && mark == other.mark && Objects.equals(name, other.name);
	}
	
	
	  public int compareTo(Student s) { 
		  return s.name.compareTo(name);
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
