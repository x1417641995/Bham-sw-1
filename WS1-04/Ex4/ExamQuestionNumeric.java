/**
 * The class can show the questionText, maximalMark, mark
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */

public class ExamQuestionNumeric extends ExamQuestion {
	/**
	 * @param String
	 *            questionText is the questionText.
	 * @param int
	 *            maximalMark is the maximalMark
	 * @param int
	 *            ans is the ans
	 * 
	 */
	private int ans;

	public ExamQuestionNumeric(String questionText, int maximalMark, int ans) {
		super(questionText, maximalMark);
		this.ans = ans;
	}
	/**
	 * @return mark
	 */
	public int mark(int value) {
		if (value == ans) {
			return getMaximalMark();
		} else {
			return 0;
		}
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return "Question (Maximal mark: " + getMaximalMark() + "): " + getQuestionText() + " Correct answer is: " + ans;
	}
}