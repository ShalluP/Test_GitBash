package jvmjava;

public class StringToInteger {

	public static void main(String[] args) {
		
		String str= "2015";
		
		//int i= Integer.parseInt(str);
		int i = Integer.valueOf(str) ;
		System.out.println(i);
	}
	
}
