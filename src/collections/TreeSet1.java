package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
 
	public static void main (String[] args) {
	TreeSet<Integer> int1 = new TreeSet<Integer>();
	int1.add(1);
	int1.add(2);
	int1.add(3);
	int1.add(3);
	int1.add(4);
	 System.out.println("\n descending output");
	Iterator<Integer> a = int1.descendingIterator();
	while(a.hasNext())
		{
		System.out.println(a.next());
		}
	System.out.println("\n the output in the form of collection"+ int1);
	
	TreeSet<String> abc = new  TreeSet<String>();
	abc.add("beta");
	abc.add("alpha");
	abc.add("gama");
	abc.add("check");
	
	Iterator<String> itr = abc.iterator();
	while(itr.hasNext())
		{
			System.out.println("\n"+itr.next());
		}

	if(abc.contains("gama"))
		System.out.println("\n yes contains");
	System.out.println("\n"+abc.equals(int1));
	System.out.println("\n returns the first element of the sorted set, which is : "+ abc.first() );
	System.out.println("returns the size: "+ abc.size());
	
	}
	}
