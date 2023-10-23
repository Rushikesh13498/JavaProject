package com.HashmapLab;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<Integer,String>h=new HashMap<>();
   
   h.put(4, "krishna");
   h.put(44, "ram");
   h.put(2, "Shyam");
   h.put(1, "Amol");
   h.put(6, "Balram");
   h.put(8, "Radha");
   
   TreeMap<Integer,String>tm=new TreeMap(h);
   
   System.out.println(h);
   
   Set<Entry<Integer,String>>set=h.entrySet();
   
   Iterator<Integer,String>itr=set.iterator();
   while(itr.hasNext()) {
	   Entry<String,String>str=itr.next();
	  
		   System.out.println(str.getValue());
   
	

}
}
}