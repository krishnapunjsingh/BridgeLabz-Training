package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceUtilsTest {

    PerformanceUtils performanceUtils = new PerformanceUtils();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException {
        performanceUtils.longRunningTask();
    }
}
