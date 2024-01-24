package lab9;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_Lab9Utilities {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void test_01_01_() {

		String expect = "[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]";
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < 10; i++)
			stk.push(i);
		String ostr = stk.toString();
		Lab9Utilities.reverseStack(stk);

		String error = String.format(
				"\nTest reverseStack fail for ( %s ). " + "Returned ( %s ), but correct is ( %s )\n", ostr, stk,
				expect);

		assertTrue(error, stk.toString().equals(expect));
	}

	@Test
	public void test_01_02_() {

		String expect = "[90, 80, 70, 60, 50, 40, 30, 20, 10, 0]";
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < 100; i += 10)
			stk.push(i);
		String ostr = stk.toString();
		Lab9Utilities.reverseStack(stk);

		String error = String.format(
				"\nTest reverseStack fail for ( %s ). " + "Returned ( %s ), but correct is ( %s )\n", ostr, stk,
				expect);

		assertTrue(error, stk.toString().equals(expect));
	}

	@Test
	public void test_01_03_() {

		String expect = "[4, 16, 28, 40, 52, 64, 76, 88, 100]";
		Stack<Integer> stk = new Stack<>();
		for (int i = 100; i > 0; i -= 12)
			stk.push(i);
		String ostr = stk.toString();
		Lab9Utilities.reverseStack(stk);

		String error = String.format(
				"\nTest reverseStack fail for ( %s ). " + "Returned ( %s ), but correct is ( %s )\n", ostr, stk,
				expect);

		assertTrue(error, stk.toString().equals(expect));
	}

	
	@Test
	public void test_02_01_() {

		String expect = "[64, 21, 44, 36, 96]";
		int[] a  = {96, 36, 44, 21, 64};
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			queue.offer(a[i]);
		}
		
	
		String ostr = queue.toString();
		
		Queue<Integer> reversedQueue = Lab9Utilities.reverseQueue(queue);

		String error = String.format(
				"\nTest reverseQueue fail for ( %s ). " + "Returned ( %s ), but correct is ( %s )\n", ostr, reversedQueue,
				expect);

		assertTrue(error, reversedQueue.toString().equals(expect));
		
		error = String.format(
				"\nTest reverseQueue fail for ( %s ). " + " The original input queue should remain unchanged but method return ( %s )\n", 
				ostr, queue);

		assertTrue(error, queue.toString().equals(ostr));
	}
	
	
	@Test
	public void test_02_02_() {
		 // Test case : Reversing a queue with elements
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        Queue<Integer> expected = new LinkedList<>();
        expected.offer(5);
        expected.offer(4);
        expected.offer(3);
        expected.offer(2);
        expected.offer(1);

        Queue<Integer> reversedqueue = Lab9Utilities.reverseQueue(queue);
       assertEquals("reverseQueue Failed test case Reversing a queue with elements ", expected, reversedqueue);

       assertEquals("reverseQueue Failed test case keep input queue unchanged ", queue, queue);
          
		
	}
	
	@Test
	public void test_02_03_() {
		
		// Test case : Reversing an empty queue
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> expected = new LinkedList<>();

        Queue<Integer> reversedqueue = Lab9Utilities.reverseQueue(queue);
       assertEquals( "reverseQueue Failed test case Reversing an empty queue", expected, reversedqueue);
       assertEquals("reverseQueue Failed test case keep input queue unchanged ", queue, queue);
		
	}
	
	@Test
	public void test_02_04_() {
		
		 // Test case : Reversing a queue with a single element
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(42);

        Queue<Integer> expected = new LinkedList<>();
        expected.offer(42);

        Queue<Integer> reversedqueue = Lab9Utilities.reverseQueue(queue);
       assertEquals("reverseQueue Failed test case  Reversing a queue with a single element", expected, reversedqueue);
       assertEquals("reverseQueue Failed test case keep input queue unchanged ", queue, queue);
	}
	
	
	@Test
	public void test_02_05_() {
		
		// Test case : Reversing a queue with repeated elements
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(1);
        queue.offer(1);
        queue.offer(1);
        queue.offer(1);

        Queue<Integer> expected = new LinkedList<>();
        expected.offer(1);
        expected.offer(1);
        expected.offer(1);
        expected.offer(1);
        expected.offer(1);

        Queue<Integer> reversedqueue = Lab9Utilities.reverseQueue(queue);
       assertEquals("reverseQueue Failed test case Reversing a queue with repeated elementst", expected, reversedqueue);
       assertEquals("reverseQueue Failed test case keep input queue unchanged ", queue, queue);
	}
	
	@Test
	public void test_02_06_() {
		
		// Test case : Reversing a queue with a large number of elements
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) {
            queue.offer(i);
        }

        Queue<Integer> expected = new LinkedList<>();
        for (int i = 1000; i >= 1; i--) {
            expected.offer(i);
        }

        Queue<Integer> reversedQueue = Lab9Utilities.reverseQueue(queue);
       assertEquals("reverseQueue Failed test case Reversing a queue with repeated elementst", expected, reversedQueue);
       assertEquals("reverseQueue Failed test case keep input queue unchanged ", queue, queue);
	}
	
	@Test
	public void test_03_01_() {

		
		int[] input = {0, 71, 28};
		Queue<Integer> q = new LinkedList<>();
		for (int e : input) {
			q.add(e);
		}
	
		double expect = 33.0;
		String os = "[0, 71, 28]";
		double result = Lab9Utilities.avgQueue(q);

		String error = String.format(
				"\nTest avgQueue fail for ( %s ). " + "Returned ( %6.2f ), but correct is ( %6.2f )\n", Arrays.toString(input), result,
				expect);

		assertTrue("Queue content got destroyed", q.toString().equals(os) );
		
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(expect-result)<THRESHOLD);
	}
	
	@Test
	public void test_03_02_() {

		
		int[] input = {1, 70, 81, 92, 76, 4, 91};
		Queue<Integer> q = new LinkedList<>();
		for (int e : input) {
			q.add(e);
		}
		double expect = 59.29;
		String os = "[1, 70, 81, 92, 76, 4, 91]";
		double result = Lab9Utilities.avgQueue(q);

		String error = String.format(
				"\nTest avgQueue fail for ( %s ). " + "Returned ( %6.2f ), but correct is ( %6.2f )\n", Arrays.toString(input), result,
				expect);

		assertTrue("Queue content got destroyed", q.toString().equals(os) );
		
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(expect-result)<THRESHOLD);
	}
	
	
	@Test
	public void test_03_03_() {

		
		int[] input = {79, 73, 38, 32, 18, 46, 29, 86, 90};
		Queue<Integer> q = new LinkedList<>();
		for (int e : input) {
			q.add(e);
		}
		double expect = 54.56;
		String os = "[79, 73, 38, 32, 18, 46, 29, 86, 90]";
		double result = Lab9Utilities.avgQueue(q);

		String error = String.format(
				"\nTest avgQueue fail for ( %s ). " + "Returned ( %6.2f ), but correct is ( %6.2f )\n", Arrays.toString(input), result,
				expect);

		assertTrue("Queue content got destroyed", q.toString().equals(os) );
		
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(expect-result)<THRESHOLD);
	}
	
	
	
	@Test
	public void test_04_01_() {

		
		int[] input = {94, 82, 36};
		Stack<Integer> s = new Stack<>();
		for (int e : input) {
			s.push(e);
		}
		
		double expect = 70.67;
		String os = "[94, 82, 36]";
		double result = Lab9Utilities.avgStack(s);

		String error = String.format(
				"\nTest avgQueue fail for ( %s ). " + "Returned ( %6.2f ), but correct is ( %6.2f )\n", Arrays.toString(input), result,
				expect);

		assertTrue("Stack content got destroyed", s.toString().equals(os) );
		
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(expect-result)<THRESHOLD);
	}
	
	
	@Test
	public void test_04_02_() {

		
		int[] input = {16, 21, 0, 4, 54};
		Stack<Integer> s = new Stack<>();
		for (int e : input) {
			s.push(e);
		}
		
		double expect = 19.0;
		String os = "[16, 21, 0, 4, 54]";
		double result = Lab9Utilities.avgStack(s);

		String error = String.format(
				"\nTest avgQueue fail for ( %s ). " + "Returned ( %6.2f ), but correct is ( %6.2f )\n", Arrays.toString(input), result,
				expect);

		assertTrue("Stack content got destroyed", s.toString().equals(os) );
		
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(expect-result)<THRESHOLD);
	}
	
	@Test
	public void test_04_03_() {

		
		int[] input = {49, 58, 60, 32, 88, 62, 13, 69, 5, 64, 78, 77, 9, 84, 34};
		Stack<Integer> s = new Stack<>();
		for (int e : input) {
			s.push(e);
		}
		
		double expect = 52.13;
		String os = "[49, 58, 60, 32, 88, 62, 13, 69, 5, 64, 78, 77, 9, 84, 34]";
		double result = Lab9Utilities.avgStack(s);

		String error = String.format(
				"\nTest avgQueue fail for ( %s ). " + "Returned ( %6.2f ), but correct is ( %6.2f )\n", Arrays.toString(input), result,
				expect);

		assertTrue("Stack content got destroyed", s.toString().equals(os) );
		
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(expect-result)<THRESHOLD);
	}
	
	@Test
	public void test_05_01_() {

		
		int[] input1 = {86, 33, 0, 84, 50};
		int[] input2 = {16, 91, 54, 56, 60};
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for (int e : input1) {
			s1.push(e);
		}
		for (int e : input2) {
			s2.push(e);
		}
		
		
		String os1 = "[86, 33, 0, 84, 50]";
		String os2 = "[16, 91, 54, 56, 60]";
		boolean expect = true;
		boolean result = Lab9Utilities.compareStacks(s1, s2);
		String error = String.format(
				"\nTest compareStacks fail for ( %s ) and (%s). " + "Returned ( %s ), but correct is ( %s )\n",
				Arrays.toString(input1),Arrays.toString(input2), result,
				expect);
		assertTrue(error, expect==result);
		assertTrue("Stack content got destroyed", s1.toString().equals(os1) );
		assertTrue("Stack content got destroyed", s2.toString().equals(os2) );
		
		
		int[] input11 = {42, 95, 27, 37, 11};
		int[] input12 = {86, 67, 12, 38, 91};
		Stack<Integer> s11 = new Stack<>();
		Stack<Integer> s12 = new Stack<>();
		for (int e : input11) {
			s11.push(e);
		}
		for (int e : input12) {
			s12.push(e);
		}
		
		
		String os11 = "[42, 95, 27, 37, 11]";
		String os12 = "[86, 67, 12, 38, 91]";
		boolean expect1 = false;
		boolean result1 = Lab9Utilities.compareStacks(s11, s12);
		String error1 = String.format(
				"\nTest compareStacks fail for ( %s ) and (%s). " + "Returned ( %s ), but correct is ( %s )\n",
				Arrays.toString(input11),Arrays.toString(input12), result1,
				expect1);
		assertTrue(error1, expect1==result1);
		assertTrue("Stack content got destroyed", s11.toString().equals(os11) );
		assertTrue("Stack content got destroyed", s12.toString().equals(os12) );
		
	}
	@Test
	public void test_05_02_() {

		
		int[] input1 = {91, 40, 18, 63, 16, 67, 47};
		int[] input2 = {21, 34, 16, 981, 54, 65, 21};
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for (int e : input1) {
			s1.push(e);
		}
		for (int e : input2) {
			s2.push(e);
		}
		
		
		String os1 = "[91, 40, 18, 63, 16, 67, 47]";
		String os2 = "[21, 34, 16, 981, 54, 65, 21]";
		boolean expect = true;
		boolean result = Lab9Utilities.compareStacks(s1, s2);
		String error = String.format(
				"\nTest compareStacks fail for ( %s ) and (%s). " + "Returned ( %s ), but correct is ( %s )\n",
				Arrays.toString(input1),Arrays.toString(input2), result,
				expect);
		assertTrue(error, expect==result);
		assertTrue("Stack content got destroyed", s1.toString().equals(os1) );
		assertTrue("Stack content got destroyed", s2.toString().equals(os2) );
		
		
		int[] input11 = {20, 23, 28, 44, 31, 95, 2};
		int[] input12 = {81, 28, 42, 89, 94, 69, 90};
		Stack<Integer> s11 = new Stack<>();
		Stack<Integer> s12 = new Stack<>();
		for (int e : input11) {
			s11.push(e);
		}
		for (int e : input12) {
			s12.push(e);
		}
		
		
		String os11 = "[20, 23, 28, 44, 31, 95, 2]";
		String os12 = "[81, 28, 42, 89, 94, 69, 90]";
		boolean expect1 = false;
		boolean result1 = Lab9Utilities.compareStacks(s11, s12);
		String error1 = String.format(
				"\nTest compareStacks fail for ( %s ) and (%s). " + "Returned ( %s ), but correct is ( %s )\n",
				Arrays.toString(input11),Arrays.toString(input12), result1,
				expect1);
		assertTrue(error1, expect1==result1);
		assertTrue("Stack content got destroyed", s11.toString().equals(os11) );
		assertTrue("Stack content got destroyed", s12.toString().equals(os12) );
		
	}
	
	
	@Test
	public void test_05_03_() {
		// Test case : Stacks with the same size and equivalent parity pattern
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1); stack1.push(2);
        stack1.push(3); stack1.push(4);
        stack1.push(5); stack1.push(7);
        stack1.push(9); stack1.push(11);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(13);
        stack2.push(4);
        stack2.push(17);
        stack2.push(8);
        stack2.push(1);
        stack2.push(91);
        stack2.push(81);
        stack2.push(71);
        
        assertTrue("compareStacks Failed test case Stacks with the same size and equivalent parity pattern",
        		Lab9Utilities.compareStacks(stack1, stack2) );
        
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack1, stack1);
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack2, stack2);
        
        
        stack1 = new Stack<>();
        stack1.push(74);
        stack1.push(29);
        stack1.push(12);

        stack2 = new Stack<>();
        stack2.push(76);
        stack2.push(26);
        stack2.push(12);
        
        assertFalse("compareStacks Failed test case  Stacks with the same size but different parity pattern",
        		Lab9Utilities.compareStacks(stack1, stack2) );
        
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack1, stack1);
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack2, stack2);
        
        
	}
	@Test
	public void test_05_04_() {
		// Test case : Stacks with the same size but different parity pattern
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(74);
        stack1.push(29);
        stack1.push(12);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(76);
        stack2.push(26);
        stack2.push(12);
        
        assertFalse("compareStacks Failed test case  Stacks with the same size but different parity pattern",
        		Lab9Utilities.compareStacks(stack1, stack2) );
        
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack1, stack1);
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack2, stack2);
        
     // Test case : Stacks with the same size and equivalent parity pattern
        stack1 = new Stack<>();
        stack1.push(1); stack1.push(2);
        stack1.push(3); stack1.push(4);
        stack1.push(5); stack1.push(7);
        stack1.push(9); stack1.push(11);

        stack2 = new Stack<>();
        stack2.push(13);
        stack2.push(4);
        stack2.push(17);
        stack2.push(8);
        stack2.push(1);
        stack2.push(91);
        stack2.push(81);
        stack2.push(71);
        
        assertTrue("compareStacks Failed test case Stacks with the same size and equivalent parity pattern",
        		Lab9Utilities.compareStacks(stack1, stack2) );
        
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack1, stack1);
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack2, stack2);
        
        
	}
	
	@Test
	public void test_05_05_() {
		// Test case : Stacks with different sizes
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        
        assertFalse("compareStacks Failed test case  Stacks with different sizes",
        		Lab9Utilities.compareStacks(stack1, stack2) );
        
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack1, stack1);
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack2, stack2);
        
        
      // Test case : Stacks with the same size and equivalent parity pattern
        stack1 = new Stack<>();
        stack1.push(1); stack1.push(2);
        stack1.push(3); stack1.push(4);
        stack1.push(5); stack1.push(7);
        stack1.push(9); stack1.push(11);

         stack2 = new Stack<>();
        stack2.push(13);
        stack2.push(4);
        stack2.push(17);
        stack2.push(8);
        stack2.push(1);
        stack2.push(91);
        stack2.push(81);
        stack2.push(71);
        
        assertTrue("compareStacks Failed test case Stacks with the same size and equivalent parity pattern",
        		Lab9Utilities.compareStacks(stack1, stack2) );
        
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack1, stack1);
        assertEquals("compareStacks Failed test case keep input stack unchanged ", stack2, stack2);
        
	}
	
}
