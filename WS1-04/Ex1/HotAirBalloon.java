/**
 * The subclass can show the maxSpeed, maxWeight, maxPersons, range
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */

public class HotAirBalloon extends Aircraft {
	/**
	 * @param double
	 *            maxSpeed is the maxSpeed.
	 * @param double
	 *            maxWeight is the maxWeight
	 * @param int
	 *            maxPersons is the maxPersons
	 * @param double
	 *            gasTemperature is the gasTemperature
	 */
	private double gasTemperature;

	public HotAirBalloon(double maxSpeed, double maxWeight, int maxPersons, double gasTemperature) {
		super(maxSpeed, maxWeight, maxPersons);
		this.gasTemperature = gasTemperature;
	}
	/**
	 * @return gasTemperature
	 */
	public double getGasTemperature() {
		return gasTemperature;
	}
	/**
	 * sets gasTemperature
	 * 
	 * @param gasTemperature
	 */
	public void setGasTemperature(double gasTemperature) {
		this.gasTemperature = gasTemperature;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		if(getMaxPersons() == 1) {
			return "The aircraft has a maximal speed of "+ getMaxSpeed() +
					" km/h and a maximal weight of " + getMaxWeight() +
					" kg. It can carry " + getMaxPersons() +
					" person. It has a gas temperature of maximally " + 
					gasTemperature + "¢XC.";
		}else {
			return "The aircraft has a maximal speed of "+ getMaxSpeed() +
					" km/h and a maximal weight of " + getMaxWeight() +
					" kg. It can carry " + getMaxPersons() +
					" persons. It has a gas temperature of maximally " + 
					gasTemperature + "¢XC.";
		}
						
				
				
				
	}

}