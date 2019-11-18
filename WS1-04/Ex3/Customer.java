/**
 * The class can show the totalMoneySpent
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */

public class Customer implements Sortable {
	/**
	 * @param String
	 *            name is the name.
	 * @param double
	 *            totalMoneySpent is the totalMoneySpent
	 * @param String
	 *            address is the address
	 */
	private String name;
	private double totalMoneySpent;
	private String address;

	public Customer(String name, double totalMoneySpent, String address) {
		this.name = name;
		this.totalMoneySpent = totalMoneySpent;
		this.address = address;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return null;
	}
	/**
	 * @return totalMoneySpent
	 */
	public double compareValue() {
		return totalMoneySpent;
	}
}