public class ClubMember {

	private String name;
	private String dateOfBirth;
	private String registrationNumber;
	private String membershipType;
	/**
	 * @param n
	 * @param d
	 * @param r
	 * @param m
	 */
	public ClubMember(String n, String d, String r, String m) {
		name = n;
		dateOfBirth = d;
		registrationNumber = r;
		membershipType = m;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @return registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	/**
	 * @return membershipType
	 */
	public String getMembershipType() {
		return membershipType;
	}
	/**
	* this method says to print 
	* @return A String how the object is printed.
	*/
	public String toString() {
		return "[" + name + ", " + dateOfBirth + ", " +
				"ID: " + registrationNumber + ", " + membershipType + "]";
	}
	
}