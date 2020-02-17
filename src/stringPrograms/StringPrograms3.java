package stringPrograms;//stringPrograms: This method returns a byte array that again can be passed to String constructor to get String.

public class StringPrograms3 {

	public static void main(String[] args) {

		String abc = "Jamaican fever";
		
		byte[] barr = abc.getBytes();
		
		for (int i=0;i<=barr.length; i++)
		{
			System.out.println(barr[i]);
		}
		
		String str = new String(barr);
		
		System.out.println(str);
		
		// Getchar
		String cde= new String("Java Get Char method");
		char[] ch = cde.getChars(0, 10, ch[7], 0);
		System.out.println(ch);
	}

}
