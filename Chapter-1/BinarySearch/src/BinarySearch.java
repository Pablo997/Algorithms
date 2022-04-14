import utils.Algorithms;
import utils.In;
import utils.StdIn;
import utils.StdOut;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;


public class BinarySearch {

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        Instant start = Instant.now();
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (Algorithms.rank(key, whitelist) < 0) {
                //StdOut.println(key);
            }
        }
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).getSeconds();
        StdOut.println("The elapsed time is: " + timeElapsed);
    }
}
