package BinaryNumberSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Task1Test {
    private Task1 task;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        task = new Task1();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @org.junit.jupiter.api.Test
    void doubleToBynary() {
        assertEquals(".11", task.doubleToBynary(0.75));
        assertEquals("error", task.doubleToBynary(2));
        assertEquals("error", task.doubleToBynary(-1));
        assertEquals("error", task.doubleToBynary(0.1));
        //assertEquals(".12", task.doubleToBynary(0.75));
    }
}