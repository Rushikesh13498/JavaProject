package lab;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		Enumeration<Integer> en=v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
			
		}

	}

}
