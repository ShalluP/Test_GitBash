package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ReverseArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> int1 = new ArrayList<Integer>();
		
		int1.add(11);
		int1.add(51);
		int1.add(31);
		int1.add(45);
		
		System.out.println("\n the o/p before reversing is: "+ int1);
		
		Collections.reverse(int1);
		
		printElements(int1);
		
		// convert arrayList to array of int
		
		Set<Integer> int2 = new TreeSet<Integer>(int1);
		
		/*
		 * Iterator<Integer> itr = int2.iterator();
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * System.out.println(itr.next()); }
		 */
		System.out.println("the o/p in tree set is : "+ int2);
	}

	private static void printElements(ArrayList<Integer> int1) {
		// TODO Auto-generated method stub
		
	}

}
