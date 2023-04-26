package org.redquark.aem.tutorials.core.j2ee;

public class ForLoop {

	public static void main(String[] args) {

		
		for(int i=0;i<=10;i++) {
			//System.out.println("i value is : " + i);
			if(i==5 || i==8 || i==10) {
				//System.out.println("condition satisfied " +i);
			}
			
		}
		// incrementment
		for(int i=0;i<=10;i++) {
			
			// 1 . intilization i=0
			//2.condition check 0<=10
			// 3.i++ 0+1 =1
	
			
			//System.out.println(i);
		}
		
		System.out.println("=============================");
	
		//decrent
		for(int i=10;i>=0;i--) {
			
			//System.out.println(i);
		}
		
		for(int n=0;n<20;n++) {
			
			if(n % 2 == 0) {
				
				System.out.println("Even Number is :: " + n);
			}
			
			
		}
		
		
		
		
	
	}

}


/**
 * for loop
 * while loop
 * do while loop
 * for each loop
 * 
 * 
 * for(intialization ; condition ; incremtn/ decremtn ){
 * 
 * }
 * 
 * 
 *
 * **/
