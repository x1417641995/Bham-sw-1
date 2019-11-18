public class StarRating {
	public static String interpret(double rating) {
		
		if (1 <= rating&& rating< 4) {
			return "CRAP";
		} else if (rating == 4) {
			return "OK";
		} else if (rating == 4.5) {
			return "EXCELLENT";
		}else if (rating == 5) {
			return "[HAS ONLY ONE REVIEW]";
		} else {
			throw new IllegalArgumentException();
		}

	}
	/**
	 *  classify how many stars.
	 * 
	 * @return classification results.
	 */
}