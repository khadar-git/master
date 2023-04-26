package org.redquark.aem.tutorials.core.j2ee;

public class SwitchClass {

	public static void main(String[] args) {

		int number =100;
		
		switch(number) {
		case 99:
		 System.out.println("condtion case satisfied at 99 case");	
		 break;
		 
		case 100:
			 System.out.println("condtion case satisfied at 100 case");	
			 break;
		case 200:
				
			 System.out.println("condtion case satisfied at 200 case");	
			 break;
		default:
			 System.out.println("condtion case satisfied at default case");	
		}
		
		
		String myDay = null;
		int  day=1;
		
		switch(day) {
		
		case 1:
			//System.out.println("Monday");
			myDay="Monday";
			break;
		case 2:
			//System.out.println("Tuesday");
			myDay="Tuesday";
			break;
		default:
			System.out.print("default block");
		
		}
		System.out.println(myDay);
		
		
		
		String day1 = "Monday";
		//int  day=1;
		
		switch(day1) {
		
		case "Monday":
			//System.out.println("Monday");
			myDay="Monday";
			break;
		case "Tuesday":
			//System.out.println("Tuesday");
			myDay="Tuesday";
			break;
		case "Khadar":
			//System.out.println("Tuesday");
			myDay="Tuesday";
			break;
		default:
			System.out.print("default block");
		
		}
		System.out.println(myDay);
		
		
		
		
		
		
		
		
	}

}
