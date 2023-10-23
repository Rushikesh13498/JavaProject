package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashMap<Customer, City>h=new HashMap<>();
			
			h.put(new Customer(1, "Ram", 25),new City( 411038,"pune"));
			h.put(new Customer(2, "priya", 22), new City( 400125,"agra"));
			h.put(new Customer(3, "prerana", 28), new City( 431401,"parbhani"));
			h.put(new Customer(4, "shalaka", 35), new City( 411021,"baramati"));
			h.put(new Customer(5, "bhushan", 46),new City( 410100,"Mumbai"));
		
			for(Map.Entry<Customer, City>map:h.entrySet()) {
				System.out.println(map.getKey()+" "+""+map.getValue());
			}
			
			Iterator<Map.Entry<Customer, City>>itr=h.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
				
			}
		
	}


