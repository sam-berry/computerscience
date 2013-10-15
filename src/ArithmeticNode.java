/**
 * @author berrysa
 */
public class ArithmeticNode {
    public Operator operator;
    public int value;

    public static ArithmeticNode of(Operator operator) {
        ArithmeticNode arithmeticNode = new ArithmeticNode();
        arithmeticNode.operator = operator;
        return arithmeticNode;
    }

    public static ArithmeticNode of(int value) {
        ArithmeticNode arithmeticNode = new ArithmeticNode();
        arithmeticNode.value = value;
        return arithmeticNode;
    }
}