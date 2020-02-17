package collections;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(77, "Great");
		
		lhm.put(44, "learning");
		
		lhm.put(99, "Linked HashMap");
		
		System.out.println(lhm);
		
		System.out.println("\n"+ lhm.entrySet());
		
		System.out.println("\n keys: "+ lhm.keySet());
		
		System.out.println("\n Values: "+ lhm.values());
		
		
	}

}
