
public class Rectangle extends Shape {
	/**
	 * The width of the rectangle.
	 */
	private int width;
	
	/**
	 * The height of the rectangle
	 */
	private int height;
	
	////////////////////////////////////////////////
	
	@Override
	public int getArea() {
		
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Rectangle with a width of " + width + ", a height of " + height + ", " + super.toString();
		
	}
	
	/**
	 * get the width of the rectangle
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of the rectangle.
	 * @param width the width to set
	 */
	
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * Gets the height of the rectangle.
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * Sets the height of the rectangle.
	 * 
	 * @param height the height to set.
	 */
	public void setHeight(int height) {
		this.height = height;
		
	}
	
	Rectangle(){
		//call super-class constructor with number of sides for this shape, i.e. 4
		super(4);
	}
	
	
	

}
