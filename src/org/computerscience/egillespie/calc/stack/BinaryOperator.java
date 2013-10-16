package org.computerscience.egillespie.calc.stack;

public abstract class BinaryOperator implements Symbol {

    public abstract int operate(int left, int right);

    @Override
    public int evaluate(Expression remainingExpression) {
        return operate(remainingExpression.evaluate(), remainingExpression.evaluate());
    }
}
