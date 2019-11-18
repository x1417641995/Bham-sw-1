/**
 * The class can show the questionText, maximalMark
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */

public class ExamQuestion {
	/**
	 * @param String
	 *            questionText is the questionText.
	 * @param int
	 *            maximalMark is the maximalMark
	 */
	private String questionText;
	private int maximalMark;

	public ExamQuestion(String questionText, int maximalMark) {
		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}
	/**
	 * @return questionText
	 */
	public String getQuestionText() {
		return questionText;
	}
	/**
	 * @return maximalMark
	 */
	public int getMaximalMark() {
		return maximalMark;
	}
	/**
	 * sets questionText 
	 * @param questionText
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	/**
	 * sets maximalMark
	 * @param maximalMark
	 */
	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return "Question (Maximal mark: " + maximalMark + "): " + questionText;
	}

}
