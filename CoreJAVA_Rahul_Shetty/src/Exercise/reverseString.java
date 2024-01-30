package Exercise;

public class reverseString {

	public static void main(String[] args) {

       String name = "madam";
       String a ="";
      
       for(int i= name.length()-1; i>=0; i--)
    	   
       {
    	   
    	   a = a+name.charAt(i);
       }
       
       System.out.println(a);
       
       if(name==a)
       {
    	   System.out.println("It is palindrome");
       }
       else
       {
    	   System.out.println("It is not a palindrome");
       }
	}

}
