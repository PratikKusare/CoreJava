package Exercise;

public class MinNumberAndMaxInColum {

	public static void main(String[] args) {
		// 2 4 5 
		// 3 4 7 
		// 1 2 7
	
		
		int A[][] = {{2,4,5}, {3,4,7}, {1,2,7}};
		int min=A[0][0];                // Assume first number is min
		int mincolumn=0;
		
		
		for(int i=0; i<=2; i++)
		{
		
		for(int j=0; j<=2; j++)
		{
			
		if(A[i][j]<min)                 //Compare with every number
		{
			min = A[i][j];	       // If less then assigning new min number
			 mincolumn=j;			// Min column number
		}
		}
	
	
		}
		
			
		int k=0;
		int max=A[0][mincolumn];        // Assume first number is max 
		while(k<3)    				//Traverse in that column only
		{
			if(A[k][mincolumn]>max)
			{
				max=A[k][mincolumn];
				
			}
			k++;
			
		}
		System.out.println(max);
		
		
		
	

	

	}

}
