
public class Bulb {
	
	
	
	boolean ON = true;
	
	public Bulb(boolean o) {
		ON = o;
		
	}
	
	public void pressSwitch() {
		if (ON == true ) {
			ON = false;
			
		}else {
			ON = true;
		}
		
	}
	public String toString() {
		String status;
		if(ON == true) {
			status = "The light is on!";
			
		}else {
			status = "The light is off!";
			
		}
		return status;
	}
	

}
