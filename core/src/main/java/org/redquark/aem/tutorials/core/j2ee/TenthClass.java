package org.redquark.aem.tutorials.core.j2ee;

public class TenthClass {
	
	public void student(int marks) {
		
		//System.out.println("I am in tenthClass");
		
		
		
		// Only one condtion to validate
	/*	if(marks<36) {
			
			System.out.println("Student has failed");
		}
		
		*/
		
		// to validate 2 conditons
		/** if(marks<36) {
			
			System.out.println("Student has failed in if block 2");
		}else {
		
			System.out.println("Student has passs");
		}
		**/
		
		
		
		if(marks<35) {
			
			System.out.println("Student has failed");
			
		}else if(marks>35  && marks <50 ) {
			
			System.out.println("Student has pass and With secound Divison");
		}else if(marks>50 && marks <75) {
			
			System.out.println("Student has pass and With First Divison");
		}else {
			
			System.out.println("Student has pass and With Distiction");
		}
		
		
		
		
	}

}
