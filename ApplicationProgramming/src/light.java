
public class light {

	public static void main(String[] args) {
		
		Bulb b1 = new Bulb(false);
		
		System.out.println(b1.toString());
		
		b1.pressSwitch();
		
		System.out.println(b1.toString());
		
		b1.pressSwitch();
		

	}

}
