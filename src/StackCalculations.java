import java.util.Stack;

/**
 * @author berrysa
 */
public class StackCalculations {
    public static int calculate(Stack<ArithmeticNode> stack) {
        ArithmeticNode top = stack.pop();
        if (top.operator == null) {
            return top.value;
        }

        int left = calculate(stack);
        int right = calculate(stack);

        return top.operator.apply(left, right);
    }
}
