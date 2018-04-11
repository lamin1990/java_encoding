
public class math_class {
	public static void main(String[] args){
		//declare variables
		double side, radius;
		
		//initialise variables
		side = 2.5;
		radius = 7;
		
		double area_square = Math.pow(side, 4);
		System.out.println ("Area of the square is " + area_square);
		
		double area_circle = Math.PI * Math.pow(radius, 2);
		System.out.println ("Area of circle is " + area_circle);
	}

}
