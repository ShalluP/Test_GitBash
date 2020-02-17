package collections;
 import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {

ArrayList<String> abc= new ArrayList<String>();	// creating a generic arraylist.

System.out.println("Initial list of elements is as: ");
		abc.add("Sharan");
		abc.add("Varun");
		abc.add("Karan");
		abc.add("Taran");
		
		System.out.println(" \n The array list is as: "+ abc);
		
		abc.add(2, "Vasudev");
		
		System.out.println(" \n Adding the element at a specific index : \n"+ abc);
		
		if(abc.contains("Jaman"))
			{
			System.out.println("Yes");
			}
		else
			System.out.println("\n No it does not contain Jaman");
		
		ArrayList<String> cde = new ArrayList<String>();
		
		cde.addAll(abc);
		
		cde.add("jabra");
		cde.add("Tabra");
		cde.add("Kabra");
		
		System.out.println("\n the second list cde is as: "+ cde);
		
		ArrayList<String> fgh = new ArrayList<String>();
		
		fgh.add("Daman");
		fgh.add("Naman");
		
		System.out.println(" \n The third array list fgh is  as : "+ fgh);
		
		abc.addAll(fgh);
		
		System.out.println("\n After taking fgh in abc: "+ abc);
		
		abc.remove(3); // element at index 3 is removed.
		
		System.out.println("\n" +abc);
		
		abc.removeAll(fgh);
		
		System.out.println(" \n after removing fgh is : "+ abc);
		
		System.out.println("\n"+fgh);
		
		abc.retainAll(fgh); // NOT WORKING
		
		System.out.println("\n" + abc);
		
		/*
		 * Iterator<String> itr = abc.iterator(); //getting iterator
		 * while(itr.hasNext()) // traversing elements of list abc for the elemnts {
		 * 
		 * System.out.println("after retaining and iterator loop: " + itr.next());
		 * 
		 * }
		 */
		//for(String obj:abc)
			
			//System.out.println("\n after reatining and iterator loop:"+ obj);
		System.out.println("\n after reatining and iterator loop:"+ abc);
	
	//abc.isEmpty();
	System.out.println("\n I array empty: "+ abc.isEmpty());
	
	System.out.println("\n the output of cde before set at index 2 is : "+ cde.get(2));
	
	cde.set(2, " I am added by set");
	
	System.out.println(" \n the o/p of cde at index 2 after set command is : " + cde);
	
	}
		
		
	}


