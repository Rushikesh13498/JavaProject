package com.oops;

public class CheckNumber {
	   
		public void checkNumber(int num) {
			int count=0;
			int temp=num;
			while (num>0) {
				
				count++;
				num=num/10;
			}
			System.out.println(count);
			
			num=temp;
			int sum=0;
			while(num>0)
			{
				int digit=num%10;
				
				int power=1;
				for(int i=1;i<=count;i++)
				{
					power=power*1;
				}
				sum=sum+power;
				
				
			}
			
			
			
			
			
			
			
		}

	}
