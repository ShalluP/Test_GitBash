package arrayPrograms; // change any Array list to Array

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("convert");
		str.add("ArrayList");
		str.add("To");
		str.add("Array");
		
		System.out.println("arraylist in the form of string \n ");
		
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n the collection view of arrayList is : "+ str);// collection view o/p
		
		System.out.println("\n the size of ArrayList is : "+ str.size());
		
		String[] str2 = new String[(str.size())]; // array of strings of length same as size of arrayList
									
		String[] array = str.toArray(str2); // converting ArrayList to Array;
		
		System.out.println("\n the o/p in the form of array is : "+ array);
		
		// why not iterator ?? no index
		for(String s : array)
		  { System.out.println(s); 
		  }
		 
		System.out.println("the length of array: "+ array.length);
		
	}

}
