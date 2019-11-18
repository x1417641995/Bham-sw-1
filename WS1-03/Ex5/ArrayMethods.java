public class ArrayMethods {

	public static double min(double[][] a) {
		double min2 ;
		double aa;
		min2 = a[0][0];
		/**
		 * the parameters in constructor are as same as our filed variables.
		 * 
		 * @param aa
		 *            is tmp of a[i][j].
		 * @param min2
		 *            is min.
		 */
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] <= min2) {
					min2 = a[i][j];
				}
				aa = a[i][j];
				
			}

		}
		
		 //System.out.println(min2);
		return min2;
		/**
		 * calculate min .
		 * 
		 * @return min2.
		 */
	}

	public static double max(double[][] a) {
		double max2 ;
		max2 = a[0][0];
		/*
		 * @param max2
		 *            is a[i][j].
		 */
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] >= max2) {
					max2 = a[i][j];
				}

			}

		}
		 //System.out.println(max2);
		return max2;
		/**
		 * calculate max .
		 * 
		 * @return max2.
		 */
	}

	public static double mean(double[][] a) {
		double c = 0;
		double all = 0.0;
		double mean2 = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				all = all + a[i][j];
				c++;

			}

		}
		mean2 = all / c;
		return mean2;
		/**
		 * calculate mean .
		 * 
		 * @return mean2.
		 */

	}

	public static double median(double[][] a) {
		double a2;
		int c = 0;
		int d = 0;
		double min;
		int b = 0;
		double f = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c++;
			}
		}
		// System.out.println(c+"j");
		double[] aa = new double[c];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				 aa[d]=a[i][j];
				 d++;
			}
		}
		//System.out.println(d + "h");
		for (int i = 0; i < aa.length; i++) {

			min = aa[i];
			for (int j = i; j < aa.length; j++) {

				if (aa[j] <= min) {
					min = aa[j];
					b = j;
				}

			}
			a2 = aa[i];
			aa[i] = aa[b];
			aa[b] = a2;

		}
		if(c%2 == 0) {
			f = (aa[(c/2)-1]+aa[c/2])/2;
		}
		if(c%2 == 1) {
			f = aa[((c+1)/2)-1];
		}
		/*for (double element : aa) {
			System.out.print(element + " ");
		}
		System.out.println(f);*/
		return f;
		/**
		 * calculate median .
		 * 
		 * @return f.
		 */
	}

}
