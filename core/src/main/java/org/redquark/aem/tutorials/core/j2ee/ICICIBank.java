package org.redquark.aem.tutorials.core.j2ee;

public class ICICIBank implements CreditCard {

	int limit = 10000;
	
	@Override
	public void creditCardname() {
	
		System.out.println("I am in ICIC bank Credit card");	
   
	}

	@Override
	public int credit(int amount) {
		
		int balance=limit+amount;
		return balance;
	}

	@Override
	public int debit(int amount) {
		
		if(amount<limit) {
		int balance=limit - amount;
		return balance;
		}else {
			
			return -1;
		}
	}

}
