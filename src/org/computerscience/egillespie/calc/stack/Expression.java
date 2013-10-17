package org.computerscience.egillespie.calc.stack;

import org.computerscience.egillespie.calc.stack.operator.binary.Addition;
import org.computerscience.egillespie.calc.stack.operator.binary.Division;
import org.computerscience.egillespie.calc.stack.operator.binary.Multiplication;
import org.computerscience.egillespie.calc.stack.operator.binary.Subtraction;
import org.computerscience.egillespie.calc.stack.operator.unary.Absolute;
import org.computerscience.egillespie.calc.stack.operator.unary.Decrement;
import org.computerscience.egillespie.calc.stack.operator.unary.Increment;
import org.computerscience.egillespie.calc.stack.operator.unary.Negate;

import java.util.Stack;

public class Expression extends Stack<Symbol> {

    public int evaluate() {
        return pop().evaluate(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Expression expression;

        public Builder() {
            this.expression = new Expression();
        }

        public Expression build() {
            return expression;
        }

        private Builder push(Symbol symbol) {
            expression.push(symbol);
            return this;
        }

        public Builder constant(int value) {
            return push(new Constant(value));
        }

        public Builder divide() {
            return push(Division.INSTANCE);
        }

        public Builder multiply() {
            return push(Multiplication.INSTANCE);
        }

        public Builder add() {
            return push(Addition.INSTANCE);
        }

        public Builder subtract() {
            return push(Subtraction.INSTANCE);
        }

        public Builder abs() {
            return push(Absolute.INSTANCE);
        }

        public Builder negate() {
            return push(Negate.INSTANCE);
        }

        public Builder increment() {
            return push(Increment.INSTANCE);
        }

        public Builder decrement() {
            return push(Decrement.INSTANCE);
        }
    }
}
