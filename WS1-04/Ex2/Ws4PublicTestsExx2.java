import static org.junit.Assert.assertEquals;
import java.util.function.Function;
import org.junit.Test;

/**
 * @author Ta-Ju
 * @version 2017-11-13
 */
public class Ws4PublicTestsExx2 {

	private final static double EPSILON = 1e-6;

	// public test
	@Test
	public void test1() {

		Function<Double, Double> f1 = x -> x * x;
		double[] a = { 5, 4, 3, 2, 1 };

		double expectedMean = 11;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 8.6486993;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);

	}

	// public test
	@Test
	public void test2() {

		Function<Double, Double> f1 = x -> x * 0;
		double[] a = { 1, 3 };

		double expectedMean = 0;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 0;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
	}

}
