package stringPrograms;

public class StringSplit {

	public static void main(String[] args) {
		
		String str= "I am learning Java";
		
		String[] split= str.split("\\s");
		
		System.out.println("Returning words are");
		
		System.out.println(split.length);
		
		for (String w:split) {
			
			
			System.out.println( w);
		}
		
		System.out.println("returning words are");
		String[] w= str.split("a", 0);
		
		for ( String x:w )
				{
			
			System.out.println(x);	
			
					}
		
		System.out.println(str.startsWith("I"));
		System.out.println(str.startsWith("am", 1));
		System.out.println(str.startsWith("am", 2));

		System.out.println(w.length);
		System.out.println(split.length);	
			
		
	}

}
