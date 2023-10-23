package com.map;

import java.util.*;
import java.util.TreeMap;

public class City {

	private int pincode;
	private String cityname;
	public City(int pincode, String cityname) {
		super();
		this.pincode = pincode;
		this.cityname = cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "City [pincode=" + pincode + ", cityname=" + cityname + "]";
	}
	
	

}
