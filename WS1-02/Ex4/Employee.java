public class Employee {

	private String name;
	private double hourlySalary;
	private int numberOfHours;

	/**
	 * @param n
	 * @param hs
	 * @param nh
	 */
	public Employee(String n, double hs, int nh) {
		name = n;
		hourlySalary = hs;
		numberOfHours = nh;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return hourlySalary
	 */
	public double getHourlySalary() {
		return hourlySalary;
	}

	/**
	 * @return numberOfHours
	 */
	public int getNumberOfHours() {
		return numberOfHours;
	}
	/**
	 * sets Name 
	 * @param newName
	 */
	public void setName(String newName) {
		name = newName;
	}
	/**
	 * sets HourlySalary 
	 * @param newHourlySalary
	 */
	public void setHourlySalary(double newHourlySalary) {
		hourlySalary = newHourlySalary;
	}
	/**
	 * sets NumberOfHours 
	 * @param newNumberOfHours
	 */
	public void setNumberOfHours(int newNumberOfHours) {
		numberOfHours = newNumberOfHours;

	}
	/**
	 * calculate monthlySalary
	 */
	public double monthlySalary(double taxRate) {
		return hourlySalary * numberOfHours * (1 - (0.01 * taxRate));

	}
	/**
	 * calculate increaseSalary
	 */
	public void increaseSalary(double percentage) {

		hourlySalary = hourlySalary * (1 + (0.01 * percentage));
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return name + " has an hourly salary of " + hourlySalary + " \u00a3 and has worked last month for "
				+ numberOfHours + " hours.";
	}

}