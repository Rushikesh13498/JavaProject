package MOCK;

import java.util.*;

public class Employee1 {
	int id;
	String name;
	int salary;

	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		ArrayList<Employee1>emp=new ArrayList<>();
       emp.add(new Employee1(1,"ram",25000));
       emp.add(new Employee1(2,"Shyam",65000));
       emp.add(new Employee1(3,"Balram",45000));
       emp.add(new Employee1(4,"Ghanshyam",35000));
       emp.add(new Employee1(5,"Geeta",30000));
       emp.add(new Employee1(4,"Seeta",40000));
       
       for(Employee1 e:emp) {
    	   System.out.println(e.id+" "+e.name+" "+e.salary);
       }
       
       System.out.println("............Display Employee Name and Salary..................");
       
       HashMap<String,Integer>emp1=new HashMap<String,Integer>();
       for(Employee1 e:emp) {
    	   emp1.put(e.name, e.salary);
    	   System.out.println("Name:"+e.name+"\n"+"Salary:"+e.salary+"$");
    	   System.out.println("......................");
    	   
       }
	}

}
