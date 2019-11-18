/**
 * The subclass can show the maxSpeed, maxWeight, maxPersons, range
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */
public class Aeroplane extends Aircraft {

	/**
	 * @param double
	 *            maxSpeed is the maxSpeed.
	 * @param double
	 *            maxWeight is the maxWeight
	 * @param int
	 *            maxPersons is the maxPersons
	 * @param double
	 *            range is the range
	 */
	private double range;

	public Aeroplane(double maxSpeed, double maxWeight, int maxPersons, double range) {
		super(maxSpeed, maxWeight, maxPersons);
		this.range = range;

	}

	/**
	 * @return range
	 */
	public double getRange() {

		return range;
	}

	/**
	 * sets range
	 * 
	 * @param range
	 */
	public void setRange(double range) {

		this.range = range;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		if (getMaxPersons() == 1) {
			return "The aircraft has a maximal speed of " + getMaxSpeed() + " km/h and a maximal weight of "
					+ getMaxWeight() + " kg. It can carry " + getMaxPersons() + " person. It has a range of " + range
					+ " km.";
		} else {
			return "The aircraft has a maximal speed of " + getMaxSpeed() + " km/h and a maximal weight of "
					+ getMaxWeight() + " kg. It can carry " + getMaxPersons() + " persons. It has a range of " + range
					+ " km.";
		}

	}

}