package org.redquark.aem.tutorials.core.j2ee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>();
		ArrayList<String> arrlist = new ArrayList<>();
		
		
		list1.add("S");
		list1.add("S1");
		list1.add("S2");
		list1.add("S3");
		list1.add("S");
		
		System.out.print(list1);
		
		System.out.print(list1.get(3));
		
		Iterator it=list1.iterator();
		
		while(it.hasNext()) {
			
			System.out.println( "elements in the list iteration " +it.next());
	
		}
		
		ListIterator listit=list1.listIterator();
		
		while(listit.hasNext()) {
			
			System.out.println( "elements in the  iteration " +listit.next());
		}
		 
	}
}
