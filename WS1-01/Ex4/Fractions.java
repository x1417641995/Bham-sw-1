/**
 * The sum of two rational numbers can be computed as e1/d1 + e2/d2 = (e1*d2 +
 * e2*d1) / (d1*d2) the product as e1/d1 * e2/d2 = (e1*e2)/(d1*d2). The code is
 * repetitive (bad), since we do not have any methods at this stage yet. The
 * results are tested for the numbers in the worksheet and suitably printed.
 * 
 * @author Manfred Kerber, Joseph Gardiner
 * @version 2015-09-29 last changed: 2016-10-07
 */
public class Fractions {

    /**
     * Calculate the numerator of the sum
     * 
     * @param n1 numerator of the first summand
     * @param n2 numerator of the second summand
     * @param d1 denominator of the first summand
     * @param d2 denominator of the second summand
     * @return numerator of the sum
     */
    public static int ns(int n1, int n2, int d1, int d2) {
		return (n1 * d2 + n2 * d1);
	}

    /**
     * Calculate the denominator of the sum
     * 
     * @param d1 denominator of the first summand
     * @param d2 denominator of the second summand
     * @return denominator of the sum
     */
    public static int ds(int d1, int d2) {
        return (d1 * d2);
    }

    /**
     * Calculate the numerator of the product
     * 
     * @param n1 numerator of the first factor
     * @param n2 numerator of the second factor
     * @return numerator of the product
     */
    public static int np(int n1, int n2) {
        return (n1 * n2);
    }

    /**
     * Calculate the denominator of the product
     * 
     * @param d1 denominator of the first factor
     * @param d2 denominator of the second factor
     * @return denominator of the product
     */
    public static int dp(int d1, int d2) {
        return (d1 * d2);
    }

    public static void main(String[] args) {

        int n1, d1, n2, d2;
        n1 = 1;
        d1 = 2;
        n2 = 1;
        d2 = 3;

        System.out.println(n1 + "/" + d1 + " + " + n2 + "/" + d2 + " = "
                           + ns(n1, n2, d1, d2) + "/" + ds(d1, d2));
        
        n1 = 1;
        d1 = 3;
        n2 = 3;
        d2 = 4;
        
        System.out.println(n1 + "/" + d1 + " + " + n2 + "/" + d2 + " = "
                           + ns(n1, n2, d1, d2) + "/" + ds(d1, d2));

        n1 = 1;
        d1 = 2;
        n2 = 1;
        d2 = 3;

        System.out.println(n1 + "/" + d1 + " * " + n2 + "/" + d2 + " = "
                           + np(n1, n2) + "/" + dp(d1, d2));
        
        n1 = 1;
        d1 = 3;
        n2 = 3;
        d2 = 4;
        
        System.out.println(n1 + "/" + d1 + " * " + n2 + "/" + d2 + " = "
                           + np(n1, n2) + "/" + dp(d1, d2));

    }
}
