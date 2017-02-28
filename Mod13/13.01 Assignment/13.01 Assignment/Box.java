
/**
 * box demo.
 * 
 * 
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box extends Rectangle
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box(int length, int width, int height)
	{
		// call superclass
		super(length, width);
	    // initialise instance variables
		this.height = height;
	}

	// return the height
	public int getHeight()
	{
		return this.height;
	}

}
