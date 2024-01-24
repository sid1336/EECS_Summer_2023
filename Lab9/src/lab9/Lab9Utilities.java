package lab9;

// You are NOT allowed to add any "import" statement other 
// than the ones already in the starter files. 
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab9Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY

	private Lab9Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	/**
	 * Implement the method below, which takes a stack of integers as an input
	 * argument and returns the input stack in reverse order.
	 * <p>
	 * You should not use any additional data structures apart from the provided
	 * Stack and Queue.
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if stack = (Bottom to Top) [9, 10, 3, 4, 3] then return  (Bottom to Top) [3, 4, 3, 10, 9]
	 * if stack = (Bottom to Top) [1, 6, 1] then return  (Bottom to Top) [1, 6, 1]
	 * if stack = (Bottom to Top) [4, 24, 46, 0] then return  (Bottom to Top) [0, 46, 24, 4]
	 * </pre>
	 * 
	 * @param stack input stack
	 */

	public static void reverseStack(Stack<Integer> stack) {
		/*
		 * Your implementation of this method starts here. Recall that : 1. No
		 * System.out.println statements should appear here. Instead, you need to return
		 * the result. 2. No Scanner operations should appear here (e.g.,
		 * input.nextInt()). Instead, refer to the input parameters of this method.
		 */
		 Queue<Integer> queue = new LinkedList<>();

	        // Remove elements from the stack and add them to the queue
	        while (!stack.isEmpty()) {
	            queue.add(stack.pop());
	        }

	        // Add elements back to the stack in reverse order
	        while (!queue.isEmpty()) {
	            stack.push(queue.remove());
	        }


	}

	/**
	 * Implement the method below, which takes a queue of integers as an input
	 * argument and returns a new queue with the elements reversed.
	 * 
	 * <p>
	 * The original input Queue should remain unchanged.
	 * </p>
	 * <p>
	 * You should not use any additional data structures apart from the provided
	 * Stack and Queue.
	 * </p>
	 *
	 * 
	 *  * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if queue = (front to back) [50, 65, 92, 93]  
	 * then return  (front to back) [93, 92, 65, 50]
	 * 
	 * if queue = (front to back) [49, 95, 8, 14, 57, 68, 1, 92]  
	 * then return  (front to back) [92, 1, 68, 57, 14, 8, 95, 49]
	 * 
	 * if queue = (front to back) [49, 14, 44, 67, 55] 
	 * then return  (front to back) [55, 67, 44, 14, 49]
	 * </pre>
	 * @param queue input queue should be unchanged 
	 * @return queue a new queue with the elements reversed based on input queue
	 */
	public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // Create a copy of the input queue
        Queue<Integer> copyQueue = new LinkedList<>(queue);

        // Create a Stack to store elements in reverse order
        Stack<Integer> stack = new Stack<>();

        // Remove elements from the copy queue and add them to the stack
        while (!copyQueue.isEmpty()) {
            stack.push(copyQueue.remove());
        }

        // Create a new Queue to store the reversed elements
        Queue<Integer> reversedQueue = new LinkedList<>();

        // Add elements back to the copy queue in reverse order
        while (!stack.isEmpty()) {
            reversedQueue.add(stack.pop());
        }

        return reversedQueue; // Return the reversed queue
    }

	/**
	 * Implement the method below, which takes a queue of integers as an input
	 * argument and returns the input queue's average values. Note that the content
	 * of the queue should remain unchanged
	 * <p>
	 * The returned value should be rounded to two decimals.
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * If queue= (front to back) [74, 29, 12], then return 38.33
	 * If queue= (front to back) [48, 90, 90, 42, 51], then return 64.2
	 * If queue= (front to back) [32, 77, 30, 21, 24, 76, 2], then return 37.43
	 * </pre>
	 * 
	 * @param queue input queue of any size
	 * @return the average value, see the above examples
	 */

	public static double avgQueue(Queue<Integer> queue) {
		if (queue.isEmpty()) {
            return 0.0; // Return 0.0 for an empty queue to avoid division by zero
        }

        int sum = 0;
        int count = 0;

        // Calculate the sum and count of elements in the queue
        for (int element : queue) {
            sum += element;
            count++;
        }

        // Calculate the average and round to two decimal places
        double average = (double) sum / count;
        return Math.round(average * 100.0) / 100.0;
	}

	/**
	 * Implement the method below, which takes a stack of integers as an input
	 * argument and returns the input stack's average values. Note that the content
	 * of the stack should remain unchanged
	 * <p>
	 * The returned value should be rounded to two decimals.
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if stack = (Bottom to Top) [49, 42, 37], then return 37.0
	 * If stack = (Bottom to Top) [29, 9, 98, 2, 95, 25, 41], then return 42.71
	 * If stack = (Bottom to Top) [6, 73, 71, 91, 57], then return 59.6
	 * </pre>
	 * 
	 * @param stk input stack of integer
	 * @return return the average of stack, see the above examples
	 */

	public static double avgStack(Stack<Integer> stk) {
		if (stk.isEmpty()) {
            return 0.0; // Return 0.0 for an empty stack to avoid division by zero
        }

        Stack<Integer> tempStack = new Stack<>();
        int sum = 0;
        int count = 0;

        // Calculate the sum and count of elements in the stack while preserving the original stack
        while (!stk.isEmpty()) {
            int element = stk.pop();
            sum += element;
            count++;
            tempStack.push(element);
        }

        // Restore the original stack from the temporary stack
        while (!tempStack.isEmpty()) {
            stk.push(tempStack.pop());
        }

        // Calculate the average and round to two decimal places
        double average = (double) sum / count;
        return Math.round(average * 100.0) / 100.0;
    }

	/**
	 * Implement the method below, which compares two Integer stacks for a parity
	 * pattern. In mathematics, parity is the property of an integer, whether it is
	 * even or odd. The parity of an integer is its attribute of being even or odd.
	 * Thus, it can be said that 6 and 14 have the same parity (since both are
	 * even), whereas 7 and 12 have opposite parity (since 7 is odd and 12 is even).
	 * In other words, we want to test whether two stacks have even numbers and odd
	 * numbers in the same positions. To be considered equivalent, we will also
	 * require that the stacks have the same size. Note that the content of the
	 * stacks should remain unchanged
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *  If s1  = [1,  2, 3,  4, 5, 7,  9,  11] 
	 *  and s2 = [13, 4, 17, 8, 1, 91, 81, 71], return true.
	 *  
	 *  If s1 = [74, 29, 12], and s2 = [76, 26, 12], return false.
	 * </pre>
	 * 
	 * @param s1 input stack of integers
	 * @param s2 input stack of integers
	 * @return boolean see the above examples
	 */
	public static boolean compareStacks(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false; // Stacks must have the same size to be considered equivalent
        }

        Stack<Integer> tempStack1 = new Stack<>();
        Stack<Integer> tempStack2 = new Stack<>();
        boolean isEquivalent = true;

        // Copy the elements of s1 and s2 to tempStack1 and tempStack2
        tempStack1.addAll(s1);
        tempStack2.addAll(s2);

        // Compare the elements in corresponding positions of both stacks
        while (!tempStack1.isEmpty()) {
            int num1 = tempStack1.pop();
            int num2 = tempStack2.pop();

            if ((num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 != 0 && num2 % 2 != 0)) {
                // If both numbers have the same parity (both even or both odd), continue
            } else {
                isEquivalent = false; // If numbers have different parity, stacks are not equivalent
                break;
            }
        }

        return isEquivalent;
    }
}



