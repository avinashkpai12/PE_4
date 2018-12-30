package com.stackroute.practcice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {

    private static ReplaceChar replaceChar;

    @Before
    public void setUp() throws Exception {
        replaceChar = new ReplaceChar();
    }

    @After
    public void tearDown() throws Exception {
        replaceChar = null;
    }


    @Test
    public void testReplaceChar() throws Exception{
        assertEquals("faity fry", replaceChar.replace("daily dry"));

    }
}