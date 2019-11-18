import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 * @author Alexandros Evangelidis and David Mcdonald
 *
 */
public class Ws3PublicTestsEx5 {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private final static double EPSILON = 1e-6;

	// public test
	@Test
	public void test1() {

		double[][] a = { { 2, 3.1, 1 }, { 5, -3.8, 6 } };

		double expectedMin = -3.8;
		double expectedMax = 6;
		double expectedMean = 2.216666666666667;
		double expectedMedium = 2.55;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	// public test
	@Test
	public void test2() {

		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };

		double expectedMin = 1;
		double expectedMax = 6;
		double expectedMean = 3.5;
		double expectedMedium = 3.5;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	// public test
	@Test
	public void test3() {

		double[][] a = { {} };
		exception.expect(IllegalArgumentException.class);
		ArrayMethods.min(a);
	}

	// public test
	@Test
	public void test4() {

		double[][] a = { { 2.0, 3.1, 1.0 }, { 5.0, -3.8 } };

		double expectedMin = -3.8;
		double expectedMax = 5.0;
		double expectedMean = 1.46;
		double expectedMedian = 2.0;

		double actualMin = ArrayMethods.min(a);
		double actualMax = ArrayMethods.max(a);
		double actualMean = ArrayMethods.mean(a);
		double actualMedian = ArrayMethods.median(a);

		assertEquals(expectedMin, actualMin, EPSILON);
		assertEquals(expectedMax, actualMax, EPSILON);
		assertEquals(expectedMean, actualMean, EPSILON);
		assertEquals(expectedMedian, actualMedian, EPSILON);
	}

	// public test
	@Test
	public void test5() {

		double[][] a = { { 6.0, 7.0, 7.0 }, { -2.0, 3.1, 1.0 }, { 5.0, -3.8 }, { -5.0 } };

		double expectedMin = -5.0;
		double expectedMax = 7.0;
		double expectedMean = 2.033333333333333;
		double expectedMedian = 3.1;

		double actualMin = ArrayMethods.min(a);
		double actualMax = ArrayMethods.max(a);
		double actualMean = ArrayMethods.mean(a);
		double actualMedian = ArrayMethods.median(a);

		assertEquals(expectedMin, actualMin, EPSILON);
		assertEquals(expectedMax, actualMax, EPSILON);
		assertEquals(expectedMean, actualMean, EPSILON);
		assertEquals(expectedMedian, actualMedian, EPSILON);
	}

}
