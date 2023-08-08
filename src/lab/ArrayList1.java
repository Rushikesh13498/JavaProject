package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
	int id;
	String name;
	List<Integer> marks;
	
	ArrayList<Student> al=new ArrayList();
	
	Student ()
	{
		
	}
	
	public Student(int id, String name, List<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", al=" + al + "]";
	}
	 
	 ArrayList<Student> showList()
	 {
		 
			al.add(new Student(1,"pooja",Arrays.asList(67,78,89,90,70)));
			al.add(new Student(2,"sonali",Arrays.asList(67,78,80,95,70)));
			al.add(new Student(3,"Rinky",Arrays.asList(70,68,80,90,72)));
			return al;
			
	 }
	
}

public class ArrayList1 {

	public static void main(String[] args) {
		
		
	}

}
