package oops;
import java.util.Scanner;

public class StudentData {

	int sid;
	String sname;
	int smark1;
	int smark2;
	int smark3;
	
	public void acceptDetails(int id,String name,int mark1,int mark2,int mark3){
	sid=id;
	sname=name;
	smark1= mark1;
	smark2= mark2;
	smark3= mark3;	
	
	}
	
	
	public void Calculatepercentage() {
		
		 double Per =((smark1 + smark2 + smark3)/3);
		System.out.println("percentage ="+Per);
			
		}
	public void display() {
		System.out.println(sid+" "+sname+" "+smark1+" "+smark2+" "+smark3);		
	
	
	}
	
		
	public static void main(String[] args) {
    
		StudentData s1=new StudentData();
		s1.acceptDetails(1, "ram", 80, 90, 90);
		s1.display();
		s1.Calculatepercentage();
		
		StudentData s2=new StudentData();
		s2.acceptDetails(2, "shyam", 75 , 90, 90);
		s2.display();
		s2.Calculatepercentage();
		
		StudentData s3=new StudentData();
		s3.acceptDetails(3, "Geeta", 80, 85, 95);
		s3.display();
		s3.Calculatepercentage();
        
	}

}
