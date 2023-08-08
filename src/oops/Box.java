package oops;

public class Box {
   int length;
   int width;
   int height;
 
   
   public void acceptdetails(int L,int W,int H) {
	   length=L;
	   width=W;
	   height=H;
	  
   }
   public void volume() {
	   int TotalVol=length*width*height;
	   System.out.println(TotalVol);
   }
   public void display() {
	   System.out.println(length+" "+width+" "+height+" ");
   }
   
	public static void main(String[] args) {
	  Box b1=new Box();
	  b1.acceptdetails(5, 6, 4);
      b1.display();
      b1.volume();	
	}

}
