import static org.junit.Assert.*;
import org.junit.Test;

/**
 * test for SelectionSort.java.
 * 
 * @author Ta-Ju Liu
 * @version 2017-11-2
 */

public class Ws3PublicTestsExx1 {
	
    //public test
    @Test 
    public void test1() {
		
        int[] a = {4, 7, 2, 1};
		
		
        int[] expected = {1, 2, 4, 7};
        int[] actual = SelectionSort.selectionSort(a);
		
        assertArrayEquals(expected, actual);
    }

    //public test
    @Test 
    public void test2() {
		
        int[] a = {1, 2, 3, 9, 4};
		
		
        int[] expected = {1, 2, 3, 4, 9};
        int[] actual = SelectionSort.selectionSort(a);
		
        assertArrayEquals(expected, actual);
    }
	
    //public test
    @Test 
    public void test3() {
		
        int[] a = {5, 2};
		
		
        int[] expected = {2, 5};
        int[] actual = SelectionSort.selectionSort(a);
		
        assertArrayEquals(expected, actual);
    }
	
    //public test
    @Test 
    public void test4() {
		
        int[] a = {9, 4, 5, 0, 3};
		
		
        int[] expected = {0, 3, 4, 5, 9};
        int[] actual = SelectionSort.selectionSort(a);
		
        assertArrayEquals(expected, actual);
    }
	
    //public test
    @Test 
    public void test5() {
		
        int[] a = {1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0};
		
		
        int[] expected = {0,0,0,0,1,1,1,1,1,1,1};
        int[] actual = SelectionSort.selectionSort(a);
		
        assertArrayEquals(expected, actual);
    }
	
    //public test
    @Test 
    public void test6() {
		
        int[] a = {Integer.MAX_VALUE, -1, 1, -1, 1, 2, 4};
		

        int[] expected = {-1, -1, 1, 1, 2, 4, Integer.MAX_VALUE};
        int[] actual = SelectionSort.selectionSort(a);
		
        assertArrayEquals(expected, actual);
    }

    
}