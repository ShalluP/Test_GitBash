package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
	
	ArrayList<String> str = new ArrayList<String>();
	
	str.add("program");
	str.add("to ");
	str.add("reverse");
	str.add("ArrayList");
	
	System.out.println("the arraylist is as follows: "+str);
	
	System.out.println("\n o/p using for iterator is : ");
		// using iertator interface
	
		  Iterator<String> itr = str.iterator(); while(itr.hasNext()) {
		  System.out.println(itr.next()); }
		 
	System.out.println("\n the size of ArrayList is: "+ str.size());
		  
		  
	System.out.println("\n******************");	  
	
	System.out.println("\n reversed array list is : ");
	
		
		  Object[] ab = str.toArray();
		  
		  for (int i=ab.length-1; i>=0 ; i--) 
		  
		  	{ System.out.println(ab[i]); }
		  
		  System.out.println("\n length of array ab is: "+ ab.length);
		  
		List<String> str1 = new ArrayList<String>();
		
		str1= Arrays.asList();
		
		System.out.println("converting array to arrayList"+ str1);
		
		}
	}	
	

