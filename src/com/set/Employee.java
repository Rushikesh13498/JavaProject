package com.set;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	
	

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



	public double getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public Employee(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = d;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	
	//---------------------------Q20-------------------------
	@Override
	public int compareTo(Employee emp) {
		return emp.name.compareTo(this.name);
	}





}

