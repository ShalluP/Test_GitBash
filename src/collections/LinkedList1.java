package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> abc = new LinkedList<String>();
		
		abc.add("Family");
		abc.add("members");
		abc.add("are");
		abc.add("as");
		abc.add("follows");
		
		Iterator<String> itr = abc.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("\n"+abc.get(2));
		abc.add(4, "new addition");
		System.out.println("after new addition  ;"+ abc);
		abc.addFirst("First added");
		System.out.println(abc);
		System.out.println("\n aaaaaaaaaaaat last index the string is :"+abc.getLast()); 

}}
