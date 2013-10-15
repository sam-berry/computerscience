/**
 * @author berrysa
 */
public enum Operator {
    PLUS {
        public int apply(int left, int right) {
            return left + right;
        }
    },
    MINUS {
        public int apply(int left, int right) {
            return left - right;
        }
    },
    MULTIPLY {
        public int apply(int left, int right) {
            return left * right;
        }
    },
    DIVIDE {
        public int apply(int left, int right) {
            return left / right;
        }
    };

    public abstract int apply(int left, int right);
}
