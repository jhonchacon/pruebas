package co.com.calculadora;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

	/**
	 * Unit test for simple App.
	 */
	public class TestCalculadora 
	    extends TestCase
	    
	{
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public TestCalculadora( String testName )
	    {
	        super( testName );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( TestCalculadora.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	        assertTrue( false );
	    }
}
