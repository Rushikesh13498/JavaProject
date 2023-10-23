package com.Array;


class Student{
	int id;
	String name;
	int marks;
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	public String toString() {
		return id+" "+name+" "+marks;
	}
}


public class ArrayDemos {
 
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student stud[]=new Student[3];
         
         stud[0]=new Student(1,"raj",85);
         stud[1]=new Student(2,"Martin",90);
         stud[2]=new Student(3,"Jyoti",50);
         
         System.out.println(".................");
         
         for(int i=0;i<stud.length;i++) {
        	 System.out.println(stud[i]);
         }
         System.out.println("....................");
         for(Student s :stud) {
        	 System.out.println(s);
         }
        
	}

}
