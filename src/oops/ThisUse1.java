package oops;

public class ThisUse1 {
	int x;
	
	public void input (int x) {
		this.x=x;
	}

	public void put () {
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		ThisUse1 u =new ThisUse1();
		u.input(100);
		u.put();
	}

}
