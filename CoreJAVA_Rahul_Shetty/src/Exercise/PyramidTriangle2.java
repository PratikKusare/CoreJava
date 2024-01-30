package Exercise;

public class PyramidTriangle2 {

	 // 1
	// 1 2
	// 1 2 3
	// 1 2 3 4

public static void main(String[] args)

{

	
	for(int i=0; i<4; i++)
	{
		
		for(int j=1; j<=i+1; j++)
			{
				System.out.print(j + "\t");
				
				
			}
			System.out.println();
		}
	}
}