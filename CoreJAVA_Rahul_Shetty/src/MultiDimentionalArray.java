
public class MultiDimentionalArray {

	public static void main(String[] args) {


		int a[][] = new int [2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=7;
		a[1][1]=9;
		a[1][2]=1;
		
		//System.out.println(a[0][0]);
		
		int b[][] = {{2,4,6}, {7,9,1}};
		
		for(int i=0; i<=1; i++)
			{
			
			for(int j=0; j<=2; j++)
			{
				System.out.print(a[i][j] + "\t");
			
			}
		
		System.out.println("");
			}
	}

}
