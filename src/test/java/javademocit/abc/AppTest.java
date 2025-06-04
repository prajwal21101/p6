package javademocit.abc;
import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    private App app;
    public AppTest( String testName )
    {
        super( testName );
        this.app=new App();
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
    public void testfact0() {
    	assertEquals("Factorial of 0 must be 1",1, this.app.calculatefactorial(0));
    }
    public void testfact5() {
    	assertEquals("Factorial of 5 must be 120",120, this.app.calculatefactorial(5));
    }
}