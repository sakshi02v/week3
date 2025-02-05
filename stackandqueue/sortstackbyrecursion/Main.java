package stackandqueue.sortstackbyrecursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

import static stackandqueue.sortstackbyrecursion.sortStack.sortingStack;


public class Main {
        public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(19);
        stack.push(12);
        stack.push(21);
        stack.push(1);

        sortingStack(stack);
        System.out.println("sorted stack:"+stack);

    }
}