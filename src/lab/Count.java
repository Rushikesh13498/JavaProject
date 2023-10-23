package lab;

import java.util.ArrayList;
import java.util.HashMap;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();

		a1.add("navin");
		a1.add("prasad");
		a1.add("Suraj");
		a1.add("Rushikesh");
		a1.add("swati");
		a1.add("keshav");
		a1.add("sharda");
		a1.add("shivani");
		a1.add("Suraj");
		a1.add("Rushikesh");
		a1.add("Swati");
		a1.add("Rushikesh");

		System.out.println(a1);
      int count=0;
      HashMap<String, Integer>hm=new HashMap<>();
		/*
		 * for(int i=0;i<a1.size();i++) { for(int j=i+1;j<a1.size();j++) {
		 * if(a1.get(i)==a1.get(j)) { count++; } }
		 * 
		 * hm.put(a1.get(i), count); }
		 * 
		 * System.out.println(hm);
		 */
      
      for(String s:a1) {
    	  if(a1.contains(s)) {
    		  hm.put(s, hm.get(s)+1);
    	  }else {
    		  hm.put(s, 1);
    	  }
      }
      System.out.println(hm);
      
      
      
      
      
      
      
	}

}
