package com.encapsulation;

public class Student {

	
		int studentid;
		String address;
		double percentage;
	    

		public void setStudentid(int studentid){
			this.studentid=studentid;
		}

		public void setAddress(String address) {
			this.address=address;
		}
		
		public void setPercentage(double percentage) {
		 this.percentage=percentage;	
	}
           public int getStudentid() {
        	   return studentid;
           }
           public String getAddress() {
        	   return address;
           }
           public double getPercentage() {
        	   return percentage;
           }

           public void display() {
        	   System.out.println(studentid+" "+address+" "+percentage);
           }
           
public static void main(String[] args) {
	
	Student s1=new Student();
    s1.setStudentid(25);
    s1.setAddress("pune");
    s1.setPercentage(89); 
    s1.display();
	
	
	
	
	
}
}
