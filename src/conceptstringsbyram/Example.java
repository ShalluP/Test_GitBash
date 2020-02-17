package conceptstringsbyram;

public class Example {

	public static void main(String[] args) {
		
	String abc = "1234";
	
	String ghi = "ram raju";
	
	String ckl = "ramrRaju";
	
	
	StringBuffer akl = new StringBuffer(ghi);
	
	StringBuilder asd = new StringBuilder();
	
	akl.reverse();
System.out.println(akl);
	
	if(ghi == ckl) {
		System.out.println("both are same");
	}else {
		System.out.println("both are not same");
	}
	
	//**** difff b/w compareto & contains ****
	
//	boolean efg = ghi.contains(abc);
//	System.out.println("output efg : " + efg);
//	
//	int mno = ghi.compareTo(abc);
//	System.out.println("output mno : "+ mno);
//	
//	int ajk = ckl.compareTo(ghi);
//	System.out.println("output ajk : " + ajk);
//	******** ----------------------- *********
	// heap memory
	String s1 = "hello";
	
	// == / equals
	
	// what is the difference b/w mutable and immutable 
	
	
	}

}
