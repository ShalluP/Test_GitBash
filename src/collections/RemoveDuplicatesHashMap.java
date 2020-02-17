package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesHashMap {

	public static void main(String[] args) {
		
		int count =0;
		HashMap<String, Integer> hmp = new HashMap< String, Integer>();
		hmp.put("abc", 1);
		hmp.put("cde", 2);
		hmp.put("fgh", 3);
		hmp.put("ijk", 4);
		hmp.put("jkl", 2);
		hmp.put("ghi", 3);
		
		System.out.println("the hash map collection is as: ");
		
		for(Map.Entry map: hmp.entrySet())
		{
			System.out.println(map.getKey()+" "+ map.getValue());
		}	
		
		System.out.println("the o/p by converting to hashset from hashmap is as given: ");
		
		Set<Integer> int1 = new HashSet<Integer>(hmp.values());
		  
		/*
		 * Iterator<Integer> itr = int1.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		
		  System.out.println("\n**************");
		 */  
		  System.out.println(int1);
		  
		  System.out.println("\n**************");

		//for(Map.Entry<String, Integer> map:hmp.entrySet()) {
			
			//Set<String> str1 = new HashSet<String>(hmp.keySet());
			
			Collection<Integer> int11 = hmp.values();
			System.out.println("the values are:"+ int11);
				for(int i:int11)
				{
					//Set<Integer> int1 = new HashSet<Integer>(hmp.values());
					if(hmp.values().equals(hmp.values()))
					{
						System.out.println(hmp.remove(hmp));
					}
		
				}
				
				 
		}}
		

