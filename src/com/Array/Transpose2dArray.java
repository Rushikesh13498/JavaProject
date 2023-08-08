package com.Array;

public class Transpose2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int mat[][]= {{34,56},{78,96}};
  
  int[][] transpose=new int[2][2];
  
  for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			transpose[j][i]=mat[i][j];
		}
	}
  System.out.println(".......MAT........");
  for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(mat[i][j]+"\t"); 
			
		}
		System.out.println();
	}
  System.out.println(".......transpose........");
  for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(transpose[i][j]+"\t"); 
			
		}
		System.out.println();
	}
   
  
  
	}

}
