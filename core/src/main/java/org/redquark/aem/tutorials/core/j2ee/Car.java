package org.redquark.aem.tutorials.core.j2ee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car implements Set7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set <String> set2 = new HashSet <>();
     
     
     set2.add("ford");
     set2.add("benze");
     set2.add("swift");
     
     System.out.println("car names"+ set2);
     for(String yes:set2)
     {
    	 System.out.println("elements in the set2"+yes);
     }
     Iterator it=set2.iterator();
     while(it.hasNext()){
    	 System.out.println("elements in the set2"+it.next());
     }
    	
     List<Integer> set3=new ArrayList();
     set3.add(557);
     set3.add(876);
     set3.add(545);
     for(Integer ok:set3) {
    	 System.out.println("elements in the set3====   "+ok); 
    	 
    	 
    	 
     }
     Map<Integer,String> m=new Hashtable<>();
     m.put(1, "telugu");
     m.put(2, "tamil");
     m.put(3, "kannada");
     
     
     for(Map.Entry<Integer, String> entry:m.entrySet()) {
    	 System.out.println("elements in the key====   "+entry.getKey()); 
    	 
    	 System.out.println("elements in the value====   "+entry.getValue()); 
     }
     
     }
     

	@Override
	public void carname() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String tyres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String seats() {
		// TODO Auto-generated method stub
		return null;
	}

}
