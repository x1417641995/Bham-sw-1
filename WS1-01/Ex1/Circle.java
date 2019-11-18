/**  The variable A and r are declared as double and A is computed
 *   from r as Math.PI * r * r and printed suitably.  The program
 *   is test with r = 5.
 *   @author Manfred Kerber, Joseph Gardiner
 *   @version 2015-09-29, last changed 2016-10-07
 */
public class Circle { 

    /** 
     *  The methods computes the area of a circle.
     *  @param radius The radius of the circle.
     *  @return The area of the circle with radius r. 
     */
    public static double area(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
    	double r = 5;
        System.out.println("The area of a circle with radius " +
                           r + " is " + area(5) + ".");
    }
}
