package com.map;

import java.util.LinkedHashMap;

public class LinkedHashmapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "Sai");
		map.put(2, "Ram");
		map.put(3, "Krishna");
		map.put(4, "Mahadev");
		map.put(5, "Brahma");
		map.put(6, "sarasvati");

		System.out.println(map.containsKey(4));// if present op is true else false...
		System.out.println("----------------------------");

		System.out.println(map.containsValue("Brahma"));
		System.out.println("----------------------------");

		System.out.println(map.isEmpty());
		System.out.println("----------------------------");

		System.out.println(map.remove(4));// key will be removed and value is printed..
		System.out.println(map);
		System.out.println("----------------------------");

		System.out.println(map.replace(1, "Ram"));// value is replaced and value is printed
		System.out.println(map);

	}

}
