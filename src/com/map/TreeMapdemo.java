package com.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "Sai");
		tmap.put(2, "Ram");
		tmap.put(3, "Krishna");
		tmap.put(4, "Mahadev");
		tmap.put(5, "Brahma");
		tmap.put(66, "Radha");
		tmap.put(45, "Seeta");
		tmap.put(25, "vishnu");
		tmap.put(13, "parvati");
		tmap.put(18, "laxmi");
		tmap.put(17, "balaji");
		tmap.put(6, "sarasvati");
		System.out.println("--------------treemap--------------");
		for (Map.Entry<Integer, String> m : tmap.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

		System.out.println("------------------------------");
		SortedMap<Integer, String> smap = tmap.descendingMap();
		for (Map.Entry<Integer, String> m : smap.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

		System.out.println("----------------------------------");
		System.out.println("First key:" + tmap.firstKey());
		System.out.println("last key:" + tmap.lastKey());
		System.out.println("Sorted map in descending order first key is:" + smap.firstKey());
		System.out.println("Sorted map in descending order last key is:" + smap.lastKey());
		System.out.println("--------------------------------");
		System.out.println("headmap(45):" + tmap.headMap(45));// it will show keys less than the given key(cannot show
																// given key)
		System.out.println("--------------------------------");// it will print all keys greater than given key along
																// with given key.....
		System.out.println("tailamap(45):" + tmap.tailMap(45));

		System.out.println("--------------------------");
		System.out.println("submap of(13,25):" + tmap.subMap(13, 25));// it will print along with starting key till end
																		// key

		System.out.println(tmap.lowerKey(45));// returns greatest smaller key available in map.
		System.out.println(tmap.higherKey(45));// returns greatest bigger key available in map.

		System.out.println("------------------------");
		System.out.println(tmap.ceilingKey(45));// Returns the least key greater than or equal to the given key,or null
												// if there is no such key.
		System.out.println(tmap.floorKey(45));// Returns the greatest key less than or equal to the given key,or null if
												// there is no such key
	}

}
