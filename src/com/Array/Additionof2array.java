package com.Array;

public class Additionof2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]= {{10,20},{30,40}};
		int mat2[][]= {{1,2},{3,4}};
		int sum[][]=new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=mat[i][j]+mat2[i][j];
			}
		}
		System.out.println(".....sum of two matrices.......");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
