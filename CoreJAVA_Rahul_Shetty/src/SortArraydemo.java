
public class SortArraydemo {

	public static void main(String[] args) {

			// Sort array in ascending order- Bubble Sort

		int a[] = {2,6,1,4,9,3};
		
		for(int i=0; i<6; i++)
		{
			for(int j=i+1; j<6; j++)
			{
				if(a[i]>a[j])
				{
					//Swap
					int temp;
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}


		for(int i=0; i<6; i++)
		{
			
				System.out.println(a[i]);
			
		}
	}

}
