package com.ibm.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyFirstTestCase {
    @Test
    public void test()
    {
        System.out.println("test");
        ClassToTest ctt = new ClassToTest();
        assertEquals(true, ctt.methodTotest());
    }
}
