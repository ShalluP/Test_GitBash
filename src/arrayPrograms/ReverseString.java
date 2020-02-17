package arrayPrograms;
//string s = vivek
//string s2 = kvive
//check both strings are having same length or not if having same length 
//then check count of each character in s1 is equal to 
//count of each character in s2 or not
public class ReverseString {

	public static void main(String[] args) {
		int count = 0;
		int count1= 0;
		
		String s = "vivek";
		System.out.println("the given string is : "+ s);
		System.out.println("length of string s : "+s.length());
		
		char[] ch = s.toCharArray(); // converting string to char array
		
		System.out.println("\n reversing the array : ");
		for(int i = ch.length-1 ; i>=0 ; i--)
			
			System.out.print(ch[i]); 	// reversing the array
		
		System.out.println("\n length of character array : "+ch.length);
		
		String s1 = ch.toString(); // making string from char array
		
		System.out.println("\n the string o/p of char array : "+s1);
		//for (int i=0; i<= s1.length(); i++)
		for (int i=0; i<= ch.length; i++)
		{
			count1++;
		}
		System.out.println("the count of characters in s1: "+ count1);
		
		for (int j = 0; j<= s.length(); j++)
		{
			count++;
		}
		System.out.println("the number of chars in string s: "+ count);

		if (count == count1)
		{
			
			System.out.println("\n the count of chars is same");
			
		}
		else
			System.out.println("the count is different");
	}

}
