package exceptionHandling;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=null;
		int num[]= {10,20,35};
		int a=10;
		int b=0;
		
		try {
			int div=a/b;
			System.out.println("div=="+div);
			System.out.println("array:"+num[5]);
			System.out.println(name.length());
		}catch(ArithmeticException e) {
			System.out.println("do not divide by zero");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please check index number");
			// TODO: handle exception
		}catch(RuntimeException e) {
			System.out.println("runtime exception");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rest of the code");
		
	}

}
