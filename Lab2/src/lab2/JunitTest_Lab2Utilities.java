package lab2;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_Lab2Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test_01_01_() {
		final int x = 2;
		final int y =10;
		int result = Lab2Utilities.getRandomNumber(x,y);
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}

	
	@Test
	public void test_01_02() {
		final int x = 5;
		final int y =7;
		int result = Lab2Utilities.getRandomNumber(x,y);
		Integer[] array = {5,6,7};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	@Test
	public void test_01_03() {
		final int x = 10;
		final int y =15;
		int result = Lab2Utilities.getRandomNumber(x,y);
		Integer[] array = {10,11,12,13,14,15};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	@Test
	public void test_01_04() {
		final int x = 2;
		final int y =7;
		int result = Lab2Utilities.getRandomNumber(x,y);
		Integer[] array = {2,3,4,5,6,7};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct is ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	
	@Test
	public void test_01_05() {
		final int x = 0;
		final int y =10;
		int result = Lab2Utilities.getRandomNumber(x,y);
		Integer[] array = {0,1,2,3,4,5,6,7,8,9,10};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	
	
	@Test
	public void test_02_01_() {
		final int x = 2;
		final int y =9;
		final int n =2;

		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		int expectedlength = 6;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_02_02_() {
		final int x = 20;
		final int y =30;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);

		
		int expectedlength = 20;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {20,21,22,23,24,25,26,27,28,29,30};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_02_03_() {
		final int x = 2;
		final int y =7;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		int expectedlength = 15;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {2,3,4,5,6,7};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	@Test
	public void test_02_04_() {
		final int x = 3;
		final int y =8;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		
		int expectedlength = 15;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {3,4,5,6,7,8};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	@Test
	public void test_02_05_() {
		final int x = 13;
		final int y =18;
		final int n =5;
		String result = Lab2Utilities.stringOfRandomInt(n,x,y);
		
		int expectedlength = 20;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {13,14,15,16,17,18};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	
	@Test
	public void test_03_01_() {
		final int n = 16;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 16 is Perfect Square", result);
	}
	@Test
	public void test_03_02_() {
		final int n = 25;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 25 is Perfect Square", result);
	}
	@Test
	public void test_03_03_() {
		final int n = 64;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 64 is Perfect Square", result);
	}
	
	@Test
	public void test_03_04_() {
		final int n = 0;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 0 is Perfect Square", result);
	}
	@Test
	public void test_03_05_() {
		final int n = 100;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 100 is Perfect Square", result);;
	}
	@Test
	public void test_03_06_() {
		final int n = 99;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 99 is NOT Perfect Square", result);;
	}
	@Test
	public void test_03_07_() {
		final int n = 7;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 7 is NOT Perfect Square", result);;
	}
	
	@Test
	public void test_03_08_() {
		final int n = 11;
		String result = Lab2Utilities.isPerfectSquare(n);
		
		assertEquals("Integer 11 is NOT Perfect Square", result);;
	}
	
	
	
	@Test
	public void test_04_01_() {
		String s1 = "Friday" , s2 = "Sunday",  s3 = "Monday";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("FriayayayMoMoMoMoMo", result);
	}

	
	@Test
	public void test_04_02_() {
		String s1 = "" , s2 = "Sunday",  s3 = "Monday";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("Invalid", result);
	}
	@Test
	public void test_04_03_() {
		String s1 = "Hello" , s2 = "B",  s3 = "AB";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("HelBBBABABABABAB", result);
	}
	
	@Test
	public void test_04_04_() {
		String s1 = "EECS1022" , s2 = "Student",  s3 = "Lab";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("EECSntntntLaLaLaLaLa", result);
	}
	
	@Test
	public void test_04_05_() {
		String s1 = "EECS-1022" , s2 = "EECS-Student",  s3 = "TimeLab";
		String result = Lab2Utilities.mixStrings(s1, s2, s3);
		
		assertEquals("EECS-ntntntTiTiTiTiTi", result);
	}
	
	
	@Test
	public void test_05_01_() {
		int s1 = 9, s2 = 5,  s3 = 8;
		String result = Lab2Utilities.triangleType(s1, s2, s3);
		
		assertEquals("scalene", result);
	}
	@Test
	public void test_05_02_() {
		int s1 = 9, s2 = 9,  s3 = 8;
		String result = Lab2Utilities.triangleType(s1, s2, s3);
		
		assertEquals("isosceles", result);
	}
	
	@Test
	public void test_05_03_() {
		int s1 = 9, s2 = 9,  s3 = 9;
		String result = Lab2Utilities.triangleType(s1, s2, s3);
		
		assertEquals("equilateral", result);
	}
	
	@Test
	public void test_05_04_() {
		int s1 = 9, s2 = -9,  s3 = 9;
		String result = Lab2Utilities.triangleType(s1, s2, s3);
		
		assertEquals("Unknown", result);
	}
	
	
	
	
	@Test
	public void test_06_01_() {
		short x=122;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (122) has binary representation [0000000001111010]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_02_() {
		short x=102;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (102) has binary representation [0000000001100110]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_06_03_() {
		short x=204;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (204) has binary representation [0000000011001100]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_04_() {
		short x=4;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (4) has binary representation [0000000000000100]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	@Test
	public void test_06_05_() {
		short x=0;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (0) has binary representation [0000000000000000]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_06_() {
		short x=127;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (127) has binary representation [0000000001111111]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_06_07_() {
		short x=511;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (511) has binary representation [0000000111111111]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}

	@Test
	public void test_06_08_() {
		short x=1024;
		String result= Lab2Utilities.binaryRepresentation(x);
		String expect = "The decimal value (1024) has binary representation [0000010000000000]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_07_01_() {
		int x=150, y=156;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (150) and (156) there are (3) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_02_() {
		int x=150, y=156;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (150) and (156) there are (3) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_07_03_() {
		int x=5, y=25;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (5) and (25) there are (7) multiple of 3, (5) multiple of 5 and (3) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_04_() {
		int x=1, y=4;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (1) and (4) there are (1) multiple of 3, (0) multiple of 5 and (0) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_07_05_() {
		int x=41, y=24;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Error: lower limit (41) is not less than or equal to upper limit (24)";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_07_06_() {
		int x=10, y=50;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (10) and (50) there are (13) multiple of 3, (9) multiple of 5 and (6) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_07_() {
		int x=51, y=61;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (51) and (61) there are (4) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_07_08_() {
		int x=75, y=85;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (75) and (85) there are (4) multiple of 3, (3) multiple of 5 and (2) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_07_09_() {
		int x=91, y=104;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (91) and (104) there are (4) multiple of 3, (2) multiple of 5 and (2) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_07_10_() {
		int x=401, y=524;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Between (401) and (524) there are (41) multiple of 3, (24) multiple of 5 and (17) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_07_11_() {
		int x=401, y=324;
		String result= Lab2Utilities.countofMult357(x,y);
		String expect = "Error: lower limit (401) is not less than or equal to upper limit (324)";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	@Test
	public void test_08_01_() {
		final int n = 16;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (16) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	
	
	@Test
	public void test_08_02_() {
		final int n = 161;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (161) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);
	
	}
	@Test
	public void test_08_03_() {
		final int n = 1006001;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1006001) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	@Test
	public void test_08_04_() {
		final int n = 1230603201;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1230603201) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);

	}

	
	@Test
	public void test_08_05_() {
		final int n = 76176;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (76176) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	
	
	@Test
	public void test_08_06_() {
		final int n = 1856851;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1856851) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);
	
	}
	@Test
	public void test_08_07_() {
		final int n = 1236321;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1236321) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	@Test
	public void test_08_08_() {
		final int n = 1600061;
		String  result = Lab2Utilities.isPalindromeInt(n);
		String expect = "Integer (1600061) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);

	}
	
	
	@Test
	public void test_09_01_() {
		short v1=122;
		short v2 = 15;
		
		String result= Lab2Utilities.binaryXor(v1, v2);
		
		String expect = "XOR of two values is [0000000001110101]";
		String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				v1,v2, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_09_02_() {
		short v1=12;
		short v2 = 127;
		
		String result= Lab2Utilities.binaryXor(v1, v2);
		
		String expect = "XOR of two values is [0000000001110011]";
		String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				v1,v2, result, expect);
	
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_09_03_() {
		short v1=255;
		short v2 = 127;
		
		String result= Lab2Utilities.binaryXor(v1, v2);
		
		String expect = "XOR of two values is [0000000010000000]";
		String str = String.format("\nTest binaryXor fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				v1,v2, result, expect);
	
		assertEquals(str, expect,result);		
	}
	
	
}
