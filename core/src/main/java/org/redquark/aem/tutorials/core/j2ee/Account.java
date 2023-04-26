package org.redquark.aem.tutorials.core.j2ee;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationEx ex = new EncapsulationEx();
		
		ex.setAccName("Khadar");
		ex.setAccountNum(123456);
		ex.setEmail("Khdar@gmail.com");
		ex.setBalance(100000);
		
		System.out.println(ex.getAccName() + ":: " + ex.getAccountNum() + " :: " + ex.getEmail() + "::: " + ex.getBalance());

	}

}
