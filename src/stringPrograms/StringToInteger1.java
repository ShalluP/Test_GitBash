package stringPrograms;
//// string abc = "abcdefgh 1234"; // print string //  spilt this string //print it
// u will get some string convert that string to integer
public class StringToInteger1 {

	public static void main(String[] args) {
		
    String abc = "abcdefgh 1234";
 
    System.out.println(abc);
    
    System.out.println("length of string abc ="+abc.length()); // why () after length here?? 
    						        //abc is a string,class so length is a method
    
    String[] cde = abc.split(" "); //splitting the string into 2 words;at index 0=abcdefgh, at index 1= 1234
     
    System.out.println("length of string cde = "+cde.length); // cde is set of 2 words
    								// not a string(class) so length not a method here.
      	
   String str = cde[1];
   
   System.out.println(cde[1]);
    
   int i= Integer.valueOf(str);
    
  //int i= Integer.valueOf(cde.length);
  
   System.out.println("integer value of i = "+str);
		
	  }
    }


