package com.list;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(101, "ram", 96));
		slist.add(new Student(103, "balram", 66));
		slist.add(new Student(102, "jalaram", 56));
		slist.add(new Student(104, "sitaram", 75));
		slist.add(new Student(105, "shyam", 89));

		System.out.println("--Student list---");
		System.out.println(slist);

		System.out.println("-------Student list with tostring-------");
		for (int i = 0; i < slist.size(); i++) {
			System.out.print(slist.get(i));

		}
		System.out.println();
		System.out.println("-------Student list without to string( by creating show method)------------");
		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);
			s.show();

		}
		System.out.println();
		System.out.println("-------Student list without to string (by using getter setter)------------");
		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);
			System.out.println("id:" + s.getId() + "  " + "name:" + s.getSname() + "  " + "marks:" + s.getSmarks());
		}

		System.out.println();
		System.out.println("-----Student list with for-each loop-------");
		for (Student s : slist) {
			System.out.print(s);

		}
		System.out.println();
		System.out.println("---------Student list with iterator----------");
		Iterator<Student> itr = slist.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}

		System.out.println();
		System.out.println("---------Finding specific data-------");

		System.out.println("Enter the name of student you want to search:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);

			if (name.equals(s.getSname())) {
				System.out.println("present");

				break;

			} else {
				System.out.println("not present");
			}

		}

		System.out.println();
		System.out.println("-----printing student data using id---------");
		System.out.println("Enter id:");
		int sid = sc.nextInt();

		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);
			if (slist.get(i).getId() > sid) {
				System.out.println(slist.get(i));
			}
		}

	}

}
