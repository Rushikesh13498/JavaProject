package com.HashmapLab;

import java.util.*;
import java.util.Map.Entry;
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
   
   Iterator<Entry<Integer, String>>itr=set.iterator();
   while(itr.hasNext()) {
	   Entry<Integer, String>str=itr.next();
	  
		   System.out.println(str.getValue());
   
	

}
}
}