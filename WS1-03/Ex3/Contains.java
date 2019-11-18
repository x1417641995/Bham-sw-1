import java.util.ArrayList;

public class Contains {
	public static ArrayList<Integer> allIntegersWith(int from, int to, int containedDigit) {
		ArrayList<Integer> allIntegersWith1 = new ArrayList<Integer>();

		for (int i = from; i < to; i++) {

			if (i % 10 == containedDigit || i % 10 == -containedDigit) {
				allIntegersWith1.add(i);
				/*
				 * Determine the number of single digits
				 */
			} else if (i / 10 == containedDigit || i / 10 == -containedDigit) {
				if (i > 10 || i < -10) {
					allIntegersWith1.add(i);
				}
				/*
				 * Determine the number of ten digits
				 */
			} else if (i / 10 % 10 == containedDigit || i / 10 % 10 == -containedDigit) {
				if (i > 100 || i < -100) {
					allIntegersWith1.add(i);
				}
				/*
				 * Determine the number of hundrend digits
				 */
			}
		}

		return allIntegersWith1;
	}
	/*
	 * @return allIntegersWith1.
	 */
}