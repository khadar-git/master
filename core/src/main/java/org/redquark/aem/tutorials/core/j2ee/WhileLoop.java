package org.redquark.aem.tutorials.core.j2ee;

public class WhileLoop {

	public static void main(String[] args) {

		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("================");
		int n=10;
		while(n>0) {
			System.out.println(n);
			n--;
		}
	
		System.out.println("====== DO - While ==========");
		
		int x=0;
		
		do {
			
			System.out.println(x);
			x++;
		}while(x<10);
		
		System.out.println("====== DO - While ==========");
		
		Boolean str=false;
		int y=100;
		do {
			System.out.println(y);
			y++;
		}while(str);
		
		
		
		
	}

}
