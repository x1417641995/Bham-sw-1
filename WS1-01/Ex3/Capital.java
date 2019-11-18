/**
 * In this exercise, the variables are declared and initialized, then the
 * formula on the worksheet is translated to Java and the total capital computed
 * after 1, 2, 3, 4, 5, and 500 years. 
 * 
 * @author Manfred Kerber, Joseph Gardiner
 * @version 2015-09-29, last changted 2016-10-07
 */
public class Capital {

    /**
     * Takes the current capital, interest rate and number of years and 
     * @param capitalSum   The capital involved.
     * @param interestRate The interest rate.
     * @param years        The number of years of the investment.
     * @return The final capital (incl. interest earned).
     */
    public static double interestAddedCapitalSum(double capitalSum,
                                                 double interestRate, int years) {
        return capitalSum * Math.pow(1. + 0.01 * interestRate, years);
    }

    public static String interestToString(double capitalSum, double interestRate, int years) {
        return "After " + years + " years a capital of \u00A3"
            + capitalSum + " grows with an interest rate of " + interestRate
            + "\u0025 to \u00A3" + Math.round(interestAddedCapitalSum(capitalSum, interestRate, years));
    }

    public static void main(String[] args) {
        
        double capitalSum = 100; // the initial capital in pounds
        double interestRate = 2.3; // the interest rate per year

        System.out.println(interestToString(capitalSum, interestRate, 1));
        System.out.println(interestToString(capitalSum, interestRate, 2));
        System.out.println(interestToString(capitalSum, interestRate, 3));
        System.out.println(interestToString(capitalSum, interestRate, 4));
        System.out.println(interestToString(capitalSum, interestRate, 5));
        System.out.println(interestToString(capitalSum, interestRate, 500));
    }
}
