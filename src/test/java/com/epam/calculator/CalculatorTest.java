package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        Assert.assertEquals(3,result);

    }

    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, -2);

        //then
        Assert.assertEquals(-3,result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(2, 2);

        //then
        Assert.assertEquals(4,result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(-2, -2);

        //then
        Assert.assertEquals(4,result);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(4,2);

        //then
        Assert.assertEquals(2,result);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(-4,-2);

        //then
        Assert.assertEquals(-2,result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(4, 2);

        //then
        Assert.assertEquals(2,result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(-4, -2);

        //then
        Assert.assertEquals(2,result);
    }

}
