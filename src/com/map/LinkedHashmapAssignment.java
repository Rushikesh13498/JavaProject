package com.map;

import java.util.LinkedHashMap;

public class LinkedHashmapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------------------------Q1------------------------");

		LinkedHashMap lmap = new LinkedHashMap();

		lmap.put(1, "sai");
		lmap.put(2, "sairam");
		lmap.put(3, "shreya");
		lmap.put(4, "sakshi");
		lmap.put(5, "shital");
		lmap.put(6, "sanskar");

		System.out.println(lmap);

		System.out.println("-------------------------Q2------------------------");

		LinkedHashMap lmap1 = new LinkedHashMap();

		lmap1.put("amit", 1);
		lmap1.put("amar", 2);
		lmap1.put("aman", 21);
		lmap1.put("amir", 12);
		lmap1.put("amma", 21);
		lmap1.put("amogh", 31);
		lmap1.put("atul", 11);
		lmap1.put("ajay", 16);

		System.out.println(lmap1);

		System.out.println("-----------------------Q3-----------------------");

		LinkedHashMap<String, City> lm = new LinkedHashMap<>();

		lm.put("ram", new City(411038, "pune"));
		lm.put("balram", new City(411098, "kolhapur"));
		lm.put("jalaram", new City(411055, "patna"));
		lm.put("sitaram", new City(400101, "mumbai"));
		lm.put("shyaam", new City(410102, "agra"));

		System.out.println(lm);

		System.out.println("-----------------------Q4-----------------------");

		LinkedHashMap<Integer, String> l1 = new LinkedHashMap<>();

		l1.put(1, "sai");
		l1.put(2, "sairam");
		l1.put(3, "shreya");
		l1.put(4, "sakshi");
		l1.put(5, "shital");
		l1.put(6, "sanskar");

		System.out.println(l1);

		System.out.println("-----------------------Q5-----------------------");

		LinkedHashMap<String, Integer> l2 = new LinkedHashMap<>();

		l2.put("amit", 1);
		l2.put("amar", 2);
		l2.put("aman", 21);
		l2.put("amir", 12);
		l2.put("amma", 21);
		l2.put("amogh", 31);
		l2.put("atul", 11);
		l2.put("ajay", 16);

		System.out.println(l2);

		System.out.println("---------------Q6----------------------");
		// 6-a
		System.out.println(l2.containsValue("atul"));
		// 6-b
		System.out.println(l2.keySet());
		// 6-c
		System.out.println(l2.remove("amogh"));

		System.out.println("---------------Q7----------------------");
		LinkedHashMap<String, Integer> l3 = new LinkedHashMap<>();
		l3.putAll(l2);
		System.out.println(l3);

		System.out.println("------------------Q8-----------------------");
		l3.clear();
		System.out.println(l3);

		
		System.out.println("-----------------Q9---------------------");
		
		LinkedHashMap<Integer,City>lhm=new LinkedHashMap<>();
		
		lhm.put(1, new City(411038, "pune"));
		lhm.put(2, new City(411098, "kolhapur"));
		lhm.put(3, new City(411055, "patna"));
		lhm.put(4, new City(400101, "mumbai"));
		lhm.put(5, new City(410102, "agra"));
		
		System.out.println(lhm);
		
		}
	}


