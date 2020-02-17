package collections;
import java.util.HashSet;
import java.util.Iterator; // unique elements and insertion order is not maintained

public class HashSet1 { 

	public static void main(String[] args) {

		HashSet<String> str = new HashSet();
		str.add("one");
		str.add("two");
		str.add("three");
		str.add("one");
		str.add("four");
		str.add("alpha");
		System.out.println("\n the output of hashset is : "+ str);
		/*
		 * Iterator<String> itr = str.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		
		str.remove("two");
		System.out.println("\n"+str);
		
		HashSet<String> str1 = new HashSet<String>();
		str1.add("come");
		str1.add("lets ");
		str1.add("make new hash set");
		
		str.addAll(str1);
		
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		System.out.println("The size is : "+ str1.size());	
		
		
		}
	
	}


