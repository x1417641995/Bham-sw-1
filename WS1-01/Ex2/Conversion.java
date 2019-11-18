/**
 * First the relationships are stored in variables:
 * <pre>
 * 1 ton           ~   2240 pounds 
 * 1 hundredweight ~    112 pounds 
 * 1 quarter       ~     28 pounds 
 * 1 stone         ~     14 pounds 
 * 1 ounce         ~   1/16 pounds 
 * 1 drachm        ~  1/256 pounds 
 * 1 grain         ~ 1/7000 pounds 
 * 1 pound         ~ 0.45359237 kilograms
 * </pre>
 * 
 * Then the imperial weight is transformed into pounds and stored in a variable
 * weightInPounds. Then this weight is transformed in kilograms and the
 * transformation is run for the 11 stones and 6 pounds from the worksheet.
 * Finally the result is suitably printed.
 * 
 * @author Manfred Kerber, Joseph Gardiner
 * @version 2015-09-29, last changed 2016-10-07
 */

public class Conversion {

    /**
     * Converts tons to kilograms
     * 
     * @param ton the value of tons 
     * @return weight in kilograms
     */
    public static double ton2Kilogram(double ton) {
        return pound2Kilogram(ton * 2240);
    }

    /**
     * Converts hundred weight to kilogram
     * 
     * @param hw the value of hundredweights
     * @return weight in kilograms
     */
    public static double hundredweight2Kilogram(double hw) {
        return pound2Kilogram(hw * 112);
	}

    /**
     * Converts quarters to kilograms
     * 
     * @param quarter the value of quarters
     * @return weight in kilograms
     */
    public static double quarter2Kilogram(double quarter) {
        return pound2Kilogram(quarter * 28);
    }

    /**
     * Converts stones to kilograms
     * 
     * @param stone the value of stones
     * @return weight in kilograms
     */
    public static double stone2Kilogram(double stone) {
        return pound2Kilogram(stone * 14);
    }

    /**
     * Converts ounces to kilograms
     * 
     * @param ounce the value of stones
     * @return weight in kilograms
     */
    public static double ounce2Kilogram(double ounce) {
        return pound2Kilogram(ounce / 16);
    }

    /**
     * COnverts drachm to kilograms
     * 
     * @param drachm the value of drachms
     * @return weight in kilograms
     */
    public static double drachm2Kilogram(double drachm) {
        return pound2Kilogram(drachm / 256);
    }

    /**
     * Converts grain to kilograms
     * 
     * @param grain the value of grains
     * @return weight in kilograms
     */
    public static double grain2Kilogram(double grain) {
        return pound2Kilogram(grain / 7000);
    }

    /**
     * Converts pounds to kilograms
     * 
     * @param pound the value of pounds
     * @return weight in kilograms
     */
    public static double pound2Kilogram(double pound) {
        return (pound * 0.45359237);
    }

    /**
     * Exercise 2(b). Converts stones to pounds to kilograms by first computing
     * total weight in pounds, then converting to kilograms using previously
     * defined method
     * 
     * @param stones The stones part of the weight.
     * @param pounds The pounds part of the weight.
     * @return The weight in kilograms.
     */
    public static int imperial2Metric(int stones, int pounds) {
        return (int) Math.round(pound2Kilogram((stones * 14) + pounds));
    }

    public static void main(String[] args) {
        
        int stones = 11;
        int pounds = 5;
        System.out.println("A person with " + stones + " stones and " + pounds
                           + " pounds has a weight corresponding to "
                           + imperial2Metric(stones, pounds) + " kilograms.");
    }
}
