package stringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class CountCharactersUsingMapAndIterator {

	public static void main(String[] args) {

		
		  String str = "blackbeans"; // taking a string 
		  char[] ch =
		  str.toCharArray();// converting the string into array of characters
		
			
		  System.out.println("the count of repeated character is :");
		  
		  HashMap<Character, Integer> hmp = new HashMap<Character, Integer>(); 
		  //Instantiating a HashMap class
		  // from Interface map. with character as key and its occurances as value 
		  for (char c: ch) // character class traversing'ch'character array //c = a , b, c, d,e,b,c,f,e 
			 
		  { 
			  if(hmp.containsKey(c))
		  {
				  
		  hmp.put(c, hmp.get(c)+1); 
		  }
		  else 
		  { 
			  hmp.put(c, 1);
		  } 
		  }
		  System.out.println(hmp); // Iterator<String> iterator=valueSet.iterator();
		  
	//	  Set<Character> map = hmp.keySet(); // unique elements but random output
		  
		  System.out.println("\n*******************");
		 // System.out.println(map);
		  
		  Iterator<Map.Entry<Character,Integer>> itr = hmp.entrySet().iterator();
		  // the itr will point to the index just before the first element of hmp
		  
		  while (itr.hasNext()) // checking for the availability of next element , then iterate
		  {
			  Map.Entry<Character, Integer> entry = itr.next(); // moving cursor to the next element
			  System.out.println(entry.getKey()+ "= " + entry.getValue());
		  }
		  System.out.println("\n*******************");
		  
		  ArrayList<Character> al1 = new ArrayList<Character>(hmp.keySet());
		//  Set<Integer> set = new TreeSet<Integer>(hmp.values());
		  
		//  Set<Character> set1 = new LinkedHashSet<Character>(hmp.keySet()); 
		  // o/p of keys,characters in this example in random order
		   Iterator<Character> itr1 = al1.iterator();
		   
		   while(itr1.hasNext())
			   {
			   
			   System.out.print(itr1.next()+" ");
		   }
		 
		   System.out.println("\n*******************");
		  LinkedList<Integer> al2 = new LinkedList<Integer>(hmp.values());
		//   Set<Integer> set2 = new HashSet<Integer>(hmp.values());
		   Iterator<Integer> itr11 = al2.iterator();
		   
		   while(itr11.hasNext())
			   {
			   
			   System.out.print(itr11.next()+" ");
		   }
		  		   
       }

}
