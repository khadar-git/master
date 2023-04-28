package org.redquark.aem.tutorials.core.j2ee;

import java.util.Scanner;

public class Crad {

	public static void main(String[] args) {

		CreditCard cc = new HDFCBank();
		// HDFCBank hdfc = new HDFCBank()
		cc.creditCardname();
		
		CreditCard cc1 = new ICICIBank();
		cc1.creditCardname(); // method calling
		   
	      Scanner bf=new Scanner(System.in);
	      System.out.print("Enter amount to spent number: ");
	      int deductamount= bf.nextInt();
	      int remainingBalance=cc1.debit(deductamount);
	      
	     if( remainingBalance > 0) {
	      System.out.print("remaining balance in my ICIC Card " + remainingBalance);
	     }else {
	    	  System.out.print("Amount spent limit exceeded hence declined");
	     }
	      
	     System.out.print("Enter amount to deposit : ");
	     int creditamount= bf.nextInt();
	     int totalbalance=cc1.credit(creditamount);
	     System.out.print("remaining balance in my ICIC Card " + totalbalance);
	     
	     
	  
	     
	     
	     
	     
	}

}
