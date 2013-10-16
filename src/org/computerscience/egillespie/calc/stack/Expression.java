package org.computerscience.egillespie.calc.stack;

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

        public Builder constant(int value) {
            expression.push(new Constant(value));
            return this;
        }

        public Builder divide() {
            expression.push(Division.INSTANCE);
            return this;
        }

        public Builder multiply() {
            expression.push(Multiplication.INSTANCE);
            return this;
        }

        public Builder add() {
            expression.push(Addition.INSTANCE);
            return this;
        }

        public Builder subtract() {
            expression.push(Subtraction.INSTANCE);
            return this;
        }
    }
}
