package stringPrograms; //compare strings: it returns positive,negative or zero after comparing 2 strings

public class StringProgram2 {

	public static void main(String[] args) {
		String abc= "I am learning Java";
		String s1= "Hello";
		String s2 = "Mello";
		String s3="";
		String s4= "HeLLo";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		System.out.println(s4.compareToIgnoreCase(s1));
				
		//Let's see an example where we are concatenating spaces and special chars to the string object.
		String s5= s1.concat(s4).concat("&&&").concat(s3).concat(s2).concat("@");
		System.out.println(s5);
		boolean s6= s4.contains(s3);
		System.out.println(s6);
		System.out.println(s2.contains(s4));
		
		if(abc.endsWith("java")) {//case sensitive
			System.out.println("the string ends with java");
		} else
		System.out.println("the strimng does not end with java");
		if(abc.endsWith("am")) 
	{System.out.println("successfull");}
	else {System.out.println("unsuccessfull");}
		
		System.out.println(s1.equals(s3));
			System.out.println(s1.equalsIgnoreCase(s4));
		}
		
		
	}


