package myexample.model;

public class Student {
	private int id;
	private String name;
	private int age;
	
	
	
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public int setId(int id) {
		return this.id = id;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		return this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s=(Student)obj;
		
		return this.id==(s.id)&&this.name.equals(s.name)&& this.age==s.age;
	}
	
	public static void main (String []args) {
		
		/*
		 * Student s1=new Student(1,"ram",20); Student s2=new Student(2,"balram",15);
		 * Student s3=new Student(3,"jalaram",18); Student s4=new Student(4,"shyam",22);
		 */
		
		
		
		/*
		 * System.out.println(s1==s2); System.out.println(s1.equals(s3));
		 * System.out.println(s1==s4);
		 */
		
	}
	

}
