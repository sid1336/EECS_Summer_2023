package lab1;

public class Lab1Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	
	private Lab1Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	
	/**
	 *  
	 * Write a static method named weather that takes two integers as parameters representing a month and day.
	 * The month is specified as an integer between 1 and 12, such as 1 for January, 2 for February, etc.
	 * The day of the month is an integer between 1 and 31. 
	 * The method returns a String indicating the standard Toronto weather season for the given month and day.
	 * 
	 * If the date falls between November 12 and March 15,  the method should return  "The current weather season is Winter"
	 * If the date falls between March 16 and June 15, the method should return "The current weather season is Spring"
	 * If the date falls between June 16 and August 25, the method should return "The current weather season is Summer"
	 * if the date falls between August 26 and November 1, the method should return "The current weather season is Fall"
	 * Otherwise, return "Unknown".
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
    * 
	 *<p>
	 *Examples:
     * </p>
     *
     * <pre>
     * if month=1 and  day= 1 then return "The current weather season is Winter"
     * if month=11 and  day= 1 then return "The current weather season is Fall"
     * if month=11 and  day= 2 then return "Unknown"
     * if month=5 and  day= 2 then return "The current weather season is Spring"
     * </pre>
	 * <p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p> 
	 * 
	 * @param month  Positive integer between 1 and 12, such as 1 for January, 2 for February, etc. 
	 * @param day  Positive integer between 1 and 31
	 * @return String indicates the standard Toronto weather season for that month and day.
	 * <p>
     *     <strong> Precondition: </strong> month and day are non-negative values
     * </p>
	 */	
	public static String weather(int month, int day) {
		/* Your implementation of this method starts here.
	        * Recall that :
	        * 1. No System.out.println statements should appear here.
	        * 	  Instead, you need to return the result.
	        * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	        *    Instead, refer to the input parameters of this method.
	        */
		if ((month >= 11 && day >= 12) || ( month <= 3 && day <= 15) || month == 1 && day >= 1 || month ==2 && day >= 1) {
            return "The current weather season is Winter";
        } 
		else if ((month == 3 && day >= 16) || (month > 3 && month < 6) || (month == 6 && day <= 15)) {
            return "The current weather season is Spring";
        } 
		else if ((month == 6 && day >= 16) || (month > 6 && month < 8) || (month == 8 && day <= 15)) {
            return "The current weather season is Summer";
        } 
		else if ((month == 8 && day >= 16) || (month > 8 && month < 11) || (month == 11 && day <= 1)) {
            return "The current weather season is Fall";
        } 
		else {
            return "Unknown";
        }
    }

	
	
	   
	/**
	 * Write a static method name  temperature that converts a Fahrenheit degree to Celsius using the
	 * formula celsius = (5/9) (fahrenheit - 32).
	 *
	 * The method receives temperature degrees in Fahrenheit and returns string
	 * value as shown below in the examples. The celsius degree is rounded to two
	 * decimal points.
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if fahrenheit=100.0 then return "Fahrenheit (100.0) is equivalent to (37.78) in Celsius"
	 * if fahrenheit=10.0 then return "Fahrenheit (10.0) is equivalent to (-12.22) in Celsius"
	 * if fahrenheit=49.0 then return "Fahrenheit (49.0) is equivalent to (9.44) in Celsius"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param fahrenheit input temperature value as double
	 * @return string value, see above examples
	 */
   
	public static String temperature(double fahrenheit) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double celsius = (fahrenheit - 32) * 5.0/9;
		double roundedCelsius = Math.round(celsius * 100) / 100.0;
		

		return String.format("Fahrenheit (%.1f) is equivalent to (%.2f) in Celsius", fahrenheit, roundedCelsius);
	}

	/**
	 * Write a static method name age in years that takes the age in days and then calculates the age
	 * in years and remaining days. Assume there are 365 days in a year. The method
	 * return string value as shown in the examples below
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if days=7000  then return "Age in days (7000), age in years is (19) with remaining days (65)"
	 * if days=1900 then return "Age in days (1900), age in years is (5) with remaining days (75)"
	 * if days=8016 then return "Age in days (8016), age in years is (21) with remaining days (351)"
	 * </pre>
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param days input days value as int value
	 * @return String value as shown in the examples above
	 */

	public static String ageinyears(int days) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int day = (days) / 365;
//		int daydecimal = (days * 1000) / 365;
//		int remainingdays = (daydecimal/1000) - day;
//		int remainingdaysinyears = Math.round(remainingdays * 365);
		int remainingdays = days % 365;
		 return String.format("Age in days (%d), age in years is (%d) with remaining days (%d)" , days, day , remainingdays);
	}
	
	
	
	/**
	 * Implement the method that converts centimetres to an integral number of feet
	 * and any remaining inches. The method receives the centimetres as double data
	 * type and returns string value as shown in the examples below. Note that the
	 * remaining inches value is rounded to two decimal points.
	 * 
	 * <p>
	 * You need the following facts to complete the implementation of this method.
	 * There are 12 inches in a foot and one inch is 2.54 centimetres.
	 * 
	 * </p>
	 * 
	 * *
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if cm=157.0 then return "157.00cm is 5ft and 1.81in"
	 * if cm=57.15 then return "57.15cm is 1ft and 10.50in"
	 * if cm=37.0 then return "37.00cm is 1ft and 2.57in"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param cm double value of centimetres
	 * @return String value as shown above
	 */

	public static String convertDistance(double cm) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int feet = (int) (cm / 30.48);
	    double inches = ((cm / 30.48) - feet) * 12;
	    return String.format("%.2fcm is %dft and %.2fin", cm, feet, inches);
	}

	
	/**
	 * Implement the method that takes in two numbers as input arguments: an account
	 * balance (rounded to two decimal points) and an annual interest rate expressed
	 * as a percentage. The method return string indicated the balance after five
	 * years have elapsed. The return balance after five years should be rounded to
	 * two decimal points See examples below. Note that the interest from the first
	 * year is added back to the bank balance and is, therefore, itself subject to
	 * interest in the second year, and so on.
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if balance=6000.00 and interest=4.25 then return "The balance was 6000.00 with interest 4.25, after five years balance is  7388.08"
	 * if balance=3000.00 and interest=3.50 then return "The balance was 3000.00 with interest 3.50, after five years balance is  3563.06"
	 * if balance=4000.00 and interest=2.25 then return "The balance was 4000.00 with interest 2.25, after five years balance is  4470.71"
	 * </pre>
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param balance  : input balance
	 * @param interest : an annual interest rate expressed as a percentage. rounded
	 *                 to two decimal points
	 * @return String value as shown in the examples above
	 */

	public static String fiveyearbalance(double balance, double interest) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double principal = balance;
	    double rate = interest / 100;
	    int years = 5;

	    double futureBalance = principal * Math.pow(1 + rate, years);
	    futureBalance = Math.round(futureBalance * 100) / 100.0;

	    String result = String.format("The balance was %.2f with interest %.2f, after five years balance is  %.2f", balance, interest, futureBalance);
	    return result;
	}

	
	/**
	 * Implement the following method, which receives a weight in pounds and a
	 * height in feet and inches for any given person, and returns the person's body
	 * mass index (BMI) rounded to 2 decimal place.
	 * 
	 * Note: the height of a person is represented in both feet and inches input
	 * parameters. So, if person has height is 10 feet and 15 inches then feet input
	 * parameter will be 10 and inches input parameter will be 15.
	 * 
	 * You must convert the weight in pounds into kilograms by using the following
	 * conversion rate: <strong>1 pound is equal to 0.453592 kilograms.</strong> You
	 * must convert the height in feet and inches into metres by using the following
	 * conversion rates: <strong>1 foot is equal to 0.3048 metre, and 1 inch is
	 * equal to 0.0254 metre.</strong> Given a weight in kilograms <i>w</i> and a
	 * height in metres <i>h</i>, the BMI is <i>w</i> / <i>h</i><sup>2</sup>.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if pounds=75, feet=15  and inches=45  then  return 1.04
	 * if pounds=80, feet=13  and inches=45  then  return 1.39
	 * if pounds=135, feet=7  and inches=45 then  return  5.7
	 * </pre>
	 * 
	 * @param pounds  : int input value for weight in pounds
	 * @param feet    : int input value for height in feet, should be used with
	 *                inches input
	 * @param inches: int input value for height in inches
	 * @return the person's body mass index (BMI) rounded to 2 decimal place.
	 */

	public static double getBMI(int pounds, int feet, int inches) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double weight = pounds * 0.453592;
		double height = (feet * 0.3048) + (inches * 0.0254);
		double BMI = weight / (height * height);
	    return BMI;
}

	/**
	 * Returns the maximum number of complete revolutions equivalent to a number of
	 * degrees not greater than the given number of degrees (there are 360 degrees
	 * in one revolution). For example:
	 * 
	 * <pre>
	 * numRevolutions(0)    returns 0
	 * numRevolutions(1)    returns 0
	 * numRevolutions(360)  returns 1
	 * numRevolutions(719)  returns 1
	 * numRevolutions(720)  returns 2
	 * numRevolutions(800)  returns 2
	 * </pre>
	 * 
	 * @param degrees a number of degrees not less than zero
	 * @return the maximum number of complete revolutions not greater than the given
	 *         number of degrees
	 */
	public static long numRevolutions(long degrees) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		long revolutions = Math.abs(degrees)/360;
		
		 return revolutions;
	}

	/**
	 * Returns the number of degrees on a circle that is equivalent to the given
	 * number of degrees. The returned value is always between 0 and 359 degrees,
	 * inclusive. For example:
	 * 
	 * <pre>
	 * fixAngle(0)    returns 0
	 * fixAngle(1)    returns 1
	 * fixAngle(359)  returns 359
	 * fixAngle(360)  returns 0
	 * fixAngle(700)  returns 340
	 * fixAngle(720)  returns 0
	 * fixAngle(725)  returns 5
	 * </pre>
	 * 
	 * @param degrees a number of degrees not less than zero
	 * @return the number of degrees on a circle that is equivalent to the given
	 *         number of degrees
	 */
	public static int fixAngle(long degrees) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		if ((degrees >= 0) && (degrees <= 359)) {
			int fixAngle = (int)degrees;
			return fixAngle;
		}else if (degrees == 360) {
			int fixAngle = 0;
			return fixAngle;
		}else {
			int fixAngle = (int)degrees % 360;
			return fixAngle;
		}
			
	}

	/**
	 * Implement the method compute the mathematical average of 3 values. and return
	 * string value as shown in the examples below the average value should be
	 * rounded to two decimals.
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if a=1, b=2  and c=5  then  return "Average of (1, 2, 5) is 2.67"
	 * if a=4, b=3  and c=5  then  return "Average of (4, 3, 5) is 4.00"
	 * if a=11, b=26  and c=5 then  return  "Average of (11, 26, 5) is 14.00"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param a : int input value
	 * @param b : int input value
	 * @param c : int input value
	 * @return String value as shown above
	 */
	public static String avg(int a, int b, int c) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
//		double average = (a + b + c) / 3.0;
//		return String.format("Average of %d, %d, %d is %d", a, b,c, average);
		double average = (a + b + c) / 3.0;
	    String result = String.format("%.2f", average);
	    return "Average of (" + a + ", " + b + ", " + c + ") is " + result;
	}

	

}
