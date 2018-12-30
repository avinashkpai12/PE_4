package com.stackroute.practcice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    private static  StringTranspose stringTranspose;

    @Before
    public void setUp() throws Exception {
        stringTranspose = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose = null;
    }

    @Test
    public void testStringTranspose() throws Exception{
        String expectedValue = "a kciuq nworb xof spmuj revo eht yzal god";

        assertEquals(expectedValue, stringTranspose.transpose("a quick brown fox jumps over the lazy dog"));
    }
}