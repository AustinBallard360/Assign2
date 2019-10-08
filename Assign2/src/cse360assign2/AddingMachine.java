package cse360assign2;

/**
 * @author Austin Ballard
 * Class ID: CSE 360 Wednesday at 9:40 
 * Assignment 2
 * Description: This is a project meant to teach the basics of git repositories and how to update them.
 * To work with these we will make two versions of this AddingMachine program. One version will be blank
 * and the other will have filled out methods.
 */


/**
 * This class builds a Machine that has different methods that provides methods for different calculations.
 * This includes the getTotal, add, subtract, toString, and clear methods.
 */
public class AddingMachine {

	private int total;
	
	/**
	 * This creates a new adding machine object.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal returns the current total
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This method adds the parameter value to the current total
	 * @param value
	 */
	public void add (int value) {
		
	}
	
	
	/**
	 * This method subtracts the parameter value from the current total
	 * @param value
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * This method keeps a list of all transactions to be returned
	 */
	public String toString () {
		return "";
	}

	public void clear() {
	
	}
}
