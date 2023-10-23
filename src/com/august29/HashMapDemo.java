package com.august29;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//mam sent this code .........

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, Department> hashmap = new HashMap<Employee, Department>();

		hashmap.put(new Employee(1, "ABC", 45000.00), new Department(1, "Admin"));
		hashmap.put(new Employee(2, "XYA", 47000.00), new Department(2, "HR"));
		hashmap.put(new Employee(3, "UPA", 45000.00), new Department(1, "Admin"));
		hashmap.put(new Employee(4, "BJP", 57000.00), new Department(3, "Finance"));
		hashmap.put(new Employee(5, "MIX", 65000.00), new Department(1, "Admin"));
		hashmap.put(new Employee(6, "MAN", 97000.00), new Department(2, "HR"));
		hashmap.put(new Employee(7, "AYC", 45000.00), new Department(1, "Admin"));
		hashmap.put(new Employee(8, "PYA", 47000.00), new Department(3, "Finance"));

		Collection hashmapValue = hashmap.values();

		HashSet<Department> departmentSet = new HashSet<Department>(hashmapValue);

		HashMap<Department, Employee> deptEmpHashMap = new HashMap<Department, Employee>();

		for (Department dept : departmentSet) {
			System.out.println(dept);
			HashSet<Employee> employeeSet = new HashSet<Employee>();
			for (Map.Entry<Employee, Department> mapEntry : hashmap.entrySet()) {

				if (mapEntry.getValue().equals(dept)) {
					employeeSet.add(mapEntry.getKey());
				}
			}
			System.out.println(employeeSet);
			System.out.println("------------------------------");

			Employee empMaxSal = null;
			double maxSal = Double.MIN_VALUE;

			Iterator<Employee> iterator = employeeSet.iterator();
			while (iterator.hasNext()) {
				Employee emp = iterator.next();
				if (maxSal < emp.getSalary()) {
					empMaxSal = emp;
					maxSal = emp.getSalary();
				}

			}
			System.out.println(empMaxSal);
			System.out.println("------------------------------");

		}

	}

}
