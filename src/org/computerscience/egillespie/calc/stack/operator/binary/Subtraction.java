package org.computerscience.egillespie.calc.stack.operator.binary;

public class Subtraction extends BinaryOperator {

    public static final Subtraction INSTANCE = new Subtraction();

    private Subtraction() { }

    @Override
    public int operate(int left, int right) {
        return left - right;
    }
}
