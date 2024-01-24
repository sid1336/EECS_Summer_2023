package lab2;
import java.util.Random;
public class Lab2Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	
	private Lab2Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	/**
	 * Write a static method to compute and return a random integer between x and y,
	 * inclusive, assuming x is less than or equal to y.
	 * <p>
	 * This method should not assign values to x or y nor print the random number.
	 * </p>
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x= 0 and y =10 then return any integer belonging to {0,1,2,3,4,5,6,7,8,9,10}
	 * if x= 2 and y =7  then return any integer belonging to {2,3,4,5,6,7}
	 * </pre>
	 * 
	 * 
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 *   
	 *          @pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          x is less than or equal to y
	 *          </p>
	 * 
	 * 
	 * @return a random integer between x and y, inclusive, assuming x is less than
	 *         or equal to y.
	 */

	public static int getRandomNumber(int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		int range = y - x + 1;
		int start = (int) x;
		int end = (int) y;
		int random = 0;
		while (random < start || random > end) {
				random = (int)(Math.random()*range)+start;  
			}
			
		return random;
	}
	
	/**
	 * Write a static method to generate string of random number the number of
	 * generated random number is defined by integer value given by n the generated
	 * random integers should be between x and y (inclusive). Assuming n is positive
	 * and x is less than or equal to y.
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=5, x= 5 and y =10 then some of possible returned strings <6><8><9><10><7> 
	 * or <8><9><6><6><7> , <9><6><9><6><9>,..., <5><9><6><5><10>,... .
	 * if n=2,  x= 2 and y =7  then some of possible returned strings <3><7> 
	 * or <7><6> , <4><7>,...
	 * </pre>
	 * 
	 * @pre.
	 * <p>
	 * <strong> Precondition </strong>
	 * </p>
	 * <p>
	 * n is positive and x is less than or equal to y
	 * </p>
	 * 
	 * @param n : number of random integers
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * @return generate string of random number the number of generated random
	 *         number is defined by integer value given by n the generated random
	 *         integers should be between x and y (inclusive).
	 */

	public static String stringOfRandomInt(int n, int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String result = "";
		Random random = new Random();
		
//		int n1 = (int)Math.random()*n;
//		int x1 = (int)Math.random()*x;
//		int y1 = (int)Math.random()*y;
		for (int i =0;
				i < n;
				i++) {
			int randomNumber = random.nextInt(y-x+1)+ (int) x;
			result += "<" + randomNumber + ">";
			
		}
		return result;
	}

	
	
	/**
	 * Write a static method to determine if the given integer is perfect square.
	 * <p>
	 * Note: The numbers 0, 1, 4, 9, 16, 25, ... are perfect squares.
	 * </p>
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Perfect Square"
	 * if n= 10  then  return "Integer 10 is NOT Perfect Square"
	 * if n= 63 then  return "Integer 63 is NOT Perfect Square"
	 * if n= 64  then  return "Integer 64 is NOT Perfect Square"
	 * </pre>
	 * 
	 * 
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param n :int input integer
	 * 
	 *          @pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 * 
	 * @return String value see the above examples
	 */

	public static String isPerfectSquare(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String result = "";
		if (n == 0) {
			return "Integer 0 is Perfect Square";
		}else {
			for (int i = 1;
					 i <= n; 
					 i++) {
	            if (i * i == n) {
	            	result += "Integer" + " " + n +" " +  "is" + " " +  "Perfect" + " " + "Square" ;
					return result; 
				}
			}
		}
	return String.format("Integer %d is NOT Perfect Square", n);
}
//		double i  = (int) Math.sqrt(n);
//
//				if ((Math.floor(i) == i)) {
//					result += "Integer" + " " + n +" " +  "is" + " " +  "Perfect" + " " + "Square" ;
//				return result;
//				}else if (Math.floor(i) < i) { 
//					result += "Integer" + " " + n +" " +  "is" + " NOT" + " " +  "Perfect" + " " + "Square" ;
//				return result;
//				}
//				return result;
//		}
////		return result;
	
		

	
	
	
	/**
	 * 
	 * Implement a static method that receives three strings as input 
	 * and returns a String datatype as an output.
	 * If the length of any input string is zero, 
	 * the method does nothing and returns a string with the value "Invalid". 
	 * Otherwise, the method does the following:
	 * <p>
	 * First, the method extracts the first half of the first string, s1. 
	 * For example, if s1 is "York", the length of s1 is even,  then the method returns "Yo".
	 * Otherwise, if s1 is "Hello",  then the method returns "Hel".
	 * </p>
	 *  <p>
	 * Second, the method extracts the last two characters from s2 if the s2 length is greater than or equal to 2; 
	 * otherwise, the method uses a single character from s2. After extracting the characters from s2, 
	 * the method creates three copies of the extracted characters. 
	 * For example, if s2 is "Hello", then the method will create a new string with 
	 * the following value "lololo". 
	 * If s2 is "Y", then the method will create a new string with the following value "YYY".
	 * </p>
	 *  <p>
	 * Third, the method extracts the first two characters from s3 if the length is greater than or equal to 2;
	 *  otherwise, the method uses a single character from s3. After extracting the characters from s3, 
	 *  the method creates five copies of the extracted characters. 
	 *  For example, if s3 is "Hello", then the method will create a new string with 
	 *  the following value "HeHeHeHeHe". 
	 *  If s3 is "A", the method will create a new string with the following value "AAAAA".
	 *  </p>
	 *  <p>
	 *  The method returns a string 
	 *  after concatenating the result from the first, second and third steps. 
	 *  See the below examples
	 *  </p> 
	 *   <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * If s1 = "York" , s2 = "Hello", s3 = "Time", return "YolololoTiTiTiTiTi"
	 * If s1 = "EECS-York" , s2 = "Hello EECS1022", s3 = "Lab Time", return "EECS-222222LaLaLaLaLa"
	 * If s1 = "W" , s2 = "A", s3 = "B",  return "WAAABBBBB"
	 * If s1 = "" , s2 = "Sunday", s3 = "Monday", return "Invalid"
	 * 
	 * </pre>
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param s1 Input String 
	 * @param s2 Input String 
	 * @param s3 Input String 
	 * @return  string value, see above examples
	 */
	
	
	public static String mixStrings(String s1, String s2, String s3) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
//		for (int length1 = s1.length(); ;) {
//			if (length1 == 0) {
//				return "Invalid";
//			} else if (length1 % 2 == 0) {
//				int halfLength1 = length1 /2;
//				String halfString= s1.substring(0, halfLength1);
//				return String.format("%d", halfString);
//			}else {
//				if (length1 % 2 != 0);
//				int halfLength1 = length1 /2;
//				String halfString= s1.substring(0, halfLength1+1);
//				return String.format("%d", halfString);
//						
//				}}
//		for (int length2 = s2.length();;)
//			if (length2 == 0) {
//				return "Invalid"; 
//		 }else if (length2 >= 2) {
//				String lastTwo = s2.substring(length2 - 2);
//				return String.format("%d"+"%d"+"%d", lastTwo,lastTwo,lastTwo);
//		 } else {
//			 if (length2 == 1) {
//				 return s2+s2+s2;
//			 }
//		 
//		
//		for(int length3 = s3.length(); ;) {
//			if (length3 == 0) {
//				return "Invalid"; 
//		} else if (length3 >= 2) {
//			String result = " ";
//			result +=  s3.substring(0,2);
//			return String.format("%d"+"%d"+"%d"+"%d"+"%d", result, result, result, result, result);
//		}else {
//			if (length3 == 1 ) {
//				return s3+s3+s3+s3+s3;
//			}
//		}
//		
//}
//		return s1+s2+s3;
//		 }
//		
//		
		    int length1 = s1.length();
		    int length2 = s2.length();
		    int length3 = s3.length();

		    if (length1 == 0 || length2 == 0 || length3 == 0) {
		        return "Invalid";
		    }

		    String result = "";

		    if (length1 % 2 == 0) {
		        int halfLength1 = length1 / 2;
		        String halfString = s1.substring(0, halfLength1);
		        result += halfString;
		    } else {
		        int halfLength1 = length1 / 2;
		        String halfString = s1.substring(0, halfLength1 + 1);
		        result += halfString;
		    }

		    if (length2 >= 2) {
		        String lastTwo = s2.substring(length2 - 2);
		        result += lastTwo + lastTwo + lastTwo;
		    } else {
		        result += s2 + s2 + s2;
		    }

		    if (length3 >= 2) {
		        String firstTwo = s3.substring(0, 2);
		        result += firstTwo + firstTwo + firstTwo + firstTwo + firstTwo;
		    } else {
		        result += s3 + s3 + s3 + s3 + s3;
		    }

		    return result;
		}


	/**
	 * Implement a static method that receives the length of the three triangle sides 
	 * as an integer value and returns a String datatype as an output.
	 * <p>The method tests the input values for the triangle sides and 
	 * then determines the type of the triangle as equilateral, isosceles, or scalene
	 * Note: if any input value is less than or equal to zero, the method returns "Unknown". </p>
	 *  <p>
	 *  For example:
	 * </p>
	 * 
	 * <pre>
	 * If side1 = 10 , side2 = 22, side3 = 22, return "isosceles"
	 * If side1 = 3 , side2 = 3, side3 = 3, return "equilateral"
	 * If side1 = 3 , side2 = 3, side3 = 7,  return "Unknown"
	 * If side1 = 4 , side2 = 3, side3 = 5, return "scalene"
	 * 
	 * </pre>
	 * 
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param side1 int value 
	 * @param side2 int value
	 * @param side3 int value
	 * @return string value, see above examples
	 */
	
	
	public static String triangleType(int side1, int side2, int side3) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		 if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
		        return "Unknown";
		    } else if (side1 == side2 && side2 == side3) {
		        return "equilateral";
		    } else if (side1 == side2 || side2 == side3 || side3 == side1) {
		        return "isosceles";
		    } else {
		        return "scalene";
		    }
	}
	
	

	
	/**
	 * Write a static method that receives a short value that can be stored in 16 bits and
	 * then convert this input value to 16 bits binary representation. The method
	 * returns the string value representing the binary value in 16 bits equivalent to the
	 * input value.
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if value=15 then return "The decimal value (15) has binary representation [0000000000001111]"
	 * if value=145 then return "The decimal value (145) has binary representation [0000000010010001]"
	 * if value=255  then return "The decimal value (205) has binary representation [0000000011001101]"
	 * 
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param value input integer value of type short
	 * @return String value represent binary value in 16 bits. See example above
	 * 
	 *         <p>
	 *         <strong> Precondition </strong> :   value is non-negative values
	 *         </p>
	 * 
	 * 
	 */

	public static String binaryRepresentation(short value) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		StringBuilder binary = new StringBuilder();
	    for (int i = 15; i >= 0; i--) {
	        binary.append((value >> i) & 1);
	    }
	    return String.format("The decimal value (%d) has binary representation [%s]", value, binary.toString());
		}


	
	/**
	 * Write a static method that receives two short values that can be stored in 16 bits 
	 * and then return their binary xor operation/logic. 
	 * It will help if you make sure the input values 
	 * are converted to binary representation (16 bits) 
	 * before performing the xor operation. If you want, 
	 * you can use <strong><code>binaryRepresentation</code></strong> method 
	 * that you should implement in this lab.  
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 *  
	 * if value1=12  and value2 = 15, then return "XOR of two values is [0000000000000011]"
	 * if value1=142  and value2 = 145, then return "XOR of two values is [0000000000011111]"
	 * if value1=82  and value2 = 255, then return "XOR of two values is [0000000010101101]"
	 * 
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param value1 input integer value of type short
	 * @param value2  input integer value of type short
	 * @return String value represents the xor operation of the input values in 16 bits. See the example above 
	 * 
	 *         <p>
	 *         <strong> Precondition </strong> :   value is non-negative values
	 *         </p>
	 * 
	 * 
	 */	
	public static String binaryXor(short value1 , short value2) {

		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		    StringBuilder binary1 = new StringBuilder();
		    StringBuilder binary2 = new StringBuilder();

		    for (int i = 15; i >= 0; i--) {
		        binary1.append((value1 >> i) & 1);
		        binary2.append((value2 >> i) & 1);
		    }

		    StringBuilder result = new StringBuilder("XOR of two values is [");
		    for (int s = 0; s < binary1.length(); s++) {
		        char bit1 = binary1.charAt(s);
		        char bit2 = binary2.charAt(s);
		        result.append(bit1 == bit2 ? '0' : '1');
		    }
		    result.append("]");

		    return result.toString();
		}




		

	        
	   
	    
		
	
	
	
	/**
	 * 
	 * Write a static method that counts the number of integers between a
	 * lower-limit integer and an upper-limit integer that are multiple of 3 or
	 * multiple of 5 or multiple 7.
	 * 
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if lowerLimit=0 and  upperLimit= 5 then return "Between (1) and (5) there are (1) multiple of 3, (1) multiple of 5 and (0) multiple of 7"
	 * if lowerLimit=10 and  upperLimit= 10 then return "Between (10) and (10) there are (0) multiple of 3, (1) multiple of 5 and (0) multiple of 7"
	 * if lowerLimit=10 and  upperLimit= 22 then return "Between (10) and (22) there are (4) multiple of 3, (3) multiple of 5 and (2) multiple of 7"
	 * if lowerLimit=7 and  upperLimit= 5 then return "Error: lower limit (7) is not less than or equal to upper limit (5)"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param lowerLimit lower limit integer value
	 * @param upperLimit upper limit integer value
	 * @return String value as shown in the examples above
	 * 
	 * 
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         lowerLimit and upperLimit are non-negative values and lowerLimit less than upperLimit
	 *         </p>
	 * 
	
	 */
	public static String countofMult357(int lowerLimit, int upperLimit) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		    if (lowerLimit > upperLimit) {
		        return "Error: lower limit (" + lowerLimit + ") is not less than or equal to upper limit (" + upperLimit + ")";
		    }

		    int countMultiple3 = getMultiplesCount(lowerLimit, upperLimit, 3);
		    int countMultiple5 = getMultiplesCount(lowerLimit, upperLimit, 5);
		    int countMultiple7 = getMultiplesCount(lowerLimit, upperLimit, 7);

		    return "Between (" + lowerLimit + ") and (" + upperLimit + ") there are (" + countMultiple3 + ") multiple of 3, (" + countMultiple5 + ") multiple of 5 and (" + countMultiple7 + ") multiple of 7";
		}

		private static int getMultiplesCount(int lowerLimit, int upperLimit, int divisor) {
		    int count = 0;
		    int start = lowerLimit + (divisor - lowerLimit % divisor) % divisor; 

		    if (start > upperLimit) {
		        return 0; 
		    }

		    count = (upperLimit - start) / divisor + 1; 

		    return count;
		}



	/**
	 * Write a static method named isPalindromeInt to determine
	 * if the given input <code>n</code> integer
	 * is a palindrome integer.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Palindrome"
	 * if n= 10  then  return "Integer 10 is NOT Palindrome"
	 * if n= 3635363 then  return "Integer 3635363 is Palindrome"
	 * if n= 121121  then  return "Integer 121121 is Palindrome"
	 * if n= 112545214 then return "Integer 112545214 is NOT Palindrome"
	 * </pre>
	 * 
	 * 
	 * @param n : int input value
	 * @return <code>n</code> is palindrome integer then return true. Otherwise,
	 *         return false
	 *  <p><strong> Precondition </strong></p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 */
	public static String isPalindromeInt(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int reversed = 0;
	    int original = n;

	    while (n != 0) {
	        int digit = n % 10;
	        reversed = reversed * 10 + digit;
	        n /= 10;
	    }

	    if (original == reversed) {
	        return "Integer (" + original + ") is Palindrome";
	    } else {
	        return "Integer (" + original + ") is NOT Palindrome";
	    }
	}

	
	

}
