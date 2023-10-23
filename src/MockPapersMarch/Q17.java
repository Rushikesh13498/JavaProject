
package MockPapersMarch;

public class Q17 {

	 int intVar = 0;

	static String strVar = "InnerClassExample"; private int intPvt = 4 ; public static int intStatic = 61; private  static String strPvtStatic = " java"; private  void printVar(){

	System.out.println(intVar + " "+ strVar + " " + intPvt);

	}

	static class Nested{

	public void printStaticInnerVar(){

	System.out.println(" variable from outer class "+strVar); //1

	System.out.println(" static variable from outer class "+ intStatic);// 2

	System.out.println(" I am from static inner class"); //3

	}

	}

	class InnerClass {

	int intInner = 9 ; //4

	static int num = 0 ; //5

	static final int numConstant = 10 ; //6

	String strInner = " I am string in innerclass";

	public void printInnerVar(){

	System.out.println(" I am from inner class "+strVar );

	}

	}


	public static void main(String[] args) { 
		Nested sn = new Nested();

	sn.printStaticInnerVar(); //7

	Q17 icd = new Q17();


	Q17.InnerClass inObj = icd.new InnerClass(); inObj.printInnerVar(); //8


	
	 
	}

	}


//O/P----->
//variable from outer class InnerClassExample
//static variable from outer class 61
//I am from static inner class
//I am from inner class InnerClassExample
