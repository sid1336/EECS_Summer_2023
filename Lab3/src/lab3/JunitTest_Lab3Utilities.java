package lab3;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_Lab3Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test_01_01_() {
		final String str = "mystring123";
		int n = Lab3Utilities.digitCountinString(str);
		int expect = 3;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_02_() {
		final String str = "Test03 on Thursday 19-03";
		int n = Lab3Utilities.digitCountinString(str);
		int expect = 6;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_03_() {
		final String str = "mystring";
		int n = Lab3Utilities.digitCountinString(str);
		int expect = 0;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}
	@Test
	public void test_01_04_() {
		final String str = "EECS1021EECS1022";
		int n = Lab3Utilities.digitCountinString(str);
		int expect = 8;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}
	
	
	@Test
	public void test_02_01_() {
		final String n= "514abcd495";
		int  sum = Lab3Utilities.sumofDigitinString(n);
		int  expect = 28 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}

	@Test
	public void test_02_02_() {
		final String n= "123abcd1234";
		int  sum = Lab3Utilities.sumofDigitinString(n);
		int  expect = 16 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_02_03_() {
		final String n= "87159825ABC";
		int  sum = Lab3Utilities.sumofDigitinString(n);
		int  expect = 45 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_02_04_() {
		final String n= "ABC";
		int  sum = Lab3Utilities.sumofDigitinString(n);
		int  expect = 0 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_02_05_() {
		final String n= "u0t4u7t7u7t7ututu99";
		int  sum = Lab3Utilities.sumofDigitinString(n);
		int  expect = 50 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	
	@Test
	public void test_03_01_() {
		final String n= "11101110001";
		int  result = Lab3Utilities.lengthofMaxConsecutiveZeros(n);
		int  expect = 3 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	@Test
	public void test_03_02_() {
		final String n= "111000000001110001";
		int  result = Lab3Utilities.lengthofMaxConsecutiveZeros(n);
		int  expect = 8 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	@Test
	public void test_03_03_() {
		final String n= "11101";
		int  result = Lab3Utilities.lengthofMaxConsecutiveZeros(n);
		int  expect = 1 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	
	@Test
	public void test_03_04_() {
		final String n= "11100000000100000000000000000000000000000000";
		int  result = Lab3Utilities.lengthofMaxConsecutiveZeros(n);
		int  expect = 32 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	
	
	@Test
	public void test_04_01_() {
		final String str= "EECCCCCSSSLLLLLAB";
		char [] cleanstr = Lab3Utilities.removeDuplicatesChar(str).toCharArray();
		char []  expect = "ECSLAB".toCharArray();
		Arrays.sort(expect);
		Arrays.sort(cleanstr);
		String str1 = String.format("\nTest removeDuplicatesChar fail for %s. Returned ( %s ),"
				+ " but correct is ( %s )\n", str,Lab3Utilities.removeDuplicatesChar(str), "ECSLAB" );
		assertTrue(str1, Arrays.equals(cleanstr, expect));
	}
	
	@Test
	public void test_04_02_() {
		final String str= "0001110001001";
		char [] cleanstr = Lab3Utilities.removeDuplicatesChar(str).toCharArray();
		char []  expect = "01".toCharArray();
		Arrays.sort(expect);
		Arrays.sort(cleanstr);
		String str1 = String.format("\nTest removeDuplicatesChar fail for %s. Returned ( %s ),"
				+ " but correct is ( %s )\n", str,Lab3Utilities.removeDuplicatesChar(str), "01" );
		assertTrue(str1, Arrays.equals(cleanstr, expect ));
	}
	
	@Test
	public void test_04_03_() {
		final String str= "AAAABBBCCC";
		char [] cleanstr = Lab3Utilities.removeDuplicatesChar(str).toCharArray();
		char []  expect = "CBA".toCharArray();
		Arrays.sort(expect);
		Arrays.sort(cleanstr);
		String str1 = String.format("\nTest removeDuplicatesChar fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, Arrays.equals(cleanstr, expect));
	}
	
	
	@Test
	public void test_04_04_() {
		final String str= "000000";
		String cleanstr = Lab3Utilities.removeConsecutiveDuplicates(str);
		String  expect = "0" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}

	@Test
	public void test_04_05_() {
		final String str= "ccccvvvvvvaaaaaabbbcaaaa";
		String cleanstr = Lab3Utilities.removeConsecutiveDuplicates(str);
		String  expect = "cvabca" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}
	
	@Test
	public void test_04_06_() {
		final String str= "ECCCCCSSSSSLLLLLLLAAAAAAB";
		String cleanstr = Lab3Utilities.removeConsecutiveDuplicates(str);
		String  expect = "ECSLAB" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}

	@Test
	public void test_04_07_() {
		final String str= "YYYORKKKKKKKTTOOORONTO";
		String cleanstr = Lab3Utilities.removeConsecutiveDuplicates(str);
		
		String  expect = "YORKTORONTO" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}

	
	@Test
	public void test_05_01_() {
		final String str = "mystring123";
		int n = Lab3Utilities.whitespaceCountinString(str);
		int expect = 0;
		String error = String.format(
				"\nTest whitespaceCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n,
				expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_05_02_() {
		final String str = "I am EECS1022 Student";
		int n = Lab3Utilities.whitespaceCountinString(str);
		int expect = 3;
		String error = String.format(
				"\nTest whitespaceCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n,
				expect);
		assertTrue(error, expect == n);
	}
	
	@Test
	public void test_05_03_() {
		final String str = "AAAA BB B B EECS 1 0 2 2 S tudent";
		int n = Lab3Utilities.whitespaceCountinString(str);
		int expect = 10;
		String error = String.format(
				"\nTest whitespaceCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n,
				expect);
		assertTrue(error, expect == n);
	}
	
	
	@Test
	public void test_06_01_() {
		String inputStr = "bbbcfreb$b";
		String expected = "b3c1f1r1e1b1$1b1";
		String result = Lab3Utilities.compressString(inputStr);
		String error = String.format("error on compressString, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
				
	}
	
	@Test
	public void test_06_02_() {
		String inputStr = "bbbcffffreb$b";
		String expected = "b3c1f4r1e1b1$1b1";
		String result = Lab3Utilities.compressString(inputStr);
		String error = String.format("error on compressString, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
				
	}
	@Test
	public void test_06_03_() {
		String inputStr = "SHOWSHOWSHOWSHOWCASECASE";
		String expected = "S1H1O1W1S1H1O1W1S1H1O1W1S1H1O1W1C1A1S1E1C1A1S1E1";
		String result = Lab3Utilities.compressString(inputStr);
		
		String error = String.format("error on compressString, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
				
	}
	
	
}
