package OOPS;

public class ClassAustraliaTraffic implements Interface_CentralTraffic, Interface_ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To execute need class object implementing Interface
		
		Interface_CentralTraffic a = new ClassAustraliaTraffic();
		
		a.GreenGo();
		a.RedStop();
		a.YellowWait();
		
		ClassAustraliaTraffic b = new ClassAustraliaTraffic();
		b.WalkonSymbol();
		
		
		Interface_ContinentTraffic c = new ClassAustraliaTraffic();
		c.TrainSymbol();

	}

	@Override
	public void GreenGo() {
		System.out.println("Green Go Implementation");
	}

	@Override
	public void RedStop() {
		System.out.println("Red stop Implementation");		
	}

	@Override
	public void YellowWait() {
		System.out.println("Yellow wait Implementation");		
	}
	
	public void WalkonSymbol()
	{
		System.out.println("Walking Implementation");		

	}

	@Override
	public void TrainSymbol() {
		
		System.out.println("Train Symbol Implementation");	
	}

}
