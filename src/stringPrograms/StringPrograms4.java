package stringPrograms;//returns the index of character value or substring

public class StringPrograms4 {

	public static void main(String[] args) {
		String s1= new String("Learning the indexOf method by examples ");
		String str= "";
		String str1="Testing empty strings";
		String str2= "";
		
		int n2= s1.indexOf("e");
		int n3= s1.indexOf("indexOf");
		int n4= s1.indexOf('e', 6);
		int n5= s1.indexOf("method", 3);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		if (s1.length()==0||s1.isEmpty())
			System.out.println("String s1 is empty  "+s1);
		else 
			System.out.println("String s1 is not empty  "+s1);
		
		if(str.length()==0||str.isEmpty()) {
			System.out.println("String str is empty"+str);
		}
		else {
			System.out.println("String str is not empty");
			
			
		}
		System.out.println(str2.isEmpty());
		System.out.println(str1.isEmpty());
	}

}
