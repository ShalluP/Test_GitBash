package collections; //// abc- 1 , cde - 2  , fgh- 3  , ijk - 4 , , jkl -2 ,ghi -3

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// find duplicate values 
// find the highest value in map 

// key cann't contains duplicates and values conatins duplicates


public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmp = new HashMap< String, Integer>();
		
		hmp.put("abc", 1);
		hmp.put("cde", 2);
		hmp.put("fgh", 3);
		hmp.put("ijk", 4);
		hmp.put("lmn", 2);
		hmp.put("ghi", 3);
		
		System.out.println("the hash map collection is as: ");// no duplicate keys are allowed in HashMap
		for(Map.Entry map: hmp.entrySet())
		{
			System.out.println(map.getKey()+" "+ map.getValue());
			
		}
		System.out.println("\n the output at key cde is: ");
		System.out.println(hmp.get("cde"));
		
		System.out.println("the keys are:");
		for(Map.Entry map: hmp.entrySet())
		{
			System.out.println(map.getKey());
			
		}
		System.out.println("the keys from the map collection are: ");
		System.out.println(hmp.keySet());
		
		
		System.out.println("the values from the map collection are: ");
		System.out.println(hmp.values());
		
		// to find duplicate values
		
		Set<Integer> set1 = new HashSet<Integer>(hmp.values());
		System.out.println("the values from the set collection are: ");

		System.out.println(set1);
		 Set<String> set = new HashSet<String>(); set.addAll(hmp);
		  System.out.println(set);
		 
	}

	
	}


