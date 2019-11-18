/**
 * The class can show the name, price
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
public class Good {
	/**
	 * @param String
	 *            name is the name.
	 * @param int
	 *            price is the price
	 */
	private String name;
	private int price;

	public Good(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return name + " " + price;
	}
}