import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * @author Ta-Ju
 * @version 2017-11-13
 */
public class Ws4PublicTestsExx3 {
	
	public static final double EPSILON = 1e-6;
	
	private Sortable s1, s2, s3, s4, s5, s6;
	
	//public test
	@Test
	public void test1() {
		
		s1 = new Car(200.0, "WD56 LIS", "BMW");
		
		double expected = 200.0;
		double actual = s1.compareValue();
		
		assertEquals(expected, actual, EPSILON);
	}
	
	//public test
	@Test
	public void test2() {
		
		s2 = new Car(300.0, "FG61 CWF", "AUDI");
		
		double expected = 300.0;
		double actual = s2.compareValue();
		
		assertEquals(expected, actual, EPSILON);
	}
	
	//public test
	@Test
	public void test3() {
		
		s4 = new Customer("Dan", 24.0, "31 Bristol Street");
		
		double expected = 24.0;
		double actual = s4.compareValue();
		
		assertEquals(expected, actual, EPSILON);
	}
}	