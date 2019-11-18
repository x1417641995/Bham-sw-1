public class Complex{
	
	private  double RealPart;
	private  double ImaginaryPart;
	/**
	 * @param r
	 * @param i
	 */
	public Complex (double r, double i){
		RealPart = r;
		ImaginaryPart = i;
	}
	/**
	 * @return RealPart
	 */
	public double getRealPart(){
		return RealPart;
	}
	/**
	 * @return ImaginaryPart
	 */
	public double getImaginaryPart(){
		return ImaginaryPart;
	}
	/**
	 * calculate Complex add
	 */
	public Complex add(Complex summand) {
		Complex t1 = new Complex(0,0); 
		t1.RealPart = RealPart+summand.RealPart; 
		t1.ImaginaryPart = ImaginaryPart+summand.ImaginaryPart;
		return t1; 
	}
	/**
	 * calculate Complex multiply
	 */
	public Complex multiply(Complex factor) {

		Complex t1 = new Complex(0,0);
		t1.RealPart = RealPart*factor.RealPart - ImaginaryPart*factor.ImaginaryPart; 
		t1.ImaginaryPart = RealPart*factor.ImaginaryPart+
							factor.RealPart*ImaginaryPart;
		return t1;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {		
		//return "ijj";
		return  RealPart +  " + " +ImaginaryPart + "i";
		}
	
	
}