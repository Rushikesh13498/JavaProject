package exceptionHandling;

public class ExceptionhandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Start");
		 int a=10;
		 int b=2;
		 try {
			 int div=a/b;
			 System.out.println("Division:"+div);
		 }catch(ArithmeticException e) {
			 System.out.println("error");
		 }
		 System.out.println("thank you");
		 System.out.println("end");
	}

}
