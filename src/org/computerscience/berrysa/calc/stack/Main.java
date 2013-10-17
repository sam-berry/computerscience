package org.computerscience.berrysa.calc.stack;

import org.computerscience.berrysa.calc.BinaryOperator;

import java.util.Stack;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        Stack<Node> stack = new Stack<Node>();

        stack.push(Node.of(2));
        stack.push(Node.of(4));
        stack.push(Node.of(BinaryOperator.DIVIDE));
        stack.push(Node.of(3));
        stack.push(Node.of(1));
        stack.push(Node.of(BinaryOperator.PLUS));
        stack.push(Node.of(BinaryOperator.MINUS));
        stack.push(Node.of(1));
        stack.push(Node.of(7));
        stack.push(Node.of(9));
        stack.push(Node.of(BinaryOperator.MULTIPLY));
        stack.push(Node.of(BinaryOperator.MINUS));
        stack.push(Node.of(BinaryOperator.PLUS));

        int total = Calculator.calculate(stack);

        System.out.println("Result = " + total); //todo: print out expression
    }

}
