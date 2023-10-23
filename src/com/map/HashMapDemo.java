package com.map;
//hashmap doesnot follow insertion order
//duplicate keys are not allowed.(cant print duplicate keys)
//duplicate values are allowed.(can print duplicate values)
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String>map=new HashMap<Integer,String>();
		
		map.put(101, "mahesh");
		map.put(100, "suresh");
		map.put(103, "ramesh");
		map.put(104, "gangaram");
		map.put(106, "sitaram");
		map.put(102, "jalaram");
		map.put(108, "ghanshyam");
		map.put(109, "balram");
		map.put(101,null);
		map.put(null, "ram");
		map.put(111, null);
		map.put(null, "shyam");
		System.out.println(map.keySet());
		
		System.out.println(map);
		boolean ans=map.containsKey(108);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(ans);
		ans=map.containsValue("mahesh");
		System.out.println(ans);
		System.out.println(map.entrySet());
		System.out.println(map.get(101));
		map.remove(111);
		System.out.println("map-->"+map);
		
		System.out.println("map iterate using keyset");
		for(Integer i:map.keySet()) {
			System.out.println(i+":"+map.get(i));
		}
		System.out.println("map iterate using values");
		for(String s:map.values()) {
			System.out.println(s);
		}
		
		System.out.println("map iterate using entryset");
		for(Map.Entry<Integer, String>s:map.entrySet()) {
			//System.out.println(s);
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

}
