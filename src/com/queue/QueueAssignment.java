package com.queue;

import java.util.*;

public class QueueAssignment {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("---------------------Q1--------------------");
		Queue q = new LinkedList();

		q.add(1);
		q.add(21);
		q.add(15);
		q.add(24);
		q.add(78);

		System.out.println(q);

		System.out.println("-----------------------Q2----------------------");

		Queue<String> sq = new LinkedList<>();

		sq.add("red");
		sq.add("orange");
		sq.add("green");
		sq.add("white");
		sq.add("blue");
		sq.add("black");

		System.out.println(sq);

		System.out.println("---------------------------Q3----------------------");

		Queue<Student> st = new LinkedList<>();

		st.add(new Student(1, "payal", 98));
		st.add(new Student(2, "rutuja", 93));
		st.add(new Student(3, "sakshi", 92));
		st.add(new Student(4, "shital", 88));
		st.add(new Student(5, "pallavi", 84));

		System.out.println(st);

		System.out.println("------------------------Q5-----------------------");

		System.out.println(st.isEmpty());// if empty return true else return false

		System.out.println("--------------------------Q6-------------------");
		System.out.println(st.peek());// return head/top element of queue

		System.out.println("-----------------------Q7--------------------");
		System.out.println("st:" + st.remove());// removes first/top/head element and print it

		System.out.println("----------------------Q8----------------------");
		System.out.println(st.poll());// removes head of queue and print it.
		// System.out.println(st.removeAll(st));//remove all elements from queue
		System.out.println(st);

		System.out.println("------------------------Q9----------------------");
		System.out.println(st.remove(sq));

		System.out.println("-------------------------Q12-------------------------");

		Queue q1 = new PriorityQueue();

		q1.add(1);
		q1.add(21);
		q1.add(15);
		q1.add(24);
		q1.add(78);

		System.out.println(q1);

		System.out.println("----------------------Q13---------------------------");
		PriorityQueue<String> sq1 = new PriorityQueue<>();

		sq1.add("red");
		sq1.add("orange");
		sq1.add("green");
		sq1.add("white");
		sq1.add("blue");
		sq1.add("black");

		System.out.println(sq1);
		
		
		System.out.println("-------------------------Q14--------------------");

		
		Queue<Student>stu=new PriorityQueue<Student>();
		
		stu.add(new Student(1, "sanskar", 98));
		stu.add(new Student(2, "rushikesh", 100));
		stu.add(new Student(3, "rahul", 80));
		stu.add(new Student(4, "vipil", 70));
		stu.add(new Student(5, "ravindra", 90));
		
		System.out.println(stu);
		
		System.out.println("------------------------------Q15------------------------");
		
		System.out.println(stu.remove());//Retrieves and removes the head of this queue.
		System.out.println(stu);
		
		System.out.println("-------------------------Q16----------------------------");
		
		
		
		Queue<Employee>eq=new PriorityQueue<Employee>();
		eq.add(new Employee(1,"karan",25000));
		eq.add(new Employee(2,"arjun",20000));
		eq.add(new Employee(3,"pandav",35000));
		eq.add(new Employee(4,"balram",30000));
		eq.add(new Employee(5,"krishna",50000));
		eq.add(new Employee(6,"bhishma",15000));
		
		for(Employee e:eq) {
			System.out.println(e);
		}
		
	}

}
