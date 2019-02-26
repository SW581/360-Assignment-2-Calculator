/** 
 * @author Sarah Ward
 * class ID: 581
 * Assignment Number: 2
 * 
 * This file contains the public class Calculator
 * from the package cse360assign2.
 * Calculator is a public class for using the add, subtract,
 * multiply, and divide operations on the instance variable 'total'.
 * The history of operations is also saved so it can be returned
 * using the getHistory() method.
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * The only constructor for this class.
	 * Initializes the total to zero.
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Accessor method which returns the total.
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the parameter value to the total.
	 * Updates the history to include " + " and the parameter value.
	 * 
	 * @param value	The value to be added to the total.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the parameter value from the total.
	 * Updates the history to include " - " and the parameter value.
	 * 
	 * @param value	The value to be subtracted from the total.
	 */
	
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the parameter value with the total.
	 * Updates the history to include " * " and the parameter value.
	 * 
	 * @param value	The value to be multiplied with the total.
	 */
	
	public void multiply (int value) {
		
	}
	
	/**
	 * Divides the total by the parameter value.
	 * Updates the history to include " / " and the parameter value.
	 * 
	 * @param value	The value to be used as the divisor.
	 */
	
	public void divide (int value) {
		
	}
	
	/**
	 * Returns the history of actions performed.
	 * The string returned is formatted so that the first number is 0,
	 * which is followed by the operators and values used with spaces
	 * in between each operator and value.
	 */
	
	public String getHistory () {
		return "";
	}
}