package com.comparableandComparator;
import java.util.*;
public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(new Student(101,"rahul",45));
		slist.add(new Student(103,"neha",89));
		slist.add(new Student(104,"pooja",56));
		slist.add(new Student(102,"kavita",78));
		slist.add(new Student(105,"aman",66));
		
		System.out.println("---student list----");
		System.out.println(slist);
		
		System.out.println("---student list with toString()---");
		for(int i=0;i<slist.size();i++) {
			System.out.println(slist.get(i));
		}
		
		System.out.println("----student list without toString()----");
		for(int i=0;i<slist.size();i++) {
			Student s=slist.get(i);
			s.show();
		}
		
		System.out.println("----student list without toString()----");
		for(int i=0;i<slist.size();i++) {
			Student s=slist.get(i);
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSmarks());
		}
		
		//for-each
		System.out.println("----student list with for-each loop---");
		for(Student s:slist) {
			System.out.println(s);
		}
		
		//Iterator
		System.out.println("----student list with Iterator---");

		Iterator<Student>itr=slist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//Student s=itr.next();
			//System.out.println(s);
		}
		
		
		Collections.sort(slist);
		System.out.println("---sorting student list---");
		itr=slist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
