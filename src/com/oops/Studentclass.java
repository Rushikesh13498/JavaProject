package com.oops;

public class Studentclass {
	
	public int rollno=22;
	protected int admissionNo=331;
	private int age=23;
	int courseid=412;
	
	public void doPublic() {
		System.out.println("this is public");
	}
	protected void doprotected() {
		System.out.println("this is protected");
	}
	private void doPrivate() {
		System.out.println("this is private");
	}
	void doDefault() {
		System.out.println("this is default");
	}
	
	public void show()
	{
		System.out.println(rollno+" "+admissionNo+" "+ age+" " +courseid);
	}

	public static void main(String[] args) {
		
		Studentclass student=new Studentclass();
		student.doPublic();
		//System.out.println(c1.rollno);
		student.doprotected();
		//System.out.println(c1.admissionNo);
		student.doPrivate();
		//System.out.println(c1.age);
		student.doDefault();
		//System.out.println(c1.courseid);
		student.show();
		
	}

}
