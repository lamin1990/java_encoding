
public class Sphere {
	private double sphereDiameter;
	private double sphereRadius;
	private double sphereVolume;
	private double sphereArea;
	
	public Sphere(double d) {
		
		sphereDiameter = d;
		sphereRadius = d/2.0;
		
	}
	
	public void setDiameter(double dm) {
		sphereDiameter = dm;
		sphereRadius = dm/2.0;
		
	}
	
	public void setRadius(double rd) {
		sphereRadius = rd;
		sphereDiameter =rd * 2.0;
	}
	
	public double getDiameter() {
		return sphereDiameter;
	}
	
	public double getRadius() {
		return sphereRadius;
	}
	
	public double calculateVolume() {
		sphereVolume = (4 * Math.PI * Math.pow(sphereRadius, 3)) / 3;
		return sphereVolume;
		
	}
	
	public double calculateArea() {
		sphereArea = 4 * Math.PI * Math.pow(sphereRadius, 2);
		return sphereArea;
	}
	
	public String toString() {
		String sph = "The diameter of the sphere is: " + sphereDiameter + "\nThe radius of the sphere is: " + sphereRadius
					+ "\nThe volume of the sphere is: " + sphereVolume + "\nThe Area of the sphere is: " + sphereArea ;
		return sph;
		
	}
	

}
