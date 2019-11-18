import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * test for ArrayMethods.java.
 * 
 * @author Ta-Ju Liu
 * @version 2017-11-2
 */
public class Ws3PublicTestsExx5 {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private final static double EPSILON = 1e-6;

	// public test
	@Test
	public void test1() {

		double[][] a = { { 8.0, 5.0, 6.0 }, { 4.0, 3.0, 7.0 } };

		double expectedMin = 3;
		double expectedMax = 8;
		double expectedMean = 5.5;
		double expectedMedium = 5.5;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	// public test
	@Test
	public void test2() {

		double[][] a = { { 1.0, 2.0, 3.0}, { -1.0, -2.0, -3.0 } };

		double expectedMin = -3;
		double expectedMax = 3;
		double expectedMean = 0;
		double expectedMedium = 0;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	

}