package org.computerscience.berrysa.calc;

/**
 * @author berrysa
 */
public enum BinaryOperator implements Operator {
    PLUS {
        public int apply(int left, int right) {
            return left + right;
        }

        public String value() {
            return "+";
        }
    },
    MINUS {
        public int apply(int left, int right) {
            return left - right;
        }

        public String value() {
            return "-";
        }
    },
    MULTIPLY {
        public int apply(int left, int right) {
            return left * right;
        }

        public String value() {
            return "*";
        }
    },
    DIVIDE {
        public int apply(int left, int right) {
            return left / right;
        }

        public String value() {
            return "/";
        }
    }
}
