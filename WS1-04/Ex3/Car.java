/**
 * The class can show the maxSpeed
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */

public class Car implements Sortable {
	/**
	 * @param double
	 *            maxSpeed is the maxSpeed.
	 * @param String
	 *            carNumber is the carNumber
	 * @param String
	 *            make is the make
	 */
	private double maxSpeed;
	private String carNumber;
	private String make;

	public Car(double maxSpeed, String carNumber, String make) {
		this.maxSpeed = maxSpeed;
		this.carNumber = carNumber;
		this.make = make;
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
	 * @return maxSpeed
	 */
	public double compareValue() {
		return maxSpeed;
	}
}