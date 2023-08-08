package MockPapersMarch;

public class Q16 {
	public interface MyInterface {
	    void doSomething();
	}

	public class Main {
	    public static void main(String[] args) {
	        MyInterface myInterface = new MyInterface() {
	            @Override
	            public void doSomething() {
	                System.out.println("Anonymous class implementing MyInterface");
	            }
	        };

	        myInterface.doSomething();
	    }
	}}

	public abstract class MyAbstractClass {
	    public abstract void doSomething();
	}

	public class Main1 {
	    public static void main(String[] args) {
	        MyAbstractClass myAbstractClass = new MyAbstractClass() {
	            @Override
	            public void doSomething() {
	                System.out.println("Anonymous class extending MyAbstractClass");
	            }
	        };

	        myAbstractClass.doSomething();
	    }
	}



