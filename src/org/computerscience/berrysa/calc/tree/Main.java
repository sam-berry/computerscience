package org.computerscience.berrysa.calc.tree;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author berrysa
 */
public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        for (int i = 0; i < 1000000000; i++) {
            i++;
        }

        System.out.println("Time: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
