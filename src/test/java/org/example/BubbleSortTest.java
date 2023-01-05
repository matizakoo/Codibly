package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    @DisplayName("100,200,300,450,500,700 - 700,500,300,450,200,100")
    public void testSort1() {
        BubbleSort sorter = new BubbleSort();
        List<Integer> input = Arrays.asList(700,500,300,450,200,100);
        List<Integer> expectedOutput1 = Arrays.asList(100,200,300,450,500,700);
        assertEquals(expectedOutput1, sorter.sort(input));
    }

    @Test
    @DisplayName("4,8,13,31,31,33,75 - 31,33,13,31,75,4,8")
    public void testSort2() {
        BubbleSort sorter = new BubbleSort();
        List<Integer> input = Arrays.asList(31,33,13,31,75,4,8);
        List<Integer> expectedOutput1 = Arrays.asList(4,8,13,31,31,33,75);
        assertEquals(expectedOutput1, sorter.sort(input));
    }

    @Test
    @DisplayName("3,7,8 - 7,8,3")
    public void testSort3() {
        BubbleSort sorter = new BubbleSort();
        List<Integer> input = Arrays.asList(7,8,3);
        List<Integer> expectedOutput1 = Arrays.asList(3,7,8);
        assertEquals(expectedOutput1, sorter.sort(input));
    }

    @Test
    @DisplayName("RuntimeException")
    public void testSort4() {
        BubbleSort sorter = new BubbleSort();
        try{
            List<Integer> input = Arrays.asList(null, 213);
            sorter.sort(input);
        }catch (RuntimeException e) {
            assertEquals("null", e.getMessage());
        }
    }


}