package io.mmcgaha.words;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for Words
 */
public class WordRestTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WordRestTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue(true);
    }
    
    
    
}
