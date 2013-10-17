package org.computerscience.berrysa.calc.stack;

import java.util.Stack;

/**
 * @author berrysa
 */
public class Calculator {
    public static int calculate(Stack<Node> stack) {
        Node top = stack.pop();
        if (top.operator == null) {
            return top.value;
        }

        int left = calculate(stack);
        int right = calculate(stack);

        return top.operator.apply(left, right);
    }

    public static String determineExpression(Stack<Node> stack, StringBuilder sb) {
        Node top = stack.pop();
        if (stack.peek() == null) {
            return top.operator.value();
        }
    }
}
