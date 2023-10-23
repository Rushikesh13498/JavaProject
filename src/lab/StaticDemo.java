package lab;

public class StaticDemo {
	int id;
	String name;
	static String collegename="bmcc";
	
	

	public StaticDemo(int id,String name,String collegename) {
		this.id=id;
		this.name=name;
		this.collegename=collegename;
	}
	
	public void show() {
		System.out.println(id+" "+name+" "+collegename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StaticDemo s=new StaticDemo(1,"Ram","mit");
     s.show();
	}

	class A {
		public void show() {
	}
    class B extends A{
	public void show() {
		
	}
}  
 
	}
}

abstract class shape{
	void draw() {
		System.out.println("hii");
	}
class B extends shape{
	void draw() {
	}
}
}