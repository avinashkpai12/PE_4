package com.stackroute.practcice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexFindTest {

    private static RegexFind regexFind;

    @Before
    public void setUp() throws Exception {
        regexFind = new RegexFind();
    }

    @After
    public void tearDown() throws Exception {
        regexFind = null;
    }

    @Test
    public void testRegexFind() throws Exception{
        assertEquals(true, regexFind.verifyRegex("This is Harry"));
        assertEquals(false, regexFind.verifyRegex("This is Henry"));
    }
}