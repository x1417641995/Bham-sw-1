/**
 * The class can show mean, standardDeviation
 *@author Ta-Ju
 *@version 2017-11-13
 */
import java.util.function.Function;

public class Statistics{
	/**
	 *  @param double u is the mean
	 *  @param double[] a1 is the argumentValues
	 *  
	 */
	public static double mean(Function<Double,Double> f,double[] argumentValues) {
		double []a1 = new double[argumentValues.length];
		double u = 0;
		a1 = argumentValues;
		double a = 0 ;
		for(int i = 0; i < argumentValues.length ; i++) {
			a = a + (f.apply(a1[i]));
		}
		u = a/(argumentValues.length) ;
		return u ;
	}
	/**
	 *  @param double a is the mean
	 *  @param double c is the standardDeviation
	 *  
	 */
	public static double standardDeviation(Function<Double,Double> f,
			double[] argumentValues) {
		double a = mean(f,argumentValues);
		double b = 0;
		double c = 0.0;
		for(int i = 0; i < argumentValues.length; i++) {
			b = b + Math.pow(f.apply(argumentValues[i]) - a, 2);
		}
		c = Math.sqrt(b/argumentValues.length);
		//System.out.println(c);
		return c ;
	}
	
}