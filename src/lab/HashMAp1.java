package lab;

import java.util.HashMap;

public class HashMAp1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String> ();
		
		String s=hs.put(10, "archana");
		System.out.println(s);
		s=hs.put(10, "vijay");
		System.out.println(s);
		
		s=hs.put(10, "sonali");
		System.out.println(s);
		System.out.println(hs);
		
		Integer a1=10;
		
	System.out.println(	hs.get(10));
	
		
		
		
//		hs.put(10,"archana");
//		hs.put(20, "hemraj");
//		hs.put(30, "pranali");
//		hs.put(60,"archana");
//		hs.put(70, "hemraj");
//		hs.put(80, "pranali");
//		hs.put(100,"archana");
//		hs.put(120, "hemraj");
//		hs.put(130, "pranali");
//		hs.put(140,"archana");
//		hs.put(150, "hemraj");
//		hs.put(160, "pranali");
//		hs.put(170,"archana");
//		hs.put(180, "hemraj");
//		hs.put(2000, "pranali");
		

	}

}
