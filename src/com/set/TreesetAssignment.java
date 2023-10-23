package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------Q1---------------");
		
		HashSet<Integer>hs1=new HashSet<>();
		hs1.add(101);
		hs1.add(125);
		hs1.add(23);
		hs1.add(101);
		hs1.add(117);
		hs1.add(30);
		hs1.add(5);
		
		HashSet<Integer>hs2=new HashSet<>();
		hs2.add(10);
		hs2.add(15);
		hs2.add(203);
		hs2.add(11);
		hs2.add(117);
		hs2.add(30);
		hs2.add(212);
		
		TreeSet<Integer>t=new TreeSet<>(hs1);
		System.out.println(t);
		
		TreeSet<Integer>t1=new TreeSet<>(hs2);
		System.out.println(t1);
		
		System.out.println("-----------------Q2---------------");
		
		TreeSet<String>ts=new TreeSet<>();
		
		ts.add("red");
		ts.add("orange");
		ts.add("yellow");
		ts.add("green");
		ts.add("blue");
		ts.add("black");
		
		System.out.println(ts);
		
		System.out.println("------------------Q3-----------------");
		
		Iterator<String>itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------Q4-----------------");
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		

		System.out.println("------------------Q5-----------------");
		System.out.println(ts.size());
		

		System.out.println("------------------Q6-----------------");
		
		System.out.println(ts.descendingSet());
		

		System.out.println("------------------Q7-----------------");
		
		//System.out.println(ts.remove("red"));
		System.out.println(ts);
		
		
		System.out.println("----------------Q8----------------------");
		System.out.println(ts.pollFirst());
		System.out.println(t.first());
		
		
		System.out.println("---------------------Q9------------------");
		System.out.println(ts.pollLast());
		
		System.out.println("-----------------------Q10-------------------");
		
		System.out.println(t.ceiling(27));
		
		System.out.println("------------------Q11--------------------");
		System.out.println(t.floor(25));
		
		System.out.println("-----------------Q12----------------");
		System.out.println(t.higher(30));//strictly greater than or equal to the given element. 
		
		
		System.out.println("----------------------Q13------------------------");
	   System.out.println(t.lower(101));//strictly lower than or equal to the given element.
	
	System.out.println("------------------------Q14----------------------------");
	System.out.println(t.equals(t1));
	
	System.out.println("--------------------Q15---------------------");
	System.out.println(t.floor(7));
	
	System.out.println("------------------Q16--------------------");
	System.out.println(t.ceiling(7));
	
	System.out.println("----------------Q17---------------------");
	TreeSet<Integer>t2=new TreeSet<>();
	t2.addAll(t);
	for(Integer i:t2) {
		System.out.println(i);
	}
	
	System.out.println("----------------------Q18-----------------------");
	TreeSet<Employee>et1=new TreeSet<Employee>();
	Employee e2=new Employee(2, "balram", 15000);
	Employee e1=new Employee(1, "ram", 25000);
	
	Employee e3=new Employee(3, "sitaram", 55000);
	Employee e4=new Employee(4, "jalaram", 35000);
	Employee e5=new Employee(5, "ghanshyam", 25000);

	et1.add(e1);
	et1.add(e4);
	et1.add(e3);
	et1.add(e2);
	et1.add(e5);

	System.out.println(et1.size());
	
	System.out.println(et1);

	System.out.println("-----------------------Q19--------------------------");
	et1.add(e5);
	System.out.println(et1);//cannot print duplicate object..

	
	System.out.println("---------------------------Q21--------------------------");
	System.out.println(et1.descendingSet());
	
	
	}
	


}
