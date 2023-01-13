package facade;

public class PCFacade {
	OnPC onPc = new OnPC();
	OffPC offPc = new OffPC();
	
	
	public String turnOn() {
		return onPc.status();
	}
	
	public String turnOff() {
		return offPc.status();
	}
	

}
