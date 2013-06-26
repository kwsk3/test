package test.com.company;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Simple class to build a TestSuite out of the individual test classes.
 */
public class AllJUnitTests extends TestCase {

    public AllJUnitTests(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SkeletonTest.class);
        suite.addTest(new TestSuite(HelloWorldTest.class));
        return suite;
   }
}
