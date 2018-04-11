
public class Ellipse extends Rectangle {
	
	//No additional attributes required
	
	//////////////////////////////////////////////
	@Override
	public int getArea() {
		return (int)(Math.PI * (super.getArea() / 4));
	}
	@Override
	public String toString() {
		return "Ellipse based on a " + super.toString();
		
	}
	/**
	 * Constructor
	 */
	Ellipse(){
		//Need to use set sides, since inherited constructor will set the side to '4'.
		this.setSides(1);
	}
	

}
