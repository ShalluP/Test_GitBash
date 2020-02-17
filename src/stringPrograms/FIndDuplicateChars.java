package stringPrograms;// the character repated how many times?

public class FIndDuplicateChars {

	public static void main(String[] args) {
		
 //String str = "learning String and Its methods";
 String str ="basic java ";
 System.out.println("the string given is:"+ str);
 System.out.println("length of string is= "+str.length());
 
 char[] chars = str.toCharArray();
 
 //System.out.println("length of array is = "chars.length());
 
// System.out.println(chars);
System.out.println("duplicate characters are:");
 int count =0;
 for(int i=0; i<chars.length; i++) 
 {
	 for(int j=i+1; j<chars.length; j++) 
		
		
	 {
		 if(chars[i]==chars[j])
		 {
			System.out.print(chars[j]);
			count++;
			break;
			
		 }
		
	 }
	
 }
	//	System.out.println("Number of times comparison done ="+count);
		
		
	}
}
