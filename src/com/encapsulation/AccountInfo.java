package com.encapsulation;

public class AccountInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account myacct=new Account();
        myacct.setAccountno(1452658);
        myacct.setType("Current");
        myacct.setBalance(46628);
        
        if (myacct.getBalance()>=1000) {
        	
        
	
	int no=myacct.getAccountno();
	System.out.println(no);
	
	System.out.println(myacct.getType()+" "+myacct.getBalance());
        }
	
	
	
	}
       
}
