package com.Array;

public class Theatre2 {
	int t_id;
	String t_name;
	Movie m;
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id=t_id;
	}
	public String T_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name=t_name;
	}
	public void setM(Movie m) {
		this.m=m;
	}
	public Movie getM() {
		return m;
	}
	public String toString() {
		return "Theatre [t_id"+t_id+" "+"t_name"+t_name+" "+"m"+m+" ]"; 
	}
	

}
