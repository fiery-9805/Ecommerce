
public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashingYellow();
		a.greenGo();
		

	}


	@Override
	public void redStop() {
	
		System.out.println("RedStop Implementation");
	}

	@Override
	public void flashingYellow() {
		
		System.out.println("FlashingYellow Implementation");
	}
	
	@Override
	public void greenGo() {
	
		System.out.println("GreenGo Implementation");
		
	}


}
