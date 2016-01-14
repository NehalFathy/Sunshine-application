package com.example.android.sunshine.app.data;

import android.test.AndroidTestCase;

public class TestPractice extends AndroidTestCase {
    /*
        This gets run before every test.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    //can implement new methods but prefixed with test
    //to see if program applies correct output
    public void testThatDemonstratesAssertions() throws Throwable {
        int a = 5;
        int b = 3;
        int c = 5;
        int d = 10;

        //assertEquals( message, int expected, int actual)
        assertEquals("X should be equal", a, c);
        //assertTrue(String message, boolean condition)
        assertTrue("Y should be true", d > a);
        //assertFalse(String message, boolean condition)
        assertFalse("Z should be false", a == b);

        if (b > d) {
            fail("XX should never happen");
        }
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
