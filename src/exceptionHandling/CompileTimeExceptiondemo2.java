package exceptionHandling;

public class CompileTimeExceptiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start");
		try {
			Class clsname=Class.forName("exceptionHandling.Demo2");
			System.out.println("Class name:"+clsname);
		}
		catch(ClassNotFoundException e) {
			System.out.println("please check class name");
		}
		System.out.println("----end-----");
	}

}
