package org.redquark.aem.tutorials.core.j2ee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClasss {

	public static void main(String[] args) {

		int a =6;
		int b;
		
		int[] array = new int [10] ;
		
		Set <String> set1 = new HashSet<>();
		
		set1.add("Satish");
		set1.add("Khadar");
		set1.add("Shaik");
		set1.add("123");
		set1.add("456");
		set1.add("456");
		
		System.out.println("elements in the set : " + set1);
		
		Set <Integer> set2 = new HashSet<>();
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		

		set2.add(null);
		
		if(set1.contains("Khadar")) {
			set1.remove("Khadar");
		}
		
		System.out.println("after removing in the set : " + set1);
		
		HashSet<Integer> hashSet = new HashSet<>();
		
	for(int i=0;i<100;i++) {
		
		hashSet.add(i);
		
	}
		
	Iterator it=hashSet.iterator();
	System.out.println("Size {} " +hashSet.size());
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
	
	
	Set <String> languagesSet = new HashSet<>();
	
	languagesSet.add("telugu");
	languagesSet.add("Hindi");
	languagesSet.add("Malyalam");
	languagesSet.add("Englishg");
	
	for(String language :languagesSet) {
		
		System.out.println(language);
	}
	
	
	

	
	
		
		
		
		
		
		
	}

}
