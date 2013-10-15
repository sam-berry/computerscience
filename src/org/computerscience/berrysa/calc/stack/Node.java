package org.computerscience.berrysa.calc.stack;

import org.computerscience.berrysa.calc.Operator;

/**
 * @author berrysa
 */
public class Node {
    public Operator operator;
    public int value;

    public static Node of(Operator operator) {
        Node node = new Node();
        node.operator = operator;
        return node;
    }

    public static Node of(int value) {
        Node node = new Node();
        node.value = value;
        return node;
    }
}
