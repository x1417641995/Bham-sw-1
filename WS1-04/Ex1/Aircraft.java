/**
 * The class can show the maxSpeed, maxWeight, maxPersons
 *@author Ta-Ju
 *@version 2017-11-13
 */

public class Aircraft {
	/**
	 *  @param double maxSpeed is the maxSpeed.
	 *  @param double maxWeight is the maxWeight
	 *  @param int maxPersons is the maxPersons
	 */
	private double maxSpeed;
	private double maxWeight;
	private int maxPersons;

	public Aircraft(double maxSpeed, double maxWeight, int maxPersons) {
		this.maxSpeed = maxSpeed;
		this.maxWeight = maxWeight;
		this.maxPersons = maxPersons;

	}

	/**
	 * @return maxSpeed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * sets maxSpeed 
	 * @param maxSpeed
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @return maxWeight
	 */
	public double getMaxWeight() {
		return maxWeight;
	}
	/**
	 * sets maxWeight 
	 * @param maxWeight
	 */
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	/**
	 * @return maxPersons
	 */
	public int getMaxPersons() {
		return maxPersons;
	}
	/**
	 * sets maxPersons 
	 * @param maxPersons
	 */
	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		if(maxPersons == 1) {
			return "The aircraft has a maximal speed of " + maxSpeed +
					" km/h and a maximal weight of " + maxWeight
					+ " kg. It can carry " + maxPersons + " person.";
		}else {
			return "The aircraft has a maximal speed of " + maxSpeed +
					" km/h and a maximal weight of " + maxWeight
					+ " kg. It can carry " + maxPersons + " persons.";
		}
		
	}
}
