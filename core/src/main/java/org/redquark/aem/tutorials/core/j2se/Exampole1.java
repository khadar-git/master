package org.redquark.aem.tutorials.core.j2se;

import org.redquark.aem.tutorials.core.j2ee.MyClass;
import org.redquark.aem.tutorials.core.j2ee.TenthClass;

public class Exampole1 {

	public static void main(String[] args) {
 
		MyClass object = new MyClass();// Syntax for creating object for class
		
		//object.
		object.car();
		String s=object.bus();
		System.out.println(s);
		
		
		TenthClass ten=new TenthClass();
		
		int marks=48;
		ten.student(marks);
		
		
		//&&  - two join conditions
		// || - 
		// ++
		
		int i=10;
		System.out.println(i++); // i=i+1
		System.out.println(i--); //i=i-1
		System.out.println(++i);
		System.out.println(--i);
		
		//== - comparison operator
		//= assignment operator
		// != not equal 
		
		
	}

}
