package org.redquark.aem.tutorials.core.j2ee;

public class HDFCBank implements CreditCard {

	int limit = 20000;
	// Method defination
	@Override 
	public void creditCardname() {
			
		System.out.println("I am providing HDFC credit card");
		
	}

	@Override
	public int credit(int amount) {

		
		return 0;
	}

	@Override
	public int debit(int amount) {
		
		return 0;
	}
	//--- polymorphisum  = poly = many , 
	
	
	
	// Inheritency 
	
}
