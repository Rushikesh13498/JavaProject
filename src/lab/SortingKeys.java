package lab;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SortingKeys {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "red");
		hs.put(3, "black");
		hs.put(2, "yellow");
		
//1 scenario sort keys in ascending order(first check whether
//it is wrapper class or not,It it is custom use comparable
		
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>(hs);
		
		System.out.println(ts);
		
//2 scenario sort keys in descending order(first check whether
//it is wrapper class or not,It it is custom use comparable
		
//1st option
		TreeMap<Integer,String> ts1=new TreeMap<>( new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
	   });
		ts1.putAll(hs);
		System.out.println(ts1);
		
//2  option
		TreeMap<Integer,String> ts2=new TreeMap<Integer,String>(hs);
	NavigableMap<Integer, String> map=	ts2.descendingMap();
	System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
