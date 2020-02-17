package arrayPrograms;

public class GreatestNoInArray {

	public static void main(String[] args) {
		
		int[] num = {-1,20,45,35,46,37,89,75};
		// how will sort the array
		System.out.println("the given array element is= ");	
		
		for (int i=0; i< num.length ;i++) 
		{
			System.out.println(num[i]);
						
		}
		
		int largest = num[0]; //initialize highest value as array's first value
		
		for(int i = 1; i< num.length; i++) //iterating the array from index=1
			
		{	
			if(num[i]> largest) 
				
				{
					largest = num[i];
				}

		}
		
		System.out.println("the largest number from the array is ="+ largest);
		
		}
	}

