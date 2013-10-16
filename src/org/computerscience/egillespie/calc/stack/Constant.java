package org.computerscience.egillespie.calc.stack;

public class Constant implements Symbol {
    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(Expression remainingExpression) {
        return value;
    }
}
