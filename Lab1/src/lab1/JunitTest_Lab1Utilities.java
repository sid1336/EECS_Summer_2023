package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_Lab1Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test_00_00_() {
		int m = 1, d =1;
		String result = Lab1Utilities.weather(m, d);
		
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_01_() {
		int m = 2, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	
	@Test
	public void test_00_03_() {
		int m = 5, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Spring";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_04_() {
		int m = 9, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Fall";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_05_() {
		int m = 10, d =15;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Fall";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_06_() {
		int m = 1, d =30;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_07_() {
		int m = 2, d =20;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Winter";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	
	@Test
	public void test_00_08_() {
		int m = 4, d =16;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Spring";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	@Test
	public void test_00_09_() {
		int m = 7, d =14;
		String result = Lab1Utilities.weather(m, d);
		String expect = "The current weather season is Summer";
		String str = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                m, d, result, expect);
		
		assertEquals(str, expect, result);
	}
	
	@Test
	public void test_02_00_() {
		int x=100;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (100.0) is equivalent to (37.78) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_02_01_() {
		int x=10;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (10.0) is equivalent to (-12.22) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_02_02_() {
		int x=150;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (150.0) is equivalent to (65.56) in Celsius";
		String str = String.format("\nTest temperature fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_02_03_() {
		int x=50;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (50.0) is equivalent to (10.00) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	@Test
	public void test_02_04_() {
		int x=15;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (15.0) is equivalent to (-9.44) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	@Test
	public void test_02_05_() {
		int x=25;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (25.0) is equivalent to (-3.89) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	@Test
	public void test_02_06_() {
		int x=35;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (35.0) is equivalent to (1.67) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	@Test
	public void test_02_07_() {
		int x=95;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (95.0) is equivalent to (35.00) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	@Test
	public void test_02_08_() {
		int x=75;
		String result= Lab1Utilities.temperature(x);
		String expect = "Fahrenheit (75.0) is equivalent to (23.89) in Celsius";
		String str = String.format("\nTest temperature fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);
	}
	
	
	@Test
	public void test_03_00_() {
		int  x=7000;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (7000), age in years is (19) with remaining days (65)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_01_() {
		int  x=17000;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (17000), age in years is (46) with remaining days (210)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_02_() {
		int  x=37000;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (37000), age in years is (101) with remaining days (135)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_03_() {
		int  x=3650;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (3650), age in years is (10) with remaining days (0)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_04_() {
		int  x=3750;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (3750), age in years is (10) with remaining days (100)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_05_() {
		int  x=3850;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (3850), age in years is (10) with remaining days (200)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_03_06_() {
		int  x=4850;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (4850), age in years is (13) with remaining days (105)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_03_07_() {
		int  x=5850;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (5850), age in years is (16) with remaining days (10)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_03_08_() {
		int  x=7850;
		String result= Lab1Utilities.ageinyears(x);
		String expect = "Age in days (7850), age in years is (21) with remaining days (185)";
		String str = String.format("\nTest ageinyears fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_04_01_() {
		double x=157;
		String result= Lab1Utilities.convertDistance(x);
		String expect = "157.00cm is 5ft and 1.81in";
		String str = String.format("\nTest convertDistance fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_04_02() {
		double x=57;
		String result= Lab1Utilities.convertDistance(x);
		String expect = "57.00cm is 1ft and 10.44in";
		String str = String.format("\nTest convertDistance fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_04_03() {
		double x=37;
		String result= Lab1Utilities.convertDistance(x);
		String expect = "37.00cm is 1ft and 2.57in";
		String str = String.format("\nTest convertDistance fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_04_04() {
		double  x=307.51;
		String result= Lab1Utilities.convertDistance(x);
		String expect = "307.51cm is 10ft and 1.07in";
		String str = String.format("\nTest convertDistance fail for (%.2f)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
//		assertEquals(expect,result);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_05_01() {
		double x=6000.0, y = 4.25;
		String result= Lab1Utilities.fiveyearbalance(x,y);
		String expect = "The balance was 6000.00 with interest 4.25, after five years balance is  7388.08";
		String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_02() {
		double x=3000.0, y = 3.5;
		String result= Lab1Utilities.fiveyearbalance(x,y);
		String expect = "The balance was 3000.00 with interest 3.50, after five years balance is  3563.06";
		String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_05_03() {
		double x=4000.0, y = 2.25;
		String result= Lab1Utilities.fiveyearbalance(x,y);
		String expect = "The balance was 4000.00 with interest 2.25, after five years balance is  4470.71";
		String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_05_04() {
		double x=1000.0, y = 2.25;
		String result= Lab1Utilities.fiveyearbalance(x,y);
		String expect = "The balance was 1000.00 with interest 2.25, after five years balance is  1117.68";
		String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
	
		assertEquals(str, expect,result);		
	}
	
	
	@Test
	public void test_06_01() {
		int pounds = 75, feet =15,inches=45;
		
		double  result= Lab1Utilities.getBMI(pounds, feet, inches);
		double expect = 1.0;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
		
	}
	@Test
	public void test_06_02() {
		int pounds = 80, feet =13,inches=45;
		
		double result= Lab1Utilities.getBMI(pounds, feet, inches);
		double expect = 1.4;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
		
	}
	
	@Test
	public void test_06_03() {
		int pounds = 135, feet =7,inches=45;
		
		
		double result= Lab1Utilities.getBMI(pounds, feet, inches);
		double expect = 5.7;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	
	@Test
	public void test_06_04() {
		int pounds = 105, feet =8,inches=25;
		
		
		double result= Lab1Utilities.getBMI(pounds, feet, inches);
		double expect = 5.04;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	
	@Test
	public void test_07_01() {
		final long[] DEG = { 0, 1, 360, 719, 720, 800, Long.MAX_VALUE };
		final long[] EXP = { 0, 0, 1, 1, 2, 2, 25620477880152155L };
		for (int i = 0; i < DEG.length; i++) {
			long got = Lab1Utilities.numRevolutions(DEG[i]);
			long exp = EXP[i];
			String err = String.format("numRevolutions(%s) failed", DEG[i]);
			assertEquals(err, exp, got);
		}
	}
	
	
	@Test
	public void test_07_02() {
		final long DEG = 719;
		final long EXP = 1;
		
			long got = Lab1Utilities.numRevolutions(DEG);
			long exp = EXP;
			String err = String.format("numRevolutions(%s) failed", DEG);
			assertEquals(err, exp, got);
		}
	
	@Test
	public void test_07_03() {
		final long DEG = 525;
		final long EXP = 1;
		
			long got = Lab1Utilities.numRevolutions(DEG);
			long exp = EXP;
			String err = String.format("numRevolutions(%s) failed", DEG);
			assertEquals(err, exp, got);
		}
	
	
	@Test
	public void test_07_04() {
		final long DEG = 955;
		final long EXP = 2;
		
			long got = Lab1Utilities.numRevolutions(DEG);
			long exp = EXP;
			String err = String.format("numRevolutions(%s) failed", DEG);
			assertEquals(err, exp, got);
		}
	
	@Test
	public void test_08_01() {
		final long[] DEG = { 0, 1, 359, 360, 700, 720, 725 };
		final int[] EXP = { 0, 1, 359, 0, 340, 0, 5 };
		for (int i = 0; i < DEG.length; i++) {
			int got = (int)Lab1Utilities.fixAngle(DEG[i]);
			int exp = EXP[i];
			String err = String.format("fixAngle(%s) failed", DEG[i]);
			assertEquals(err, exp, got);
		}
	}
	
	@Test
	public void test_08_02() {
		final long DEG = 725;
		final int EXP = 5;
		
			int got = (int)Lab1Utilities.fixAngle(DEG);
			int exp = EXP;
			String err = String.format("fixAngle(%s) failed", DEG);
			assertEquals(err, exp, got);
		}
	

	@Test
	public void test_08_03() {
		final long DEG = 525;
		final int EXP = 165;
		
			int got = (int)Lab1Utilities.fixAngle(DEG);
			int exp = EXP;
			String err = String.format("fixAngle(%s) failed", DEG);
			assertEquals(err, exp, got);
		}
	
	@Test
	public void test_08_04() {
		final long DEG = 940;
		final int EXP = 220;
		
			int got = (int)Lab1Utilities.fixAngle(DEG);
			int exp = EXP;
			String err = String.format("fixAngle(%s) failed", DEG);
			assertEquals(err, exp, got);
		}
	
	
	@Test
	public void test_09_01() {
		final int A = 0;
		final int B = 1;
		final int C = Integer.MAX_VALUE-150;
		int a = A;
		int b = B;
		int c = C;
		String exp = "Average of (0, 1, 2147483497) is 715827832.67";
		String error = String.format("avg(%d, %d, %d) failed", a, b, c);
		assertEquals(error, exp, Lab1Utilities.avg(a, b, c));
		
	}

	@Test
	public void test_09_02() {
		final int A = 0;
		final int B = 150;
		final int C = Integer.MAX_VALUE-150;
		
		int a = A;
		int b = B;
		int c = C;
		String exp = "Average of (0, 150, 2147483497) is 715827882.33";
		String error = String.format("avg(%d, %d, %d) failed", a, b, c);
		assertEquals(error, exp, Lab1Utilities.avg(a, b, c));
		
	}
	@Test
	public void test_09_03() {
		final int A = -100;
		final int B = -103;
		final int C = -101;
		
		int a = A;
		int b = B;
		int c = C;
		String exp = "Average of (-100, -103, -101) is -101.33";
		String error = String.format("avg(%d, %d, %d) failed", a, b, c);
		assertEquals(error, exp, Lab1Utilities.avg(a, b, c));
		
	}

}
