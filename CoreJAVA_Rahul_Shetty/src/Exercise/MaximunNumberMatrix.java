package Exercise;

public class MaximunNumberMatrix {

	public static void main(String[] args) {
		        // 2 4 5 
				// 3 4 15 
				// 1 2 10
				
				
				
				int A[][] = {{2,4,5}, {3,4,15}, {1,2,10}};
				int max=A[0][0];                // Assume first number is max
				
				for(int i=0; i<=2; i++)
				{
				
				for(int j=0; j<=2; j++)
				{
					
				if(A[i][j]>max)                 //Compare with every number
				{
					max = A[i][j];		}        // If less then assigning new min number
				}
			
			
				}
				
				System.out.println(max);

			

	}

}
