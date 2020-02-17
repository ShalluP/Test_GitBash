package arrayPrograms;

public class AscendingOrderInArray {

	public static void main(String[] args) {
		
		int[] num = {67, 89, 23, 45, 34 , 12};
		
		System.out.println("The elements of the given array are ");
		
		for (int i=0; i<num.length ; i++)
		{
			System.out.println(num[i]);
		}
		
		//int [] asc = {0};
		int temp = 0;
		
		//for (int k =0; k<asc.length ; k++)
		
			for(int i=0 ; i<num.length; i++) 
				
				{
				
				for (int j=1 ; j< num.length ; j++)
				
				{
					
					if (num[i] < num[j])
					{
						temp = num[i];
						
						num[i] = num[j];
						
						temp++ ;
					}
				
				}
					System.out.println("the ascending order array is "+ num[i]);
				}
		System.out.println(temp);
		}
		
		}

