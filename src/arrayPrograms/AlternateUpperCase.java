package arrayPrograms; // intel to InTeL or ram to RaM

public class AlternateUpperCase {

	public static void main(String[] args) {
		
		//String s = "intel";
		
		String s= "ram";
		System.out.println("the string is : "+ s);
		
		for (int i=0; i<= s.length()-1; i++)
			
		{char ch = s.charAt(i); // ch has characters of string s with different index values
		
		if(i% 2 ==0 ) 
			// for every even number index convert into upper case
			{System.out.print(Character.toUpperCase(ch));}
		
		else // for every odd number index convert to lower case
			{
				System.out.print(Character.toLowerCase(ch));
			}
		}
		}

}
