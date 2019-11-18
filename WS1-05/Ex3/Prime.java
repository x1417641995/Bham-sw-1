/**
 * The class can show the Prime number
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
import java.util.ArrayList;
public class Prime{
	/**
	 * calculate Prime number
	 * @return p
	 */
	public static int[] sieve(int max) {
		
		int[] number = new int [max+1];
		int[] p= new int [max+1];
		for(int i = 1; i < max + 1 ; i++ ) {
			number[i] = i;
		}
		boolean[] sieve = new boolean[max+1];
		sieve[0] = false;
		sieve[1] = false;
		for(int i = 2; i < max + 1 ; i++ ) {
			sieve[i] = true;
		}
		
		for(int j = 2; j < (max + 1)/2; j++ ) {
			for(int i = j+1; i < max + 1 ; i++ ) {
				if( number[i]%number[j] == 0) {
					sieve[i] = false;
				}
			}
			
		}
		int a = 0; 
		for(int i = 2; i < max + 1 ; i++ ) {
			if(sieve[i] == true) {
				p[a] = number[i];
				System.out.println(p[a]);
				a++;
			}
		}
		
		return p;
	}
	/**
	 * @test
	 */
	public static void main(String[] args) {
		sieve(25);
		
	}

}