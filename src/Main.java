import java.util.Stack;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        Stack<ArithmeticNode> stack = new Stack<ArithmeticNode>();

        stack.push(ArithmeticNode.of(2));
        stack.push(ArithmeticNode.of(4));
        stack.push(ArithmeticNode.of(Operator.DIVIDE));
        stack.push(ArithmeticNode.of(3));
        stack.push(ArithmeticNode.of(1));
        stack.push(ArithmeticNode.of(Operator.PLUS));
        stack.push(ArithmeticNode.of(Operator.MINUS));
        stack.push(ArithmeticNode.of(1));
        stack.push(ArithmeticNode.of(7));
        stack.push(ArithmeticNode.of(9));
        stack.push(ArithmeticNode.of(Operator.MULTIPLY));
        stack.push(ArithmeticNode.of(Operator.MINUS));
        stack.push(ArithmeticNode.of(Operator.PLUS));

        int total = ArithmeticStackCalculator.calculate(stack);

        System.out.println("Result = " + total);
    }

}
