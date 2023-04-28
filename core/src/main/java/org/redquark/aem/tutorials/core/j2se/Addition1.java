package org.redquark.aem.tutorials.core.j2se;

public class Addition1 {

	public static void main(String[] args) {

		int a=10;
		int b=15;
		System.out.println(a+b);
		System.out.println(a*b);
		a=100;
		System.out.println(a-b);
		a=150;
		System.out.println(a/b);
		// method or function calling
		addition();
		System.out.println("end of Addition");
		
	

	}
	 //void - nothing to return
	/*
	 * method or function
	 */
	static void addition() {
		
		int a=100;
		int b =15;
		int total=a+b;
		System.out.println("Total value displaying *****  "+ total);
		
	}

}
