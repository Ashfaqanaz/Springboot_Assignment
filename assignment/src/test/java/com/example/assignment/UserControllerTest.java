package com.example.assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserControllerAPI userController;


    @Test
    public void testReverseWord() {
        String word = "hello";
        String reversed = userController.reverse(word);
        assertEquals("olleh", reversed);
    }

    @Test
    public void testDisplayMessage() {
        String testMsg = "Hello";
        String actualMsg = userController.displayMessage();
        assertEquals(testMsg, actualMsg);
    }
}
