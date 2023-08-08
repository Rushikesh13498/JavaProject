package MockPapersMarch;

import java.io.IOException;

public class Q2 {
	public static void main(String[] args) {

		Parent p = new TestExceptionChild3();
		try {
		p.msg();
		} catch (Exception e) {
		}
		}
		}
		class Parent {
		void msg() throws IOException {
		System.out.println("parent");
		}
		}
		class TestExceptionChild3 extends Parent {
		void msg() throws NullPointerException {

		System.out.println("child");
		}

		}

// Output= Child

