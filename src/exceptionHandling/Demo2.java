package exceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {10,30,20,50,65};
   try {
   for (int i = 0; i <= a.length; i++) {
	System.out.println(a[i]);
}
   }catch(ArrayIndexOutOfBoundsException e) {
	   System.out.println(e);
	   System.out.println("message: "+e.getMessage());
	   System.out.println("class: "+e.getClass());
	   e.printStackTrace();
	   System.out.println(e.getCause());
   }
	}

}
