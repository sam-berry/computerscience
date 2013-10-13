import java.util.Stack;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        Stack<Node> stack = new Stack<Node>();

        stack.push(Node.of(2));
        stack.push(Node.of(4));
        stack.push(Node.of(Operator.DIVIDE));
        stack.push(Node.of(3));
        stack.push(Node.of(1));
        stack.push(Node.of(Operator.PLUS));
        stack.push(Node.of(Operator.MINUS));
        stack.push(Node.of(1));
        stack.push(Node.of(7));
        stack.push(Node.of(9));
        stack.push(Node.of(Operator.MULTIPLY));
        stack.push(Node.of(Operator.MINUS));
        stack.push(Node.of(Operator.PLUS));

        int total = StackCalculations.calculate(stack);

        System.out.println("Result = " + total);
    }

}
