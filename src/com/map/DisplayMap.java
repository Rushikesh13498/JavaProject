package com.Collection;

import java.util.*;

public class DisplayMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,Integer>hm = new HashMap<>();
     hm.put("Pune", 12);
     hm.put("Mumbai", 01);
     hm.put("Nagpur", 31);
     hm.put("nasik", 11);
     
     System.out.println(hm);
     System.out.println("............................");
     
     for (Map.Entry<String, Integer> m:hm.entrySet()) {
    	 System.out.println(m.getKey()+" "+m.getValue());
    	 
     }
     System.out.println("...............................");
     
     Set s=hm.keySet();
     System.out.println(s);
     
     Iterator<String>itr=s.iterator();
     while(itr.hasNext()) {
    	 String str=itr.next();
    	 System.out.println(str+" "+hm.get(str));
    	 
     }
     System.out.println("....................");
    
     Set mymap=hm.entrySet();
     Iterator<Map.Entry<String, Integer>>it=mymap.iterator();
     
     while(it.hasNext()) {
    	 Map.Entry<String, Integer>m=it.next();
     }
	
	
	}

}
