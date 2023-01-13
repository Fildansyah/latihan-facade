package facade;

public class OffPC implements PC{
	String status;
	@Override
	public String status() {
		// TODO Auto-generated method stub
		status = "off";
		return status;
	}

}
