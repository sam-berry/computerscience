import java.util.Stack;

/**
 * @author berrysa
 */
public class Main {

    // todo - create an Operator enum. Add apply e.g: top.operator.apply(left, right) orrrr
    // todo - have the apply method take the stack and do the calculation of left and right inside the method
    private static class Node {
        public String operator;
        public int value;

        public static Node of(String operator) {
            Node node = new Node();
            node.operator = operator;
            return node;
        }

        public static Node of(int value) {
            Node node = new Node();
            node.value = value;
            return node;
        }
    }

    private static int calculate(Stack<Node> stack) {
        Node top = stack.pop();
        if (top.operator == null) {
            return top.value;
        }

        int left = calculate(stack);
        int right = calculate(stack);

        if ("+".equals(top.operator)) {
            return left + right;
        }
        if ("-".equals(top.operator)) {
            return left - right;
        }
        if ("*".equals(top.operator)) {
            return left * right;
        }
        if ("/".equals(top.operator)) {
            return left / right;
        }


        return 0;
    }

    public static void main(String[] args) {
        Stack<Node> stack = new Stack<Node>();

        stack.push(Node.of(2));
        stack.push(Node.of(4));
        stack.push(Node.of("/"));
        stack.push(Node.of(3));
        stack.push(Node.of(1));
        stack.push(Node.of("+"));
        stack.push(Node.of("-"));
        stack.push(Node.of(1));
        stack.push(Node.of(7));
        stack.push(Node.of(9));
        stack.push(Node.of("*"));
        stack.push(Node.of("-"));
        stack.push(Node.of("+"));

        int total = calculate(stack);

        System.out.println("Result = " + total);
    }

}
