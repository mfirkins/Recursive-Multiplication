/**
 * File Name: Main.java<br>
 * Purpose: Takes two integers and recursively adds them using addition<br>
 * Created: 13/03/20<br>
 * Modified: 01/04/20<br>
 * Copyright: No Copyright<br>
 * @version 1.1<br>
 * @author Morgan Firkins<br>
 */

public class Main {
	/**
	 * Purpose: Takes two integers and calls the multiply method on the two integers
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 4; 
		int m = 5;
		int t = multiply(n,m); //call multiply method on n and m
		System.out.print(t);
	}
	/**
	 * Takes the two integers and multiplies them using recursive addition
	 * @param n: An integer to be multiplied
	 * @param m: An integer to be multiplied
	 * @return 0 or call multiply method
	 */
	public static int multiply(int n, int m) {
		/**
		 * If m is 0 then return 0. If anything else call
		 * the multiply method again but reduce m by 1
		 */
		if (m == 0) {
			return 0;
		}
		else {
			return multiply(n, m-1) + n;
			
		}
	}

}
