package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignmentq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hmap=new HashMap();
		hmap.put(1, "ram");
		
		hmap.put(2, "Ram");
		hmap.put(3, "Krishna");
		hmap.put(4, "Mahadev");
		hmap.put(5, "Brahma");
		hmap.put(66, "Radha");
		hmap.put(45, "Seeta");
		hmap.put(25, "vishnu");
		hmap.put(13, "parvati");
		hmap.put(18, "laxmi");
		hmap.put(17, "balaji");
		hmap.put(6, "sarasvati");
		
		
		System.out.println(hmap);
		
		HashMap h=new HashMap();
		
		h.put("ram", 1);
		h.put("jalaram", 2);
		h.put("balram", 18);
		h.put("shyam", 15);
		h.put("ghanshyam", 21);
		h.put("sitaram", 12);
		h.put("ramesh", 31);
		h.put("om", 11);
		h.put("rushikesh", 10);

		System.out.println(h);
		
		
		System.out.println("----------------Q2-----------------");
		
		HashMap h1=new HashMap();
		h1.put(1, "om");
		h1.put("shyam",2);
		
		System.out.println(h1);

		
		
		System.out.println("----------------Q3-----------------");

		HashMap<Integer, String>m=new HashMap<>();
		m.put(1, "Seeta");
		m.put(2, "parvati");
		m.put(3, "laxmi");
		m.put(4, "Saraswati");
		System.out.println(m);
		
		System.out.println("----------------Q5-----------------");
		for(Map.Entry<Integer, String>m1:m.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		
		
		}
		System.out.println("-----------------------------------");
		System.out.println("----------------Q6-----------------");
		for(Integer i:m.keySet()) {
			System.out.println("keys:"+i);
		}
		System.out.println("----------------Q7---------------");
		for(String s:m.values()) {
			System.out.println("values:"+s);
		}
		
		System.out.println("----------------Q9-----------------");
		System.out.println(m.isEmpty());
		
		System.out.println("---------------------Q10------------------");
		
		System.out.println(m.containsKey(1));
		
		System.out.println("---------------------Q11------------------");

		if(m.containsKey(5)){
		System.out.println(m.get(1));
		}else {
			System.out.println("not found");
		}
		
		
		System.out.println("---------------------Q12------------------");
		System.out.println(m.containsValue("laxmi"));
		
		System.out.println("---------------------Q13------------------");
		System.out.println(m.remove(3));

		System.out.println("---------------------Q14------------------");

		for(int i=0;i<hmap.size();i++) {
			hmap.remove(i);
			hmap.clear();
			System.out.println(hmap);
		}
		
		
		
		
		System.out.println("-----------------------Q17------------------");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.addAll(h.values());
		System.out.println(al);
		
		System.out.println("-----------------------Q18------------------");
		for(Integer i:al) {
			System.out.println(i);
		}
		
		System.out.println("------------------------Q19----------------");
		
		HashMap<Integer,City>nmap=new HashMap<>();
		
		nmap.put(1, new City(411038,"pune"));
		nmap.put(2, new City(400001,"delhi"));
		nmap.put(3, new City(410001,"mumbai"));
		
		System.out.println(nmap);
		
		for(Map.Entry<Integer,City>n:nmap.entrySet()) {
			System.out.println(n.getKey()+":"+n.getValue());
		}
		
		
	}
	

}
