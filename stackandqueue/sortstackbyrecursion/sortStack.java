package stackandqueue.sortstackbyrecursion;

import java.util.Stack;

public class sortStack {
    // Function to sort the stack using recursion
    public static void sortingStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {

            int temp = stack.pop();

            sortingStack(stack);

            insertInSortedOrder(stack, temp);
        }
    }
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // Base Case: If stack is empty or top element is smaller than the element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(temp);
    }
}
