package OOPS.Abstract;

public class ChildEmirates extends ParentAirline {

	public static void main(String[] args) {
		ChildEmirates c = new ChildEmirates();
		c.color();
		c.engine();
		c.safety();
		
	}

	@Override
	public void color() {
		System.out.println("White color");		
	}

}
