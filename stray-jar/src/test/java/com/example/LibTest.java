package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Lib.
 */
public class LibTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LibTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LibTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testLib()
    {
        assertEquals(Lib.getMessage(), "Hello, World!");
    }
}
