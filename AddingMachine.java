package cse360assign2;
/*
* Adding machine class
* @author Sahas Chitlange
* @assignment-number 2
* @class-ID : 1213918249 
* @version 1.0
* @since 2019-10-03
*/
public class AddingMachine {

	private int total;
	private String history = "0";

	/*
	* AddingMachine constructor constructs
	* a AddingMachine object when called.
	*/
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}

	/*
	* getTotal function
	* @returns the total of the "addition" operation
	*/
	public int getTotal () {
		return total;
	}

	/*
	* add funciton
	* @param value to add
	*/
	public void add (int value) {
		history += (" + " + String.valueOf(value));
		total += value;
	}

	/*
	* subtract function
	* @param value to subtract
	*/
	public void subtract (int value) {
		history += (" - " + String.valueOf(value));
		total -= value;
	}

	/*
	* A history of the transactions must be kept to be returned
	* by the toString method.
	* @return returns string form information
	*/
	public String toString () {
		return history;
	}

	/*
	* clears the string / resets the string
	*/
	public void clear() {
		history = "0";
	}

	public static void main(String[] args) {
		AddingMachine am = new AddingMachine();
		am.add(0);
		am.subtract(3);

		System.out.println(am.getTotal());
		System.out.println(am.toString());
		am.clear();
		System.out.println(am.toString());

	}
}
