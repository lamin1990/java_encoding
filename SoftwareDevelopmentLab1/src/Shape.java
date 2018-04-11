/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 * 
 * Shows good use of javadoc comments, annotations, visibility scope, modifiers and class hierarchies.
 */

/**
 * @author user
 *
 */
public abstract class Shape { //class marked as 'abstract' since it is not designed to be instantiated directed.
	
	/**
	 * The number of sides within a shape.
	 * 
	 * Uses 'private' visibility modifier. Could use 'protected' so it can be accessed by sub-classes.
	 * 
	 */
	private int sides;
	
	/**
	 * 
	 * Gets the number of sides within the shapes.
	 * @return the number of sides within the shape.
	 */
	
	public int getSides() {
		return sides;
	}
	
	/**
	 * Set the number of sides within the shape.
	 * @param sides the number of sides within the shape.
	 */
	
	public void setSides(int sides) {
		this.sides = sides;//use this.sides to distinguish parameter and attribute.
		
	}
	/**
	 * Gets the size of the shapes area.
	 * @return the size of the shapes area.
	 */
	abstract public int getArea();
	
	@Override
	public String toString() {
		return "area is " + getArea() + ", the number of sides is " + sides;
	}
	
	/**
	 * Constructor
	 * @param sides the number of sides within the shapes.
	 */
	Shape(int sides){
		this.sides = sides;
	}
	

}
