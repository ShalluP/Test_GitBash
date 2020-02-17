package stringPrograms;

public class DuplicateChars2 {

	public static void main(String[] args) {

		String str = "abcdefgacbd";
		char[] ch = str.toCharArray();
		
		System.out.println("the given string is : "+ str);
		System.out.println("length of the string is : "+ str.length());
		
		// comparing the 2 strings using 2 for loops
		// outer loop should start from index 0, whereas the inner loop should start from i+1; because 
		//for j=0, at very first instance the value at index 0 for i and j will be same, so that makes
		//a wrong comparison.. also for j=1..the first iteration will be good for i=0, but for next, at i
		//= 1, j is also = 1.. which again leads to comparing 2 nos at same index.. wrong comparison
		// so j always has to be at a position ahead of i.. leading it to be j = i+1
		
		
		
		for (int i =0; i< str.length(); i++)
		{
			for (int j = i+1; j< str.length(); j++)
			{
				if( ch[i]==ch[j])
				{
					System.out.print(ch[j]);
					break;
				}
				
			}
		}
		
	
	
	}

}
