package OOPS.Inheritance;

public class ChildVehicle extends ParentClass {
	
	public void engine()
	{
		System.out.println("New modified engine");
	
	}
	
	public void colour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		ChildVehicle cv = new ChildVehicle();
		cv.colour();
		cv.engine();
		cv.breaks();
		cv.gear();
	}

}
