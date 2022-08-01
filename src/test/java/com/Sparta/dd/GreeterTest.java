package com.Sparta.dd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    @Test
    @DisplayName("This is my first Test")
    void firstTest(){
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Given the time is 21, return Good Evening")
    void givenTheTimeIs21ReturnGoodEvening(){
        int time=21;
        String expected="Good Evening";
        String answer= Greeter.getGreeting(time);
        Assertions.assertEquals(expected,answer);
    }
}
