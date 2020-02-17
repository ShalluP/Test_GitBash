package stringPrograms;
// string abc = " abcdefghijkl ";  instead of above string i would like to print mnopqrstuvwxyz

public class Replace {

	public static void main(String[] args) {
		String abc= "abcdefghijkl";
		
		System.out.println(abc);
		String cde= "mnopqrstuvwxtz";
		
		String fgh = abc.replaceAll(abc, cde);
		
		System.out.println(fgh);
		
	}

}
