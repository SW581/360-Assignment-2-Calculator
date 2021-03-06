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
	private String actionHistory;
	
	/**
	 * The only constructor for this class.
	 * Initializes the total to zero.
	 * Initializes actionHistory to "0"
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		actionHistory = "0";
	}
	
	/**
	 * Accessor method which returns the total.
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter value to the total.
	 * Updates the history to include " + " and the parameter value.
	 * 
	 * @param value	The value to be added to the total.
	 */
	public void add (int value) {
		total = total + value;
		actionHistory = actionHistory + " + " + value;
	}
	
	/**
	 * Subtracts the parameter value from the total.
	 * Updates the history to include " - " and the parameter value.
	 * 
	 * @param value	The value to be subtracted from the total.
	 */
	
	public void subtract (int value) {
		total = total - value;
		actionHistory = actionHistory + " - " + value;
	}
	
	/**
	 * Multiplies the parameter value with the total.
	 * Updates the history to include " * " and the parameter value.
	 * 
	 * @param value	The value to be multiplied with the total.
	 */
	
	public void multiply (int value) {
		total = total * value;
		actionHistory = actionHistory + " * " + value;
	}
	
	/**
	 * Divides the total by the parameter value.
	 * Updates the history to include " / " and the parameter value.
	 * 
	 * @param value	The value to be used as the divisor.
	 */
	
	public void divide (int value) {
		if(value != 0)
		{
			total = total / value;
			
		}
		else
		{
			total = 0;
		}
		actionHistory = actionHistory + " / " + value;
	}
	
	/**
	 * Returns the history of actions performed.
	 * The string returned is formatted so that the first number is 0,
	 * which is followed by the operators and values used with spaces
	 * in between each operator and value.
	 */
	
	public String getHistory () {
		return actionHistory;
	}
}