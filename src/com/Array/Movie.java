package com.Array;

public class Movie {
	int m_id;
	String m_name;
	float rating;
	
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id= m_id;
	}

	public String getM_name() {
		return m_name;
	}
	
	public void setM_name(String m_name) {
		this.m_name=m_name;
	}
	
	public float getRating() {
		return rating;
	}
	
	public void setRating(float rating) {
		this.rating=rating;
	}
	public String toString() {
		return m_id+" "+m_name+" "+rating+" ";
	}
}
