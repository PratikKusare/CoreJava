
public class StringClassDemo {

	public static void main(String[] args) {


		//String : It is a pre build class in JAVA
		
//		String a = "hello";					// String Literal
//		 
//		String b = new String("hello");     // by creating object
		
		String a= " javatraining";//string 

		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("rahul teaches"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));


	}

}
