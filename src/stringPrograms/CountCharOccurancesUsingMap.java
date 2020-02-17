package stringPrograms;

import java.util.HashMap;

public class CountCharOccurancesUsingMap {

	public static void main(String[] args) {
				
		String str ="BlackBeans"; // declaring a string
		
		char[] strArray = str.toCharArray();
				
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		// Creating a HashMap, using key as characters and its occurrences as values; key has to be unique
		// and value can be more than once.
		
		for (char c :strArray) //char 'c' traversing the char[]; b l a c k b e a n s
		{
			if(map.containsKey(c)) //
			{
				map.put(c, map.get(c)+1);
			}
			
			else 
			{
				map.put(c, 1);
			}
		}
		for (int i =0; i< strArray.length; i++)
		{
		  System.out.print(strArray[i] );}
		 System.out.println(":"+map); 
		  
		  //map displays as key = value 

		

	}

}
