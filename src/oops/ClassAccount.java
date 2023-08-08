package oops;

public class ClassAccount {
	
	String customerName;
	long accountNo;
    
	public void acceptDetails(String name,long ACno) {
   
	 customerName=name;
     accountNo=ACno;	
	}
	
	public void display() {
		System.out.println(customerName+" "+accountNo+" ");
	}
	
	public static void main(String[] args) {
		
		ClassAccount s1=new ClassAccount();
		s1.acceptDetails("Satish", 456635113);
        s1.display();
	}

}
