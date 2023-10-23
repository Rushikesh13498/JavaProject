package exceptionHandling;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=null;
		int num[]= {10,20,35};
		int a=10;
		int b=0;
		
		try {
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(name.length());
			}
			catch(NullPointerException e) {
				System.out.println("null pointer exception");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
