package org.redquark.aem.tutorials.core.j2se;

public class DataSLYCall {

	public static void main(String[] args) {
		
		DataSlyTemplate template = new DataSlyTemplate();
		
		template.myName();
		
		//template.myFrndName("Khadhar" , "Satish" , "Shaik"); // arg or parameter
		
		System.out.println(template.myName());	
		
		System.out.println(template.myFrndName("1", "2", "3"));	
		System.out.println(template.myFrndName("1", "2", "3"));	
		System.out.println(template.myFrndName("1", "2", "3"));	
		System.out.println(template.myFrndName("1", "2", "3"));	
		
		/// data-sly-template    ///data-sly-call
	}

}
