/**
 * @author Jason Carlson
 * @class CSE 360
 * @instructor Debra Calliss
 * @assignment #2
 * @classID 344
 */


package cse360assign2;

/**
 * 
 * The Calculator class contains basic methods that a calculator would have.
 * This includes adding, subtracting, dividing.
 * 
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor for the calculator. Initializes total to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total 
	 * @return 0
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a given integer to the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * Subtracts a given integer from the total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + Integer.toString(value);
	}
	
	/**
	 * Multiplies the total by a given value
	 * @param value
	 */
	public void multiply (int value) {
		total = total*value;
		history = history + " * " + Integer.toString(value);
	}
	
	/**
	 * Divides the total by a given integer (uses integer division).
	 * If the parameter is 0, then it sets the total to zero
	 * @param value
	 */
	public void divide (int value) {
		
		if (value != 0) {
			
			total = total / value;
			
		}else {
			
			total = 0;
			
		}
		
		history = history + " / " + Integer.toString(value);
		
	}
	
	/**
	 * Returns all a string of all operations and values in their order
	 * @return string of history
	 */
	public String getHistory () {
		return history;
	}
	
	
	
}