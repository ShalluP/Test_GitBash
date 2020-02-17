package conceptstringsbyram;

public class Repeatedchar {

	public static void main(String[] args) {
	
		String abc = "raha ram mohan ray "	;	// print repeated char which are more than 3 times repated
		
		char[] cde = abc.toCharArray(); // changing string to char array
		
		int duplicate = 0 ;
		
		for (int i = 0 ; i < cde.length; i++) { // creating to for loops to iterate one value with other value 
			
			for (int j = 1 ; j < cde.length; j++) {
				
				if(cde[i] == cde[j]) {
					
					duplicate++;
				}
				
			}if(duplicate > 3) { // creating method for duplicate 
				System.out.println("if the char is repeated more than 3 times = " + cde[i]);
				break;
			}
			
		}
		
		

	}

}

// string abc  =  "abc  def ghi jkl  mno"; // remove spaces in above string // upper case // lower case

// String abc = " abc cde efg ghi"; // instead of abc - xyz

// String abc = "12345"; // convert this string to integer

// string abc = "abcdefgh 1234"; // print string //  spilt this string // u will get some string convert that string to integer



// string abc = " abcdefghijkl ";  instead of above string i would like to print mnopqrstuvwxyz