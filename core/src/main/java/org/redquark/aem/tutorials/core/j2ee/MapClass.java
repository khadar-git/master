package org.redquark.aem.tutorials.core.j2ee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		

		Map<Integer,String>  map = new HashMap<>();
		Set <Integer> set = new HashSet<>();
		
		
		map.put(1, "Satish");
		map.put(2, "Khadar");
		map.put(3, "Shaik");
		map.put(4, "Shajul");
		
		System.out.println(map.get(4));
		System.out.println(map);
		
		Set setKeys=map.keySet();
		System.out.println(setKeys);
		
		
		Set setmap=map.entrySet();
		Iterator it = setmap.iterator();
		while(it.hasNext()) {
			
			Map.Entry entry=(Map.Entry) it.next();
			System.out.println( "entry :: " + entry);
			System.out.println( entry.getKey() + " ::::::: "+ entry.getValue());
			
		}
		
		for(Map.Entry  m : map.entrySet() ) {
			
			System.out.println( m.getKey() + " ::::::: "+ m.getValue());
			
		}
		
		
	}

}
