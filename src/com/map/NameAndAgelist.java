package com.map;

import java.util.*;

public class NameAndAgelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Sakshi", 20);
		map.put("rutuja", 25);
		map.put("shital", 32);
		map.put("payal", 19);
		map.put("neeti", 7);

		System.out.println(map);
		System.out.println("---------------------------");

		ArrayList<String> namelist = new ArrayList<>();
		ArrayList<Integer> agelist = new ArrayList<>();

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			namelist.add(m.getKey());
			agelist.add(m.getValue());
		}
		System.out.println("namelist:" + namelist);
		System.out.println("---------------------------");
		System.out.println("agelist:	" + agelist);

	}

}
