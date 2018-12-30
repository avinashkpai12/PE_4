package com.stackroute.practcice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceTest {

    private static  Occurrence occur;

    @org.junit.Before
    public void setUp() throws Exception {
        occur = new Occurrence();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        occur = null;
    }

    @Test
    public void testOccurrence() throws Exception{
        int expectedValue = 3;

        assertEquals("check for occurence", expectedValue, occur.countOccurrence("avinashpai",'a', 0));
    }
}