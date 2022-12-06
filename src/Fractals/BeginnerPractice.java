package Fractals;
import processing.core.PApplet;

public class BeginnerPractice {
	
	/**
	 * Multiply all the numbers going down to zero from n
	 * Looks like: n(n-1)(n-2)...(1)
	 * Think: what's the base case?
	 * Think: what's the recursive case?
	 * @param n
	 * @return
	 */
	public static int factorial (int n) {
		if (false) { //base case
			return 0;
		} else {
			return 0; //recursive case
		}
	}

	/**
	 * Find what the square of the number n without using Math functions
	 * Hint: Use algebra!!
	 * @param n
	 * @return
	 */
	public static int squareNumber(int n) {
		if (false) { //base case
			return 0;
		} else {
			return 0; //recursive case
		}
	}

	/**
	 * Similar to the previous, but find the log of n
	 * Think: how does log work?
	 * @param n
	 * @return
	 */
	public static int logBase2(int n) {
		if (false) {
			return 0;
		} else {
			return 0;
		}
	}

	/**
	 * Create a function that can 
	 * @param n
	 * @return
	 */
	public static int pow(int n) {
		if (n == 0) {
			return 1;
		} else {
			return 2 * pow(n-1);
		}
	}

	public static void main(String[] args) {
//		int n = 5;
//		int testFact = factorial(n);
//		System.out.println(n + " factorial is " + testFact);
//		int testSquare = squareNumber(n);
//		System.out.println(n + " square is " + testSquare);
//		int testLog = logBase2(32);
//		System.out.println(32 + " log is " + testLog);
//		int testPow = pow(n);
//		System.out.println(n + " power is " + testPow);
//		n = 4;
//		int testPent = pentagonalNumber(n);
//		System.out.println(n + " pentagon is " + testPent);
//		int testTri = findTriangle(n);
//		System.out.println(n + " triangle is " + testTri);
//		int testPyr = findPyramid(n);
//		System.out.println(n + " pyramid is " + testPyr);
//		for (int n = 5; n < 50; n += 5) {
//			iterations = 0;
//			
//			long start = System.nanoTime();
//			int testFibRecur = fibRecur(n);
//			long end = System.nanoTime();
//			System.out.println(n + " fibRecur is " + testFibRecur + 
//					", took " + (end-start) + ", iter " + iterations);
//		}
		
//		for (int n = 1; n <= 10; n++) {
//			iterations = 0;
//			int testFibRecur = fibRecur(n);
//			System.out.println(n + " fibRecur is " 
//			+ testFibRecur + ", iter " + iterations);
//		}
//		
//		for (int n = 5; n < 50; n += 5) {
//			long start = System.nanoTime();
//			int testFibLoop = fibLoop(n);
//			long end = System.nanoTime();
//			System.out.println(n + " fibLoop is " 
//			+ testFibLoop + ", took " + (end-start));
//		}
		
//		for (int n = 1; n <= 10; n++) {
//			iterations = 0;
//			int testFibLoop = fibLoop(n);
//			System.out.println(n + " fibLoop is " 
//			+ testFibLoop + ", iter " + iterations);
//		}
	}


}
