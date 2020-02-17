package jvmjava;

public class Oneforloop {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 5 ;
		
		for (int i = 0; i <= a; i++) {
			
			if (i == b) {
				break;
			}
			
			System.out.println(i);
		}
		// System.out.println(a);
	}

}
