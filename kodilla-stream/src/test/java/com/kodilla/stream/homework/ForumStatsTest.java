package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {


    @Test
    void averageAboveForty() {
        double result = ForumStats.getAverageAboveForty();
        assertEquals(2.25, result);
    }

    @Test
    void averageBelowForty() {
        double result = ForumStats.getAverageBelowForty();
        assertEquals(2382.00, result);
    }
}