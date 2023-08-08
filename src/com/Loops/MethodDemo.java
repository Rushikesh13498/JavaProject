package com.Loops;

public class MethodDemo {

	public void show ()
	{
		System.out.println("This is show method");       
	}

public void addition (int n1 , int n2)
{
System .out.println("Addition="+(n1+n2));

}
public int findsqu()
{
int ans=4*4;
return ans;
}

public float findAreaCircle(float PI,int radius) {
	
	float area=PI*radius*radius;
	return area;
}
public static void main(String[] args) {
	
	MethodDemo md=new MethodDemo();
	
	md.show();
	
	md.addition(4, 5);
    int result=md.findsqu();
    float ans = md.findAreaCircle(3.14f,5);
        
    System.out.println("area of circle  ="+ ans);
}


}
