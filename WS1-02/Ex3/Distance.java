public class Distance {

	private double Miles;
	private double Kilometres;
	private double Metres;
	private double Yards;
	/**
	 * @param km
	 * converts masses 
	 */
	public Distance(double km){
		Miles = km/1.60934;
		Kilometres = km;
		Metres = km/0.001;
		Yards = (km/1.60934)*1760;	
	}
	/**
	 * @return Miles
	 */
	public double getMiles()
	{
		//Miles = km/1.60934;
		return Miles;
	}
	/**
	 * @return Kilometres
	 */
	public double getKilometres() {
		return Kilometres;
	}
	/**
	 * @return Metres
	 */
	public double getMetres() {
		//Metres = km/0.001;
		return Metres;
	}
	/**
	 * @return Yards
	 */
	public double getYards() {
		//Yards = (km/1.60934)*1760;
		return Yards;
	}
}
