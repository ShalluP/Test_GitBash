//How do you reverse each character in a string?


package jvmjava;

public class CharacterReverse {
	
	public static void main(String[] args) {
		 String abc= "Kamla";
		
		char[] strArray= abc.toCharArray();
		
		System.out.println(strArray);
		for (int i=strArray.length-1 ; i>=0 ;i--) 
		{
			//System.out.println(strArray[i]);
			System.out.print (strArray[i]);

		}
		
		//for (int i = strArray.length - 1; i >= 0; i--)
		{
		System.out.println("  Method to reverse the character in a string");
	}

	}}
