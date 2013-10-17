package org.computerscience.egillespie.calc.stack.operator.binary;

import org.computerscience.egillespie.calc.stack.Expression;
import org.computerscience.egillespie.calc.stack.Symbol;

public abstract class BinaryOperator implements Symbol {

    public abstract int operate(int left, int right);

    @Override
    public int evaluate(Expression remainingExpression) {
        return operate(remainingExpression.evaluate(), remainingExpression.evaluate());
    }
}
