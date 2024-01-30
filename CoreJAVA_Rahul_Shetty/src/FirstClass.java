
public class FirstClass {
	
	static int a = 4;
	
	//Methods
	
	public void getData() {
		
		System.out.println("I am in a method");
		//return "hello";
	}
	
	//Objects are instances/reference of class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstClass fn = new FirstClass();
		SecondClass sn = new SecondClass();
		
	    sn.setData();
		fn.getData();
		
		System.out.println("hi");
		System.out.println("Hello World");
		
		System.out.println(a);
		
	}

}
