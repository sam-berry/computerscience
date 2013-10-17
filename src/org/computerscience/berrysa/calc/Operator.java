package org.computerscience.berrysa.calc;

/**
 * @author berrysa
 */
public interface Operator {
    int apply(int left, int right);
    String value();
}
