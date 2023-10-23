package exceptionHandling;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		try {
			int div = a / b;
			System.out.println(div);
		}

		catch (ArithmeticException e) {
			System.out.println("Caught Arithmetic Exception-->"+" "+e.getMessage());
			System.out.println();
		}

		// finally block always execute.
		// to run code cleanly finally block is used
		finally {
			System.out.println("finally always execute");
		}
		System.out.println("end");
	}

}
