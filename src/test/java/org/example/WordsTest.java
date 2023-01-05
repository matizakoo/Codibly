package org.example;

import jdk.jshell.spi.ExecutionControlProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    @Test
    @DisplayName("28 - aabbabcccba")
    public void testCountTest() throws Exception {
        Words counter = new Words();
        assertEquals(28, counter.count("aabbabcccba"));
    }

    @Test
    @DisplayName("empty word")
    public void emptyWordTest() throws Exception{
        Words counter = new Words();
        assertEquals(0, counter.count(""));
    }

    @Test
    public void invalidWordTest() throws Exception {
        Words counter = new Words();
        try{
            counter.count("abababa1");
        }catch (Exception e){
            assertEquals("Only letters", e.getMessage());
        }
    }

    @Test
    public void nullWordTest() throws Exception {
        Words counter = new Words();
        try{
            counter.count(null);
        }catch (Exception e){
            assertEquals("null", e.getMessage());
        }
    }
}