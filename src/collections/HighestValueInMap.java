package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HighestValueInMap {

	public static void main(String[] args) {
		
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
//highest value in the map collection
		
		Set<Integer> set = new TreeSet<Integer>(hmp.values());
		
		System.out.println("\n the o/p in terms of a treeset is as: "+ set);
		 
		 Iterator itr=set.iterator();  
         while(itr.hasNext())  
         {  
             System.out.println(itr.next());  
         }  
	 		//converting to List
		  List<Integer> list = new ArrayList<Integer>(set); // contains index
		  
		  System.out.println("\n the o/p in the form of list :"+ list); 
		  
		 System.out.println(list.lastIndexOf(set)); 
		 
		 
		/*
		 * for (int i =0; i<=list.size(); i++) { for (int j=1; j<= list.size(); j++) {
		 * if (list.i list[j]) } }
		 */
		 
		
		
	}

}
