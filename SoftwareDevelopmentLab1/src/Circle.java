
public class Circle extends Shape {
	/**
	 * The radius of the circle.
	 * 
	 */
	private int radius;
	//////////////////////////////////////////
	@Override
	public int getArea() {
		//since the return type 'int' need to cast result so it matches 
		//the method declaration within the Shape class.
		
		return (int)(Math.PI * radius * radius);
	}
	@Override
	public String toString() {
		return "Circle with a radius of " + radius + ", " + super.toString();
	}
	/**
	 * Gets the radius of the circle.
	 * 
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	/**
	 * Sets the radius of the circle
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	/**
	 * Constructor
	 */
	Circle(){
		//call super-class constructor with number of sides for this shape, i.e.1
		super(1);
		
	}

}
