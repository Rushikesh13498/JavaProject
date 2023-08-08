package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModification {

	public static void main(String[] args) {
	ConcurrentHashMap<Integer,String> hs=new ConcurrentHashMap<>();
	CopyOnWriteArrayList<Integer> c=new CopyOnWriteArrayList<>();
    c.add(23);
    c.add(67);
    c.add(98);
    Scanner sc=new Scanner(System.in);
    
    Iterator<Integer> it1= c.iterator();
    while(it1.hasNext())
    {
    	c.add(sc.nextInt());
    	System.out.println( it1.next());
    }
 
    
    System.out.println(c);
    
    
	
	
	
	
	
	
	
	
	
	
	
	ArrayList<Integer> al=new ArrayList<Integer>();
  al.add(23);
  al.add(56);
  al.add(78);
    Iterator<Integer> it= al.iterator();
    while(it.hasNext())
    {
    	//al.add(89);
    //	System.out.println( it.next());
    }
  
  

}

}