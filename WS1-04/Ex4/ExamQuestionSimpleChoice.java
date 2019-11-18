/**
 * The class can show the questionText, maximalMark, mark
 * 
 * @author Ta-Ju
 * @version 2017-11-13
 */
import java.util.ArrayList;

public class ExamQuestionSimpleChoice extends ExamQuestion{
	/**
	 * @param String
	 *            questionText is the questionText.
	 * @param int
	 *            maximalMark is the maximalMark
	 * @param ArrayList<String>
	 *            a is the a
	 * @param int 
	 *            ans is the ans
	 */
	private int ans;
	ArrayList<String> a;
	
	public ExamQuestionSimpleChoice(String questionText, int maximalMark,
			ArrayList<String> a, int ans){
		super(questionText, maximalMark);
		this.a = a;
		this.ans = ans;
		
	}
	/**
	 * @return mark
	 */
	public int mark(int value) {
		if(value == ans) {
			return getMaximalMark();
		}else {
			return 0;
		}		
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		return "Question (Maximal mark: " + getMaximalMark() +
				"): "+ getQuestionText() + " Possible answers are: " + a +
				" Correct answer position is: " + ans;
	}
}