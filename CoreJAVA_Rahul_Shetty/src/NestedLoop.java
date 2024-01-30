
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested Loop Work-
		
		
		for(int i=1; i<=4; i++)   // Outer for loop-This block will loop for 4 times
		{
			System.out.println("Outer loop started");
			
			for(int j=1; j<=4; j++)  //inner loop
			{
				System.out.println("inner loop");
			}
			
			System.out.println("Outer loop finished");
		}

	}

}
