package com.example.junit.junit_testing;

import java.util.concurrent.TimeUnit;

public class PerformanceUtils {

    public String longRunningTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);   // simulates long task (3 seconds)
        return "Done";
    }
}
