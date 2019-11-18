
/**
 * The class can show the questionText, maximalMark, mark
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */
import java.util.ArrayList;

public class ExamQuestionMultipleChoice extends ExamQuestion {
	/**
	 * @param String
	 *            questionText is the questionText.
	 * @param int
	 *            maximalMark is the maximalMark
	 * @param ArrayList<String>
	 *            a is the a
	 * @param ArrayList<Integer>
	 *            ans is the ans
	 */

	ArrayList<String> a;
	ArrayList<Integer> ans;
	int c = 0;

	public ExamQuestionMultipleChoice(String questionText, int maximalMark, ArrayList<String> a,
			ArrayList<Integer> ans) {
		super(questionText, maximalMark);
		this.a = a;
		this.ans = ans;
	}

	/**
	 * @return mark
	 */
	public int mark(ArrayList<Integer> answersProvided) {
		int d = 0;
		for (int i = 0; i < answersProvided.size(); i++) {

			for (int j = 0; j < ans.size(); j++) {
				if (answersProvided.get(i) == ans.get(j)) {
					c++;
				}
			}
		}
		for (int i = 0; i < answersProvided.size(); i++) {

			for (int j = i + 1; j < answersProvided.size(); j++) {
				if (answersProvided.get(i) == answersProvided.get(j)) {
					d++;
				}
			}
		}

		if (ans.size() == 2) {
			// System.out.println(d+"a");
			if (ans.size() == c && ans.size() == answersProvided.size() && d != 1) {

				return getMaximalMark();
			} else if (ans.size() == c - 1 || answersProvided.size() - ans.size() == 1) {
				return getMaximalMark() / 2;
			} else if (d == 1 && ans.size() == answersProvided.size()) {
				System.out.println(getMaximalMark() / 2 + "d");
				return getMaximalMark() / 2;
			} else {
				return 0;
			}
		} else {
			if (ans.size() == c && ans.size() == answersProvided.size()) {
				return getMaximalMark();
			} else if (ans.size() == c - 1 || answersProvided.size() - ans.size() == 1) {

				double b = (getMaximalMark() / 3.0) * 2;
				// System.out.println(b);
				int mark = (int) Math.round(b);
				return mark;
			} else {
				return 0;
			}
		}
	}

	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return null;
	}
}