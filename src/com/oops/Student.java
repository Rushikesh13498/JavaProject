package com.oops;

public class Student {
       int tmark1;
       int tmark2;
       int tmark3;
       
  public void acceptmarks(int mark1,int mark2,int mark3) {
	  tmark1=mark1;
	  tmark2=mark2;
	  tmark3=mark3;
  }
  
  public void Calculatepercentage() {
	  float per=(tmark1+tmark2+tmark3)/3;
	  System.out.println("percentage is:"+per);
	  if(per>75.0) {
		  System.out.println("Congratulations!! Result=First Class");
	  }else  {
		  System.out.println("Result=Second Class");
	  }
  }
	public void display() {
	   System.out.println(tmark1+" "+tmark2+" "+tmark3+" ");
	}
	
	public static void main(String[] args) {

		Student s1=new Student();
		s1.acceptmarks(80,65,75);
		s1.display();
		s1.Calculatepercentage();
		
	}

}
