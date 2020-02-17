package stringPrograms;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str = "hello there I am learning java";
		//convert string to array
		char[] chars = str.toCharArray();
		
		System.out.println(chars);
		
		String str1 =""; // creating a string = empty space
		
			for (int i=0; i<chars.length; i++) // index i goes from 0 to
											//the length of the string
			{
				if(chars[i]!=' ')//if the char at particular index is not equal to an empty space
					// then add it to str1
					
				{ str1= str1+chars[i];
					
				}
				
			}
		
		System.out.println(str1);
		
		//method 2
		System.out.println("\n------------------");
		String str2= " ";
		for (int i=0;i<chars.length;i++)
		{ 
			if(chars[i]!=' ') 
			{
			str2 = str2 + str.charAt(i);
		}
		

	} System.out.println(str2);
		

}}
