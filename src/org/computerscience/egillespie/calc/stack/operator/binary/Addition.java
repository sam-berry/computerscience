package org.computerscience.egillespie.calc.stack.operator.binary;

public class Addition extends BinaryOperator {

    public static final Addition INSTANCE = new Addition();

    private Addition() { }

    @Override
    public int operate(int left, int right) {
        return left + right;
    }
}
