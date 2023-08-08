package MockPapersMarch;



	public class Q10 implements InterfaceDemo{ 
		public static void main(String[] args) {
		Q10 impl = new Q10();
		 
		impl.day = "Sunday";
		System.out.println(impl.day);
		}
		}
		interface InterfaceDemo {
		String day = "Monday";
		}

//O/P-->
//Sunday

		
		
