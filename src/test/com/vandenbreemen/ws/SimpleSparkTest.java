package com.vandenbreemen.ws;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Validate the {@link SimpleSpark}
 */
public class SimpleSparkTest {

    private SimpleSpark simpleSpark;

    @BeforeTest
    public void setup(){
        simpleSpark = new SimpleSpark();
    }

    @Test
    public void sanityTestSimpleSparkSet(){
        simpleSpark.setMessage("Hello world");
        Assert.assertEquals(simpleSpark.getMessage(), "Hello world", "Should have set the message");
    }

}
