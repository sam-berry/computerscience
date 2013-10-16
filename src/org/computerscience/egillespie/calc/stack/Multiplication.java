package org.computerscience.egillespie.calc.stack;

public class Multiplication extends BinaryOperator {

    public static final Multiplication INSTANCE = new Multiplication();

    private Multiplication() { }

    @Override
    public int operate(int left, int right) {
        return left * right;
    }
}
