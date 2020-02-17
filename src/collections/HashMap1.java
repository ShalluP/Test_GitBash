package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println("Practising hashMAp");
		hm.put(11, "Shallu");
		hm.put(23, "Saanvi");
		hm.put(33, "Vinit");
		
		
		System.out.println("o/p with entry set: "+hm.entrySet());
		System.out.println("o/p with keySet; "+ hm.keySet());
		System.out.println("o/p with values() is : "+ hm.values());
		System.out.println("the o/p of HashMap using for loop is : ");
				
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		hm.put(24, "Bassi");
		System.out.println(hm);
		

		hm.putIfAbsent(43, "Check");
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet() )
		{
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		System.out.println("\n*****************");
		hm.replace(43, "replace");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println("\n"+ m.getKey() +" " + m.getValue());
		}
		
		System.out.println("the values of hash map hm are :"+ hm.values());
		System.out.println("the keys are: ");
		Iterator<Integer> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());}

}}
