import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author berrysa
 */
public class Main {

    // todo: should clean up the project so the jdk isn't committed and recreate the project to be file-based instead of directory based and put the project file in /computerscience instead of /computerscience/stack-calc


    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        for (int i = 0; i < 1000000000; i++) {
            i++;
        }

        System.out.println("Time: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
