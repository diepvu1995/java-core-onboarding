package onboarding;

import java.util.Arrays;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import onboarding.collection.CollectionUtilsLambda;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    CollectionUtilsLambda lambda;

    public void testFind6_true() {
        Assert.assertEquals(true, lambda.find6(Arrays.asList(1, 2, 3, 4, 6)));
    }
}
