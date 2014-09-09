package de.kreutter;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by stefan on 09/09/14.
 */
public class HelloWorldTest {

    @Test
    public void test() {

        HelloWorld.main(new String[]{});

        assertTrue("Success guaranteed.", true);

    }
}
