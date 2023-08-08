package oops;

public class Games {
	int gid;
	String g_game;
	int price;
	
	public Games() {
		System.out.println("Welcome to game Zone......");
	}
	
	public Games(int gid,String g_name,int price) {
		this();
		System.out.println("this is a parameter");
		this.gid=gid;
		this.g_game=g_name;
		this.price=price;
	}
	
	public void showGames() {
		System.out.println(gid+" "+g_game+" "+price);
	}

	public static void main(String[] args) {
		Games g1=new Games(1,"Football",5000);
		g1.showGames();

	}

}
