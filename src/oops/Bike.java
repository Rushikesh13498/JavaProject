package oops;

public class Bike {
	
	final int speedlimit=80;
	
	void run() {
		//speedlimit=100; not allowed to reinitialize value of final 
		System.out.println( speedlimit);
	}

	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.run();

	}

}
