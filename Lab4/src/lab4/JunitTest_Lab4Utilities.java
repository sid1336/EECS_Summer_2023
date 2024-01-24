package lab4;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_Lab4Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	

	@Test
	public void test_01_01_() {
		final int[] myList = { 9, 10, 3, 4, 3 };
		int n = Lab4Utilities.numberOfEvens(myList);
		int expect = 2;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_01_02_() {
		final int[] myList = { 1, 6, 1 };
		int n = Lab4Utilities.numberOfEvens(myList);
		int expect = 1;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_01_03_() {
		final int[] myList = { 4, 24, 46, 0 };
		int n = Lab4Utilities.numberOfEvens(myList);
		int expect = 4;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	
	@Test
	public void test_01_04_() {
		final int[] myList = { 14, 241, 1, 1 };
		int n = Lab4Utilities.numberOfEvens(myList);
		int expect = 1;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}
	
	
	@Test
	public void test_01_05_() {
		final int[] myList = { 13, 23, 27, 11 };
		int n = Lab4Utilities.numberOfEvens(myList);
		int expect = 0;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}
	
	
	@Test
	public void test_02_01_() {
		Rectangle[] a = {new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3)};
		double avg =Lab4Utilities.avgAreaofRectangeles(a);
		double exp = 6.0;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	@Test
	public void test_02_02_() {
		Rectangle[] a = {new Rectangle(3,3),new Rectangle(3,3),new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3)};
		double avg =Lab4Utilities.avgAreaofRectangeles(a);
		double exp = 7.2;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	
	@Test
	public void test_02_03_() {
		Rectangle[] a = {new Rectangle(3,3),new Rectangle(2,3)};
		double avg =Lab4Utilities.avgAreaofRectangeles(a);
		double exp = 7.5;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	@Test
	public void test_02_04_() {
		Rectangle[] a = {new Rectangle(2,3)};
		double avg =Lab4Utilities.avgAreaofRectangeles(a);
		double exp = 6.0;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	
	@Test
	public void test_03_01_() {
		int[][] inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}};
		double avg =Lab4Utilities.average2D(inputarray);
		double exp = 51.75;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	@Test
	public void test_03_02_() {
		int[][] inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}};
		double avg =Lab4Utilities.average2D(inputarray);
		double exp = 51.75;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	
	@Test
	public void test_03_03_() {
		int[][] inputarray = {{9, 2, 33, 4}, {11, 2, 32, 45}, {1, 222, 333, -4}};
		double avg =Lab4Utilities.average2D(inputarray);
		double exp = 57.50;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	@Test
	public void test_03_04_() {
		int[][] inputarray = {{9, 2, 33, 4}};
		double avg =Lab4Utilities.average2D(inputarray);
		double exp = 12.00;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	@Test
	public void test_03_05_() {
		int[][] inputarray = {{9, 2},{ 33, 4},{0,0,0}};
		double avg =Lab4Utilities.average2D(inputarray);
		double exp = 6.86;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	
	@Test
	public void test_04_01_() {

		final int[][] A = { {12, 4, 6}, {5 , 2,1 } };
		int [] exp = {1, 12};
		int [] result = Lab4Utilities.minmax2D(A);

		String error = String.format(
				"\n Test minmax2D failed,  Returned ( %s ) " + 
		" but correct is ( %s ). \n",
				 Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}

	@Test
	public void test_04_02_() {

		final int[][] A = { {-12, 4, 6}, {5 , 2,1 } };
		int [] exp = {-12, 6};
		int [] result = Lab4Utilities.minmax2D(A);

		String error = String.format(
				"\n Test minmax2D failed,  Returned ( %s ) " + 
		" but correct is ( %s ). \n",
				 Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}
	@Test
	public void test_04_03_() {

		final int[][] A = { {-12, 4, 6}, {5 , 2,1 } , {15 , 52,-30 }};
		int [] exp = {-30, 52};
		int [] result = Lab4Utilities.minmax2D(A);

		String error = String.format(
				"\n Test minmax2D failed,  Returned ( %s ) " + 
		" but correct is ( %s ). \n",
				 Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}
	
	@Test
	public void test_05_01_() {

		final int[] A = { 12, 4, 6 };
		double exp = 0.0;
		double avg = Lab4Utilities.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	
	
	@Test
	public void test_05_02_() {

		final int[] A = { 3, 6 };
		double exp = 3.0;

		double avg = Lab4Utilities.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}
	@Test
	public void test_05_03_() {

		final int[] A = {12, 4, 6, 3, 3 ,5 ,7 };
		double exp = 4.5;
		double avg = Lab4Utilities.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}
	
	
	@Test
	public void test_05_04_() {

		final int[] A = {12, 4, 6, 4, 4,4,4,4,4,4,4,1 };
		double exp = 1.0;
		double avg = Lab4Utilities.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}
	
	@Test
	public void test_05_05_() {

		final int[] A = {12, 4, 6, 4, 4,4,4,4,4,4,4 };
		double exp = 0.0;
		double avg = Lab4Utilities.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}
	
	
	@Test
	public void test_06_01_() {

		final int[] A = { 12, 4, 6, 3, 3 ,5 ,7 };
		int[]  exp = {3,4,5,6,7,12};
		int[] result = Lab4Utilities.removeDuplicatesElement(A);
		Arrays.sort(exp);
		Arrays.sort(result);
		String error = String.format(
				"\n Test removeDuplicatesElement failed for %s. Returned ( %s ) " + 
						" but correct is ( %s ). \n",
				Arrays.toString(A), Arrays.toString(result), Arrays.toString(exp));

		
		assertTrue(error, Arrays.equals(exp, result) );

	}
	
	
	
	@Test
	public void test_06_02_() {

		final int[] A = { 4,4,4,4,4,4,4,3, 3 ,5 ,7 };
		int[]  exp = {3,4,5,7};
		int[] result = Lab4Utilities.removeDuplicatesElement(A);
		Arrays.sort(exp);
		Arrays.sort(result);
		String error = String.format(
				"\n Test removeDuplicatesElement failed for %s. Returned ( %s ) " + 
						" but correct is ( %s ). \n",
				Arrays.toString(A), Arrays.toString(result), Arrays.toString(exp));

		
		assertTrue(error, Arrays.equals(exp, result) );

	}
	
	
	
	@Test
	public void test_06_03_() {

		final int[] A = { 4,4,4,4,4,4,4,3, 3, 1,11,11,11,1,0  };
		int[]  exp = {0,1 , 3,4,11};
		int[] result = Lab4Utilities.removeDuplicatesElement(A);
		Arrays.sort(exp);
		Arrays.sort(result);
		String error = String.format(
				"\n Test removeDuplicatesElement failed for %s. Returned ( %s ) " + 
						" but correct is ( %s ). \n",
				Arrays.toString(A), Arrays.toString(result), Arrays.toString(exp));

		
		assertTrue(error, Arrays.equals(exp, result) );

	}
	
	@Test
	public void test_07_01_() {
		final int[] myList = { 3, 6 };
		String  n = Lab4Utilities.isConsecutive(myList);
		assertEquals("{3, 6} is NOT consecutive",n);
	}

	@Test
	public void test_07_02_() {
		final int[] myList = { 3 };
		String  n = Lab4Utilities.isConsecutive(myList);
		assertEquals("{3} is consecutive",n);
	}
	@Test
	public void test_07_03_() {
		final int[] myList = { 6, 7, 8, 9 };
		String  n = Lab4Utilities.isConsecutive(myList);
		assertEquals("{6, 7, 8, 9} is consecutive",n);
	}
	
	@Test
	public void test_07_04_() {
		final int[] myList = { 6, 7, 8, 9 ,10 };
		String  n = Lab4Utilities.isConsecutive(myList);
		assertEquals("{6, 7, 8, 9, 10} is consecutive",n);
	}
	
	@Test
	public void test_07_05_() {
		final int[] myList = { 69 ,10 };
		String  n = Lab4Utilities.isConsecutive(myList);
		assertEquals("{69, 10} is NOT consecutive",n);
	}

	
	
	@Test
	public void test_08_01_() {

		int[][] array1 = { { 9, 10, 3, 4, 3 }, { 1, 6, 2 }, { 4, 24, 46, 0 }, { 15, 9, 45, 57 } };
		int exp = 21;
		int  result = Lab4Utilities.countEvenPairs2D(array1);
		
		
		String error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);

		
		assertEquals(error, exp, result);
		
		int[][] array2 = { { 1, 6, 1 }, { 5, 9, 15, 20 }, { 23, 33, 99 } };
		exp = 1;
		result = Lab4Utilities.countEvenPairs2D(array2);
		error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);
		assertEquals(error, exp, result);

	}
	
	@Test
	public void test_08_02_() {

		int[][] array1 = { {10, 9, 45, 57}, {12, 17, 22} };
		int exp = 3;
		int  result = Lab4Utilities.countEvenPairs2D(array1);
		
		
		String error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);

		
		assertEquals(error, exp, result);
		
		int[][] array2 = { {} };
		exp = 0;
		result = Lab4Utilities.countEvenPairs2D(array2);
		error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);
		assertEquals(error, exp, result);

	}
	
	
	@Test
	public void test_08_03_() {

		int[][] array1 = { {15, 9, 45, 57},{4, 24, 46, 0} };
		int exp = 6;
		int  result = Lab4Utilities.countEvenPairs2D(array1);
		
		
		String error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);

		
		assertEquals(error, exp, result);
		
		int[][] array2 = { {9, 10, 3, 4, 3} };
		exp = 1;
		result = Lab4Utilities.countEvenPairs2D(array2);
		error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);
		assertEquals(error, exp, result);

	}
	
	
	
	@Test
	public void test_08_04_() {

		int[][] array1 = { {2, 6, 1}, {5, 9, 6, 20}, {23, 6, 99} };
		int exp = 3;
		int  result = Lab4Utilities.countEvenPairs2D(array1);
		
		
		String error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);

		
		assertEquals(error, exp, result);
		
		int[][] array2 = { {9, 10, 3, 4, 3}, {4, 24, 46, 0}, {0, 2, 3 , 0} };
		exp = 15;
		result = Lab4Utilities.countEvenPairs2D(array2);
		error = String.format(
				"\n Test countEvenPairs2D failed Returned ( %d ) " + 
						" but correct is ( %d ). \n",
				result, exp);
		assertEquals(error, exp, result);

	}
	
}
