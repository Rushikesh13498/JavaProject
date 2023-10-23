package com.Array;

public class FindUniqueElement {
	

		public static void main(String[] args) {

			int n[] = new int[] { 0, 0, 30, 40, 50, 50, 50 ,7,8,9,66,3,65};

			int ne[] = new int[n.length];
			int i=0;
			int j=0;
			for ( i = 0; i < n.length; i++) {

				for ( j = i + 1; j < n.length; j++) {
					if (n[i] != n[j]) {
						ne[i]= n[i];
					}

					
				}
				if(ne[i]!= '\0')
				{
					
					System.out.println(ne[i]);
					
				}
				
				
			}
		}

	}
