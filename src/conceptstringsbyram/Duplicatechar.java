package conceptstringsbyram;

public class Duplicatechar {

	// How many times ba is repeated in the given string
	public static void main(String[] args) {
		
		String abc = "ball bat kban bazar";
		
		System.out.println("length of the string abc = " + abc.length());
		
		// tell many repeated ba in this string
		
		int count = 0; // intializing to count the repeated characters it will followed by count++
		
		String[] cde = abc.split(" "); // spilt string
		
		System.out.println(cde);
		
		System.out.println("length of cde = " + cde.length);
		
		for (int i = 0; i < cde.length; i++) {
			
			if(cde[i].startsWith("ba")) {
				
				count++;
			}
		}System.out.println("Total no of ba  = " + count );
	}

}
