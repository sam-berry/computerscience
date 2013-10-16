package org.computerscience.egillespie.calc.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testLargeArithmeticStack() {
        Expression expression = Expression.builder()
                .constant(2)
                .constant(4)
                .divide()
                .constant(3)
                .constant(1)
                .add()
                .subtract()
                .constant(1)
                .constant(7)
                .constant(9)
                .multiply()
                .subtract()
                .add()
                .build();

        int total = expression.evaluate();

        assertEquals(64, total);
    }
}
