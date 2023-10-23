package com.list;

public class Student {
	private int id;
	private String sname;
	private float smarks;
	public Student() {
		super();
	}
	public Student(int id, String sname, int smarks) {
		super();
		this.id = id;
		this.sname = sname;
		this.smarks = smarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", sname=" + sname + ", smarks=" + smarks + "]\n";
	}
	
	public void show() {
		System.out.println("sid:"+id+" "+"sname:"+sname+" "+"marks:"+smarks);
	}
	

}
