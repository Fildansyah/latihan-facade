package facade;

public class OnPC implements PC{
	String status;

	@Override
	public String status() {
		// TODO Auto-generated method stub
		status = "on";
		return status;
	}

}
