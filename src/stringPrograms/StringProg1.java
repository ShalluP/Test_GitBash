package stringPrograms;

public class StringProg1 {

	public static void main(String[] args) {
	
		String abc= "Implementing charAt method";
		
		char[] chars= abc.toCharArray();
		
		String cde = " "; //String  cde is empty space
		
		System.out.println("char at index 5= "+abc.charAt(5));
		
		System.out.println("Length odf the string abc = "+ abc.length());
		
		System.out.println("char at last index= " + abc.charAt(abc.length()-1));
		
		//Let's see an example where we are accessing all the elements present at odd index.
		int count=0;
		
		for(int i =0; i<=abc.length()-1; i++)
		{
			if(i %2 !=0) // if not divisible by 2; means only odd numbers are left.
			{
				System.out.println("char at index "+ i +" is " + abc.charAt(i));
			}
			
			if (chars[i]!=' ') //to check if the characters are not an empty space.
			{
				cde = cde +chars[i]; //add the chars to the empty string, removing the empty spaces.
			}
			
			 //Let's see an example where we are counting frequency of a character in the string.
			
			if (abc.charAt(i)=='e')
			{
				count++;
			}
		
		}
		System.out.println("the no of e in the string = "+ count);
		System.out.println(cde);
		
		System.out.println("-----------");
				
		for(int j= abc.length()-1; j>=0 ;j--) {
			 
			
			System.out.print(chars[j]);
		}
		
	}

}
