
public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//int a [][] = new int[3][3];
	
		//problem 1 - print the minimum number from the array
		int a[][]= {{9,4,2},{3,0,2},{3,5,6}};

		
//		//System.out.println(a[1][0]);
//		for(int i = 0 ; i <3;i++) {
//			for(int j =0 ; j <3;j++)
//			{
//				System.out.println(a[i][j]);
//			}
//		}
		
		  // Initialize minValue with first element of array.
        int minValue = 0;
        int minimumcol =0;;
       
        
    	for(int i = 0 ; i <3;i++) {
			for(int j =0 ; j <3;j++)
			{
				 if (a[i][j] < minValue)
					 
		                minValue = a[i][j];
				         minimumcol=j;
				  
			}
			
		}
    	int k =0;
    	 int max=a[0][minimumcol];
    	while(k<3)
    	{
    		 if (a[k][minimumcol] > max)
				 
    			 max = a[k][minimumcol];
			     k++;   
    	}
    	 System.out.println(
		            "Largest element present in given array: "
		            + max);
		
	
		
		
		
		//print minimum number from the array and where u find that array in whichever 
		//row  print the largest number in that column
		
		
		
		
		
		
		
		
		
		

	}

}
