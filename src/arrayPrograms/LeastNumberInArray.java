package arrayPrograms;

public class LeastNumberInArray {

	public static void main(String[] args) {
		
		int[] num = {20,93,78,34,11,45};
		
		System.out.println("The given array elements are");
		for (int i= 0; i< num.length; i++)
		{
			System.out.println( num[i]);
		}
		int least = num[0];
		
		for(int i=1; i< num.length ; i++)
		{
			if(num[i] < least)
			{
				least = num[i];
			}
		}
		
		System.out.println("the smallest number inthe array is = " + least);
		
	}

}
