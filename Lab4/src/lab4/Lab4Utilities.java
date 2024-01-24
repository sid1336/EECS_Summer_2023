package lab4;

import java.util.Arrays;

/**
 * In this lab you will practice writing methods, using classes from the Java
 * Standard Library, and working with String and arrays.
 * 
 * 
 * This Lab4Utilities class will help you do things with arrays: 1D and 2D This
 * Lab4Utilities class contains a random assortment of methods that should
 * improve your programming skills in using Java Control Structures (selection
 * structures, repetition structures, and nested Loops), 1D and 2D arrays.
 * 
 * <strong>Hint: You may use java.util.Arrays class.</strong>
 *
 */

public class Lab4Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY

	private Lab4Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	/**
	 * 
	 * 
	 * Implement the method below, which takes an array of <code>int</code> numbers
	 * as the input argument and returns the number of even numbers in the array
	 * argument. <strong>Your code should use a for loop.</strong>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if array1 = {9, 10, 3, 4, 3} then 	return 2
	 * if array1 = { 1, 6, 1}  then  return 1
	 * if array1 = { 4, 24, 46, 0} then  return 4
	 * if array1 = { 15, 9, 45, 57}  then  return 0
	 * </pre>
	 * 
	 * 
	 * @param inputarray : int input array
	 * @return returns the number of even numbers in the array argument.
	 */

	public static int numberOfEvens(int[] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */
	
		return -999;
	}

	/**
	 * Given class <strong><code>Rectangle</code></strong> defined in same package.
	 * 
	 * <p>
	 * Implement the method below, which takes an array of <code>Rectangle</code>
	 * objects as input argument and returns the average area of these rectangle
	 * objects.
	 * </p>
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one rectangle object.</strong>
	 * </p>
	 * 
	 * @param inputarray Array of the Rectangle object
	 * @return the average area of these rectangle objects.
	 */

	public static double avgAreaofRectangeles(Rectangle[] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */

		
		return -999;
	}

	/**
	 * 
	 * Implement the method below, which takes a 2D array of <code>int</code>
	 * numbers as input argument and returns the average of its elements.
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}} then return 51.75
	 * 	if inputarray = {{1, 4}, {12, 42}} then return 14.75
	 * 	if inputarray = {{20}, {4, 2, 12}} then return 9.5
	 * 	if inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}} then return 9.0
	 * </pre>
	 * 
	 * @param inputarray 2D input array of integers
	 * @return The average of its elements.
	 */

	public static double average2D(int[][] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */

		
		return -999;
	}

	/**
	 * Implement the method below, which takes a 2D array of <code>int</code>
	 * numbers as input argument, then finds its maximum and minimum values and
	 * returns a sorted array containing the minimum and maximum values,
	 * respectively.
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least two elements.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}} then return [-4, 333]
	 * 	if inputarray = {{1, 4}, {12, 42}} then return [1, 42]
	 * 	if inputarray = {{20}, {4, 2, 12}} then return [2, 20]
	 * 	if inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}} then return [-42, 81]
	 * </pre>
	 * 
	 * @param inputarray 2D input array of integers
	 * @return A sorted array contains the minimum and maximum values, respectively.
	 */

	public static int[] minmax2D(int[][] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */

		
		return null;
	}

	/**
	 * 
	 * This averageOfOdd method receives an array of integers, then calculates the
	 * average of the odd elements of this array.
	 * <p>
	 * <strong> You can assume that the array is not empty and contains at least 1
	 * one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *		if inputarray = {3, 6}   then 	return 3.0
	 *		if inputarray = { 1, 1, 1}   then 	return 1.0
	 *		if inputarray = { 2, 4, 6, 3}  then  	return 3.0
	 *		if inputarray = { 11, 25, 12, 50}  then  	return 18.0
	 * </pre>
	 * 
	 * 
	 * @param inputarray the input array of integers
	 * @return the average of the ODD elements of the input array of integers, the
	 *         average of type double
	 */
	public static double averageOfOdd(int[] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */
	
		return -999;
	}

	/**
	 * Implement the method below that takes an array <code>int</code> as an input
	 * argument and returns an array of <code>int</code> containing the unique
	 * elements after removing the duplicate elements from the input array. The
	 * order of elements in the returned array is unimportant, so the array contains
	 * [1, 2, 3] and [3, 2, 1] will be considered similar/same.
	 * 
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {3,4,4,1,2,3,5,6,7,8}  then return [1, 2, 3, 4, 5, 6, 7, 8]
	 * 	if inputarray = {4,2,8,8,9,9,7,8} then return [2, 4, 7, 8, 9]
	 * 	if inputarray = {9,2,8,8,9,9,8,8} then return [2, 8, 9]
	 * 	if inputarray = {1,1,0,1,8,8} then return [0, 1, 8]
	 * </pre>
	 * 
	 * @param inputarray input array of integer
	 * @return array of <code>int</code> contains the unique elements after removing
	 *         the duplicate elements from the input array
	 */

	public static int[] removeDuplicatesElement(int[] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */

		
		return null;
	}

	/**
	 * 
	 * Implement the method below that takes an array of <code>int</code> numbers as
	 * input argument and returns String value indicate that all elements belonging
	 * to this input array are in a sequence of increasing consecutive integers and
	 * returns another String value if not consecutive Consecutive integers are
	 * integers that come one after the other, as in 5, 6, 7, 8, 9, etc.
	 * <p>
	 * <strong> You can assume that the input array is not empty and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if inputarray = {6, 7, 8, 9} then return "{6, 7, 8, 9} is consecutive"
	 * if inputarray = { 6, 7, 8, 9, 2, 9} then return "{ 6, 7, 8, 9, 2, 9} is NOT consecutive"
	 * if inputarray = { 1, 1, 1, 1}  then return "{ 1, 1, 1, 1} is NOT consecutive"
	 * if inputarray = { 2, 3, 4, 5} then return "{ 2, 3, 4, 5} is consecutive"
	 * </pre>
	 * 
	 * 
	 * 
	 * @param inputarray input array of integer
	 * @return String value, see the above examples
	 * 
	 */

	public static String isConsecutive(int[] inputarray) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */

		

		return "";

	}

	/**
	 * Implement the method below, which takes a two-dimensional array of integers
	 * as the input argument and returns the total number of <strong>distinct
	 * pairs</strong> (a, b) where both a and b are even numbers and a is less than
	 * b (a<b ). Your code should use nested for loops.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if inputarray = { {9, 10, 3, 4, 3}, {1, 6, 2}, {4, 24, 46, 0}, {15, 9, 45, 57} } then return 21
	 * note we have 21 distinct pairs within this 2D array as follows 
	 * [0, 2],[0, 4],[0, 6],[0, 10],[0, 24],[0, 46],[2, 4],[2, 6],
	 * [2, 10],[2, 24],[2, 46],[4, 6],[4, 10],[4, 24],[4, 46],[6, 10],
	 * [6, 24],[6, 46],[10, 24],[10, 46],[24, 46]
	 * if inputarray = { {1, 6, 1}, {5, 9, 15, 20}, {23, 33, 99} } then return 1
	 * if inputarray = { {4, 21, 43, 1}, {22, 32, 42, 52} } then return 10
	 * if inputarray = { {15, 9, 45, 57}, {13, 17, 23} }then return 0
	 * </pre>
	 * 
	 * @param inputarray 2D int input array
	 * @return the number of distinct pairs (a, b) where both a and b are even
	 *         numbers and a < b.
	 */
	public static int countEvenPairs2D(int[][] inputarray) {
		
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */
		

		return -999;
	}



}
