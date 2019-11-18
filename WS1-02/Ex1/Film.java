public class Film {

	private String Title;
	private int Year;
	private int Length;

	/**
	 * @param t
	 * @param y
	 * @param l
	 */
	public Film(String t, int y, int l) {
		Title = t;
		Year = y;
		Length = l;
	}

	/**
	 * @return Title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * @return Year
	 */
	public int getYear() {
		return Year;
	}

	/**
	 * @return Length
	 */
	public int getLength() {
		return Length;
	}

	/**
	 * sets Length 
	 * @param newLength
	 */
	public void setLength(int newLength) {
		Length = newLength;
	}

	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return Title + " " + Year + " " + Length;
	}

}