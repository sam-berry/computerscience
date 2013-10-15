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
}
