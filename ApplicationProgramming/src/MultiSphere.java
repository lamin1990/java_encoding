
public class MultiSphere {
	public static void main(String[] args) {
		Sphere s1 = new Sphere(200);
		
		s1.setDiameter(300);
		
		s1.calculateVolume();
		s1.calculateArea();
		
		System.out.println(s1.toString());
	}

}
