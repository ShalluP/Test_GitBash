package jvmjava;

/**
 * @author Shallu
 *
 */
public class Duplicates {

	public static void main(String[] args) {
		
		String[] abc = { "cde " , "efgh" ,"abc" , "cde" , "ghi", "efgh" };
		
		for(int i = 0 ; i < abc.length ; i++) { // iteration will start with o
			
			for(int j = 1 ; j < abc.length ; j++) { // iteration will start with 1
				
				if (abc[i] == abc[j]) { // comparin two different idnexes
					
					System.out.println(abc[i]);
				}
			}
	}

	}}
