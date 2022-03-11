package com.ibm.calculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void calTest(){
        assertEquals("error in add()", 3, Calculator.add(1,2));
        assertEquals("error in add()", -3, Calculator.add(-1,-2));
        assertEquals("error in add()", 9, Calculator.add(9,0));
    }
    public void calcTestAddFail(){
        assertEquals("error in add()", 0, Calculator.add(1,2));
    }

}
