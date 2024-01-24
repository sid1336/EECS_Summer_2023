package lab3;
import java.util.Arrays;

public class Lab3Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	
	private Lab3Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	/**
	 * 
	 * Implement the method below that takes String <code>str</code> as the input
	 * argument and returns the number of digits in the given input String. Digit is
	 * any integer between <code>0</code> and <code>9</code>.
	 * <p>
	 * <strong> You can assume that the input String is not null and has length
	 * equal to 1 (at least one character).</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *  if str = "mystring123"  then return 3
	 *  if str = "123mystring123" then return 6
	 *  if str = "123my25str047ing123" then return 11
	 * </pre>
	 * 
	 * You will need a loop, <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. 
	 * 
	 * 
	 * 
	 * @param str : input string
	 * @return Number of digits in the given input String
	 */

	public static int digitCountinString(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int counter = 0;
		int length = str.length();
		for (int i = 0; i < length; i++) {
		    char c = str.charAt(i);
		    if (Character.isDigit(c)) {
		        counter++;
		    }
		}
		return counter;
	}

	/**
	 * Implement the method below that takes a String <code>str</code> as an input
	 * argument and returns a string after removing all duplicate
	 * characters from the input string.
	 * <p>
	 * The order of characters in the returned string is <strong>
	 * unimportant</strong>, so the strings "ECSLAB" and "CELABS" are same.
	 * </p>
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 2 two characters.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if str = "EECCCCCSSSLLLLLAB"  then return "ABCELS"
	 * if str = "0001110001001" then return "01"
	 * if str = "cvvvvaaabcca" then return "abcv"
	 * if str = "LabTtttEeeeSsssT" then return "ELSTabest"
	 * </pre>
	 * 
	 * @param str : input string
	 * @return String after removing all  duplicates characters from the
	 *         input string
	 */

	public static String removeDuplicatesChar(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
//		StringBuilder result= new StringBuilder();
//		String result1 = "";
//		int counter = 0;
//
//		for (int i = 0; i < str.length(); ) {
//		    char c = str.charAt(i);
//		    for (int j = 0; i < str.length(); i++) {
//		    	char ch = str.charAt(j);{
//		    		if  (c == ch) {
//		    			result1 = (String) (str - c);
//		    		}
//		        counter++;
//		    }
//		}
//		return result.toString();}
//	}
//		String[] array  = {};
//		int counter = 0;
//		
//		for (int i = 0; i < str.length(); ) {
//			char[] c = {str.charAt(i)};
//			for (int j = 0; i < str.length(); ) {
//				char[] ch = {str.charAt(j)};
//				if (c == ch);
//				return array[ch[]-c[]];
//			}
//			}
//				
//		}
	String[] array = new String[str.length()];
    int counter = 0;

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        boolean isDuplicate = false;

        for (int j = 0; j < counter; j++) {
            if (array[j].equals(String.valueOf(c))) {
                isDuplicate = true;
                break;
            }
        }

        if (!isDuplicate) {
            array[counter++] = String.valueOf(c);
        }
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < counter; i++) {
        result.append(array[i]);
    }

    return result.toString();
}
	






	  
	/**
	 * Implement the method below that takes a String <code>str</code> as input
	 * argument and returns sum of digits in the given input String. Digits is any
	 * integer between <code>0</code> and <code>9</code>.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "123abcd45"  then return 15
	 * 	if str = "abcd1234" then return 10
	 * 	if str = "159825ABC" then return 30
	 * 	if str = "10125ABC" then return 9
	 * </pre>
	 * 
	 * @param str : input string
	 * @return returns sum of digits in the given input String
	 */

	public static int sumofDigitinString(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
//		String[] array = new String[str.length()];
//		int result = (0);
	    int counter = 0;

	    for (int i = 0; i < str.length(); i++) {
	        char c =  str.charAt(i);
//	        if (i == (int)(i));{
//	        	counter = Math.addExact(i,i++);
//	        	counter += c;
	        if (c >= '0' && c <= '9') {
	            int digit = c - '0';
	            counter += digit;
	        }
	        }
	        
		return counter;
	}

	/**
	 * Implement the method below that takes binary String <code>str</code> as
	 * input argument and returns the length of maximum consecutive 0's in a given
	 *  binary input string.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "11101110001"  then return 3
	 * 	if str = "10000001001" then return 6
	 * 	if str = "0000100111" then return 4
	 * 	if str = "01001010100111" then return 2
	 * </pre>
	 * 
	 * @param str : input binary string
	 * @return returns the length of maximum consecutive 0's in a given  binary input
	 *         string.
	 */
	public static int lengthofMaxConsecutiveZeros(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int maxZeros = 0;
		int currentStreak= 0;

	    for (int i = 0; i < str.length(); i++) {
	        char c =  str.charAt(i);
	        if (c == '0') {
	            currentStreak++;
	            maxZeros = Math.max(maxZeros, currentStreak);
	        } else {
	            currentStreak = 0;
	        }
	    }

	    return maxZeros;}

	/**
	 * Implement the method below that takes string <code>str</code> as the input
	 * argument and returns the string after removing all consecutive duplicate
	 * characters from the input string. The order of characters in the returned
	 * string is <strong> important</strong>, so the strings "ECSLAB" and "CELABS"
	 * are different.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 2 two characters.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "EECCCCCSSSLLLLLAB"  then return "ECSLAB"
	 * 	if str = "0001110001001" then return "010101"
	 * 	if str = "cvvvvaaabcca" then return "cvabca"
	 * 	if str = "LabTtttEeeeSsssT" then return "LabTtEeSsT"
	 * </pre>
	 * 
	 * @param str : input String 
	 * @return string after removing all consecutive duplicates
	 * characters from the input string.
	 */
	public static String removeConsecutiveDuplicates(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		StringBuilder result = new StringBuilder();
	    
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        
	       
	        if (i == 0 || c != str.charAt(i - 1)) {
	            result.append(c);
	        }
	    }
	    
	    return result.toString();
	}
	

	
	/**
	 * 
	 * Implement the method below that takes string  <code>str</code> as
	 *  the input argument and returns the number of whitespace in the given input String. 
	 *   Whitespace can be  spaces or  tabs.
	 *   <p> <strong> You can assume that the input String is not null and contains at least 1 one character.</strong></p>
	 *   <p> For example: </p>
	 *   <pre>
	 *   if str = "I am EECS1022 Student" then return 3
	 *   if str = "I am EECS 1022 Student" then return 4
	 *   if str = " I am E E C S 1 0 2 2 Student" then return 11
	 *   </pre>
	 *   You will need a loop.<strong>your loop must not execute more iterations 
	 *   than necessary, and you cannot use break or continue</strong>.
	 *   <strong>Make sure the method compiles without errors and returns the correct result when invoked.</strong>
	 * 
	 * 
	 * @param str input string 
	 * @return number of whitespaces in the given input String.
	 */
	
	public static int whitespaceCountinString(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int count = 0;
	    
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        
	       
	        if (c == ' ' || c == '\t') {
	            count++;
	        }
	    }
	    
	    return count;
	}
		
	

	
	/** 
	 * <p> Write a compressString  method that 
	 *  compresses long String {@code str} containing many adjacent equal characters
	 * (but no digits).  
	 *  <p> For example: </p>
	 *   
	 *  <pre>
	 *  
	 *  compressString("")  return "" , empty string 
	 *  compressString("bbbcfreb$b") return  "b3c1f1r1e1b1$1b1"
	 *  compressString("bbbrrraaaaaazzzz") return  "b3r3a6z4"
	 *  
	 *  </pre>
	 *  
	 *   	
	 * @param inputStr :
	 * 			string to be compressed, {@code str} is not null
	 * @pre.  
	 * 		Precondition: s does not contain a digit in '0'.. '9'. 
	 * @return
	 * 		the compressed version of the long string, as explained above
	 *  	
	 *  
	 * 
	 *
	 */

    public static String compressString(String inputStr) {
    	/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
    	if (inputStr.isEmpty()) {
            return "";
        }

        StringBuilder compressedStr = new StringBuilder();
        int count = 1;

        for (int i = 1; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);
            char previousChar = inputStr.charAt(i - 1);

            if (currentChar == previousChar) {
                count++;
            } else {
                compressedStr.append(previousChar).append(count);
                count = 1;
            }
        }

        compressedStr.append(inputStr.charAt(inputStr.length() - 1)).append(count);

        return compressedStr.toString();
    }

	
}
