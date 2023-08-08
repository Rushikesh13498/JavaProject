package com.Array;

public class ReplaceNo {
	
	public void Replace(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==20) {
				System.out.print( a[i]=0);
			}else {
				System.out.print(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,20,30,20,50,20,40,20};
      
      ReplaceNo r=new ReplaceNo();
      r.Replace(a);
      
	}

}
