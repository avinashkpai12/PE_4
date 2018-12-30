package com.stackroute.practcice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RepetitiveWordsTest {

    private static RepetitiveWords repetitiveWords;

    @Before
    public void setUp() throws Exception {
        repetitiveWords = new RepetitiveWords();
    }

    @After
    public void tearDown() throws Exception {
        repetitiveWords = null;
    }

    @Test
    public void testRepetitiveWords() throws Exception{
        List<IndexWrapper> list = new ArrayList<IndexWrapper>();
        IndexWrapper index = new IndexWrapper( 4, 6);
        list.add(index);
        index = new IndexWrapper(10, 12);
        list.add(index);
        index = new IndexWrapper(27, 29);
        list.add(index);

        assertEquals("not added properly", list.toString(), repetitiveWords.find("She sells seashells by the seashore", "se").toString());

    }
}