package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsStringUsingMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "Shallu");
		hm1.put(2, "Vinit");
		hm1.put(3, "Shallu");
		hm1.put(4, "Saanvi");
		hm1.put(5, "Vinit");
		System.out.println("The Map o/p is : "+hm1);
		
		Set<String> str1= new HashSet<String>(hm1.values());
		System.out.println("the hashset o/p is :"+ str1);
	}

}
