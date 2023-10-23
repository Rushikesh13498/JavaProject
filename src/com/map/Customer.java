package com.map;

public class Customer implements Comparable<Customer> {
	
	private int cid;
	private String cname;
	private int cage;
	
	public Customer(int cid, String cname, int cage) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
	}
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCage() {
		return cage;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cage=" + cage + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.cid=o.cid;
	}
	

}
