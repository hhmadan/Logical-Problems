package logicalprograms;

import java.time.Instant;
import java.util.Scanner;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press a number-key to START Stopwatch...");
        int watch = sc.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.println("STARTED..!");

        System.out.println("Press a number-key to STOP Stopwatch...");
        watch = sc.nextInt();
        long stopTime = System.currentTimeMillis();
        System.out.println("STOPPED..!");
        elapseCount(startTime, stopTime);
    }
    public static void elapseCount(long startTime, long stopTime) {
        double elapse = stopTime - startTime;
        double time = elapse;
        System.out.println("Time elapsed is: " + time + " milli Seconds");
        double time1 = elapse / 1000;
        System.out.println("Time elapsed is: " + time1 + " seconds");
    }
}
//public static void main(String[] args) throws InterruptedException
//{
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Press a number-key to START Stopwatch...");
//    int n1 = sc.nextInt();
//    Instant start = Instant.now();
//
//
//    System.out.println("Press a number-key to STOP Stopwatch...");
//    int n2 = sc.nextInt();
//
//    Instant end = Instant.now();
//
//    Duration interval = Duration.between(start, end);
//
//    System.out.println("Execution time in seconds: " + interval.getSeconds());
//}
//}
