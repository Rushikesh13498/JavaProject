package MockPapersMarch;

public class q8 {
	
		public static void main(String[] args) {
		Test t = new Test();

		t.start();
		System.out.println("Main");
		}
		}
		class Test implements Runnable {
		public void run() {
		System.out.println("Hi");

		}
		}


