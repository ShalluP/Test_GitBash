package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();// creating an ArrayList
		
		System.out.println("entering the arraylist elements using add method");
		str.add("There are");
		str.add("duplicates");
		str.add("ArrayList");
		str.add("Trying");
		str.add("to");
		str.add("remove");
		str.add("duplicates");
		str.add("from the");
		str.add("ArrayList");
		str.add("in ");
		str.add("Java");
		
		System.out.println("\n the arraylist enetered as: "+ str);
		System.out.println("\n the size of arraylist is : "+ str.size());
		
		System.out.println("\n convert arraylist into set\r\n");
		
		// convert arraylist into set
		
		/*
		 * for(String temp: str) // traversing the List str with String variable temp {
		 * System.out.println(temp); // printing temp }
		 */
		System.out.println("\n o/p after converting into set and  hashing:");
		
		Set<String> set = new HashSet<String>(str); // set hashSet of list str
		//System.out.println(set);
		
		  Iterator<String> itr = set.iterator();
		  
		  while(itr.hasNext() ) { System.out.println(itr.next()); }
		 
		System.out.println("\n the size of hash set is : "+ set.size());
		
		List list = new ArrayList(set);
		
		System.out.println("conerting back set into array list"+list);
		
		
}}
