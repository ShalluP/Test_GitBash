package stringPrograms;
//use delimeter to format the string as to show date and time.

public class StringPrograms5 {

	public static void main(String[] args) {
		String str= "The last index of example";
		
		String strJoin= String.join("/", "31","01","1982");
		
		System.out.println(strJoin);
		
		String strJoinTime= String.join(":", "8","15","am");
		
		
		System.out.println(" "+ strJoinTime);
		
		System.out.println(strJoin.concat(strJoinTime));
		
		System.out.println(str.lastIndexOf('s'));
		System.out.println(str.lastIndexOf("example"));
		System.out.println(str.lastIndexOf('f', 20));
		System.out.println(str.lastIndexOf("index", 10));
		
	}

}
