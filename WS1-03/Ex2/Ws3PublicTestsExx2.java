import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * test for StarRating.java.
 * 
 * @author Ta-Ju Liu
 * @version 2017-11-2
 */

public class Ws3PublicTestsExx2 {
    @Rule public final ExpectedException exception = ExpectedException.none();
	
    //public test
    @Test
    public void test1() {
		
        double rating = 3.0;
		
        String expected = "CRAP";
        String actual = StarRating.interpret(rating);
		
        assertEquals(expected, actual);
    }
	 
    //public test
    @Test
    public void test2() {
		
        double rating = 4.5;
		
        String expected = "EXCELLENT";
        String actual = StarRating.interpret(rating);
		
        assertEquals(expected, actual);
    }
	
    //public test
    @Test
    public void test3() {
		
        double rating = 5.0;
		
        String expected = "[HAS ONLY ONE REVIEW]";
        String actual = StarRating.interpret(rating);
		
        assertEquals(expected, actual);
    }
	
    //public test
    @Test
    public void test4() {
		
        double rating = 1.0;
		
        String expected = "CRAP";
        String actual = StarRating.interpret(rating);
		
        assertEquals(expected, actual);
    }
	
    //public test
    @Test
    public void test5() {
		
        double rating = 4.0;
		
        String expected = "OK";
        String actual = StarRating.interpret(rating);
		
        assertEquals(expected, actual);
    }
}  