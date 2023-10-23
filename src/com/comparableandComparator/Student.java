package com.comparableandComparator;
//implements Comparable with Original class which we want to compare
//once we implements Comparable interface ,override compareTo(T o) method
//perform logic 
public class Student implements Comparable<Student> {

	private int sid;
	private String sname;
	private double smarks;
	public Student() {
		super();
	}
	public Student(int sid, String sname, double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]\n";
	}
	
	
	public void show() {
		System.out.println("id:"+sid+" name:"+sname+" smarks:"+smarks);
	}
	
	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		/*if(this.sid==obj.sid) {
			return 0;
		}
		else if(this.sid<obj.sid) {
			return -1;
		}
		else {
			return 1;
		}*/
		
		//for int
		//return this.sid-obj.sid;
		
		//for String
		return this.sname.compareTo(obj.sname);
	}
	
}
