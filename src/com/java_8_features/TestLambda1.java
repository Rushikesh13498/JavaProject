package com.java_8_features;

interface Printable{
	void printMsg(String msg);
}


public class TestLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p=(m)->{
			System.out.println("msg is:"+m);
		};
		p.printMsg("JAVA");
		
		//we can avoid{}
		Printable p1=(m)->System.out.println("msg is:"+m);
		p1.printMsg("SQL");
		
		//se can avoid () if there is only one parameter
		Printable p2=m->System.out.println("msg is:"+m);
		p2.printMsg("HTML");
	}

}
