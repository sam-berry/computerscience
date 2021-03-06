package org.computerscience.egillespie.calc.stack.operator.binary;

public class Division extends BinaryOperator {

    public static final Division INSTANCE = new Division();

    private Division() { }

    @Override
    public int operate(int left, int right) {
        return left / right;
    }
}
