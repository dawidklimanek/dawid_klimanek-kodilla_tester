package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    public static List<User> newUserList() {

        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Leo", 10, 20, "Carrot"));
        usersList.add(new User("Gołąb", 20, 10, "Mysz"));
        usersList.add(new User("Baran", 22, 220, "Kopyta"));
        return usersList;
    }

    @Test
    void averageAboveForty() {
        double result = ForumStats.averageAboveForty(ForumStatsTest.newUserList(), 40);
        assertEquals(10.00, result);
    }

    @Test
    void averageBelowForty() {
        double result = ForumStats.averageBelowForty(ForumStatsTest.newUserList(), 40);
        assertEquals(1050.00, result);
    }
}