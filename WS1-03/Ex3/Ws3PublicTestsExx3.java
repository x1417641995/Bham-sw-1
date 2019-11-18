import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * test for Contains.java.
 * 
 * @author Ta-Ju Liu
 * @version 2017-11-2
 */
public class Ws3PublicTestsExx3 {

    //public test
    @Test
    public void test1() {

        ArrayList<Integer> expected = new ArrayList<Integer>
            (Arrays.asList(27, 37, 47));
        ArrayList<Integer> actual = Contains.allIntegersWith(26, 53, 7);
			
        assertEquals(expected, actual);
			
    }
		
    //public test
    @Test
    public void test2() {

        ArrayList<Integer> expected = new ArrayList<Integer>
            (Arrays.asList());
        ArrayList<Integer> actual = Contains.allIntegersWith(23, 26, 7);
			
        assertEquals(expected, actual);
			
    }
		
   
}
