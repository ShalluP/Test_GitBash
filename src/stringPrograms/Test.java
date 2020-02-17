package stringPrograms;

public class Test {

	public static void main(String[] args) {
String str11 = "big black bug bit a big black dog on his big black nose  ";
		
		System.out.println("the given string is: "+ str11);
		
		String str1 = str11.toLowerCase();
		
		System.out.println("the given string in split form is : ");

				String[] str = str1.split(" "); // split the string into words
		
		  for (String s1:str) // traversing a string this kind of for loop is also used
		  
		  {System.out.println(s1);}
		 
		  System.out.println("the repetitive words in the string are:");
		/*
		 * for (int i =0; i< str.length; i++) { System.out.println(str[i]); }
		 */
		  int count = 0; // by placing the int count out of for loop, it works fine for both the conditions
		  for (int i =0; i< str.length; i++)
		        { 
			 // int count = 0 ; //with count =0..displays only the words which are being repeated
			 //int count = 1; // with count = 1..displays the whole sentence omitting the duplicate words 
				for (int j = i+1; j< str.length; j++)
				{
					if
					( str[i].equals(str[j]))
						
					{
						//count++; // it is same as count = count +1;
						System.out.println(str[i]);//str[j]="0";
						
					}
					
				}
			/*
			 * if (count>0 && str[i]!="0") { System.out.println(str[i]); }
			 */
	}

}}
